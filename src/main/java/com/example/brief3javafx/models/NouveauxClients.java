package com.example.brief3javafx.models;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class NouveauxClients {

    public static List<Client> clts = new ArrayList<Client>();
    public static void AjoutClient(Client client){
        clts.add(client);

        for (int i=0; i < clts.size(); i++){
            System.out.println("#################################");
            System.out.println(clts.get(i).getFirstName());
            System.out.println(clts.get(i).getLastName());
            System.out.println(clts.get(i).getCompagny());
            System.out.println(clts.get(i).getAdress());
            System.out.println(clts.get(i).getCin());
            System.out.println(clts.get(i).getCountryCode());
            System.out.println(clts.get(i).getPassport());
            System.out.println(clts.get(i).getPhone());
            System.out.println(clts.get(i).getEmail());



            System.out.println("#################################");
        }

    }
    public  List<Client> getList(){
        return clts;
    }
}
