package com.example.brief3javafx.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class LoginController {

    @FXML
    private PasswordField password;

    @FXML
    private TextField email;

    @FXML
    private Label emailalert;

    @FXML
    private Label passwordalert;

    @FXML
    private void clickLogin(ActionEvent event) {

        if(isEmail(email.getText())){
            //new Alert(Alert.AlertType.CONFIRMATION,"EmailValide", ButtonType.OK);
            emailalert.setVisible(false);
        }
        else{
           // new Alert(Alert.AlertType.ERROR,"Invalid email format !!", ButtonType.CLOSE);
            emailalert.setVisible(true);
        }
        if(password.getText().trim().isEmpty()){
            passwordalert.setVisible(true);
        }else {
            passwordalert.setVisible(false);
        }
    }

    private boolean isEmail(String input){
        return  input.matches("[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]{2,3}+");
    }



}
