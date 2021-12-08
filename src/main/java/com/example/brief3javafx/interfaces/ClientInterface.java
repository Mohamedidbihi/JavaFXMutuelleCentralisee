package com.example.brief3javafx.interfaces;

import com.example.brief3javafx.models.Client;

import java.time.LocalDate;
import java.util.Date;

public interface ClientInterface {
    public Client addClient(String badge, String compagny, String firstName, String lastName, String adress, LocalDate startDate, String email, String phone, String countryCode, String cin, String passport);
}
