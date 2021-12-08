package com.example.brief3javafx.controller;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

public class NewClientController {
    @FXML
    private TextField passport;
    @FXML
    private Label regexPhone;

    @FXML
    private TextField cin;
    @FXML
    private DatePicker date;

    @FXML
    private TextField compagny;

    @FXML
    private TextField badge;

    @FXML
    private TextField number;

    @FXML
    private TextArea adress;

    @FXML
    private TextField firdtname;

    @FXML
    private TextField email;

    @FXML
    private TextField lastname;

    @FXML
    void radioButtonPass(ActionEvent event) {
        cin.setVisible(false);
        passport.setVisible(true);
    }

    @FXML
    void radioButtonCin(ActionEvent event) {
        cin.setVisible(true);
        passport.setVisible(false);
    }

    private boolean isEmail(String input){
        return  input.matches("[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]{2,3}+");
    }
    private boolean max50(String input){
       if(input.length()>50) {
           return  false;
       }
       else {
           return  true;
       }
    }
    private boolean tenChar(String input){
        if(input.length()==10) {
            return  true;
        }
        else {
            return  false;
        }
    }
    private boolean isPhone(String input){
        return  input.matches( "^[0-9]{9}$");
    }

    @FXML
    void clear(ActionEvent event) {
badge.clear();
cin.clear();
firdtname.clear();
lastname.clear();
adress.clear();
passport.clear();
cin.clear();
number.clear();
email.clear();
compagny.clear();
    }
    @FXML
    void addClients(ActionEvent event) {
if(isPhone(number.getText())){
regexPhone.setVisible(false);
}else{
    regexPhone.setVisible(true);
}
    }


}
