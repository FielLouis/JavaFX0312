package com.example.javafx0312;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FXMLExampleController {
    public GridPane pnLogIn;
    public AnchorPane pnMain;
    public VBox pnHome;

    public TextField username;
    public PasswordField password;

    public String user1 = "Fiel";
    public String pass1 = "fiel1234";

    public String user2 = "Dechie";
    public String pass2 = "dech1234";

    public String user3 = "Summer";
    public String pass3 = "summer1234";
    @FXML
    private Text actiontarget;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent e) {
        actiontarget.setText("Sign in button pressed");
    }


    @FXML
    protected void onSignInClick() throws IOException {
        String user = username.getText();
        String passwordE = password.getText();

        Parent root = FXMLLoader.load(FXMLExample.class.getResource("home_view.fxml"));

        if(user.equals(user1) && passwordE.equals(pass1) || user.equals(user2) && passwordE.equals(pass2) || user.equals(user3) && passwordE.equals(pass3)) {
            AnchorPane p = (AnchorPane) pnLogIn.getParent();
            p.getChildren().remove(pnLogIn);
            p.getChildren().add(root);
        } else {
            actiontarget.setText("Account not found!");
        }

    }

    @FXML
    protected void onLogOutClick() throws IOException {
        Parent root = FXMLLoader.load(FXMLExample.class.getResource("login_view.fxml"));

//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter(getClass().getResource("hello.css").getPath()));
//        } catch(IOException e){
//            e.printStackTrace();
//        }

        AnchorPane p = (AnchorPane) pnHome.getParent();
        p.getChildren().remove(pnHome);
        p.getChildren().add(root);
    }
}