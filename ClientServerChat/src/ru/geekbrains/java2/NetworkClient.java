package ru.geekbrains.java2;

import ru.geekbrains.java2.ClientController;
import ru.geekbrains.java2.NetworkService;
import ru.geekbrains.java2.AuthDialog;

import java.io.IOException;

public class NetworkClient {

    public static void main(String[] args) {
        try {
            ClientController clientController = new ClientController("localhost", 8189);
            clientController.runApplication();
        } catch (IOException e) {
            System.err.println("Failed to connect to server! Please, check you network settings");
        }
    }
}