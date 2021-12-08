package com.example.brief3javafx.controller;

import com.example.brief3javafx.Main;
import com.example.brief3javafx.models.Client;
import com.example.brief3javafx.models.NouveauxClients;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

import java.util.List;

public class ListClientsController {
    @FXML
    private TableView<Client> tableclients;
    @FXML
    private TableColumn<Client,String> compagny;

    @FXML
    private TableColumn<Client,String> badge;

    @FXML
    private TableColumn<Client,String> adresse;

    @FXML
    private TableColumn<Client,String> firstname;

    @FXML
    private TableColumn<Client,String> code;

    @FXML
    private TableColumn<Client,String> passport;

    @FXML
    private TableColumn<Client,String> phone;

    @FXML
    private TableColumn<Client,String> cin;

    @FXML
    private TableColumn<Client,LocalDate> startdate;

    @FXML
    private TableColumn<Client,String> email;

    @FXML
    private TableColumn<Client,String> lastname;



    public void initialize() {

        List<Client> clts = NouveauxClients.clts;
      /*  ObservableList<Client> lists  = FXCollections.observableArrayList();
        for (int i=0; i < clts.size(); i++) {
            Client client = new Client();
            client.setBadge(clts.get(i).getBadge());
            client.setCompagny(clts.get(i).getCompagny());
            client.setFirstName(clts.get(i).getFirstName());
            client.setLastName(clts.get(i).getLastName());
            client.setAdress(clts.get(i).getAdress());
            client.setStartDate(clts.get(i).getStartDate());
            client.setEmail(clts.get(i).getEmail());
            client.setPhone(clts.get(i).getPhone());
            client.setCountryCode(clts.get(i).getCountryCode());
            client.setCin(clts.get(i).getCin());
            client.setPassport(clts.get(i).getPassport());
            lists.add(client);
            System.out.println(client);
        }*/

        ObservableList<Client> lists = FXCollections.observableList(NouveauxClients.clts);
        badge.setCellValueFactory(data -> {return new SimpleStringProperty(data.getValue().getBadge());});
        compagny.setCellValueFactory(data -> {return new SimpleStringProperty(data.getValue().getCompagny());});
        firstname.setCellValueFactory(data -> {return new SimpleStringProperty(data.getValue().getFirstName());});
        lastname.setCellValueFactory(data -> {return new SimpleStringProperty(data.getValue().getLastName());});
        phone.setCellValueFactory(data -> {return new SimpleStringProperty(data.getValue().getPhone());});
        startdate.setCellValueFactory(data -> {return new SimpleObjectProperty(data.getValue().getStartDate());});
        adresse.setCellValueFactory(data -> {return new SimpleStringProperty(data.getValue().getAdress());});
        email.setCellValueFactory(data -> {return new SimpleStringProperty(data.getValue().getEmail());});
        cin.setCellValueFactory(data -> {return new SimpleStringProperty(data.getValue().getCin());});
        passport.setCellValueFactory(data -> {return new SimpleStringProperty(data.getValue().getPassport());});
        code.setCellValueFactory(data -> {return new SimpleStringProperty(data.getValue().getCountryCode());});
        tableclients.setItems(lists);
        /*
        cin.setCellValueFactory(new PropertyValueFactory<Client,String>("cin"));
        compagny.setCellValueFactory(new PropertyValueFactory<Client,String>("compagny"));
        firstname.setCellValueFactory(new PropertyValueFactory<Client,String>("firstName"));
        cin.setCellValueFactory(new PropertyValueFactory<Client,String>("lastName"));
        adresse.setCellValueFactory(new PropertyValueFactory<Client,String>("adress"));
        startdate.setCellValueFactory(new PropertyValueFactory<Client,LocalDate>("startdate"));
        email.setCellValueFactory(new PropertyValueFactory<Client,String>("email"));
        phone.setCellValueFactory(new PropertyValueFactory<Client,String>("phone"));
        code.setCellValueFactory(new PropertyValueFactory<Client,String>("countryCode"));
        passport.setCellValueFactory(new PropertyValueFactory<Client,String>("passport"));

        tableclients.setItems(FXCollections.observableList(NouveauxClients.clts));

        //badge.setCellValueFactory(c -> new SimpleStringProperty(new String("badge")));
*/


    }
    @FXML
    void buttonNewClient(ActionEvent event) {
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

    @FXML
    void buttonClose(ActionEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
}
