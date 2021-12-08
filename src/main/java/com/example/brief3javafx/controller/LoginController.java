package com.example.brief3javafx.controller;
import com.example.brief3javafx.Implements.EmployeeImpl;
import com.example.brief3javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginController {
    @FXML
    private Label invalideLabel;
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
        boolean res = new EmployeeImpl().logged(email.getText(),password.getText());
        if(res) {

            try {

                Stage stage = new Stage();
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("newClient.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 980, 620);
                stage.setTitle("Add Clients !");
                stage.setScene(scene);
                stage.show();
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            catch (IOException e) {
                e.printStackTrace();
            }




        }
        else{
          invalideLabel.setVisible(true);
        }
    }

    private boolean isEmail(String input){
        return  input.matches("[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]{2,3}+");
    }



}
