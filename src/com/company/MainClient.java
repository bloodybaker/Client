package com.company;

public class MainClient {

    public static void main(String[] args) {
        Client client = new Client();
        while (true) {
            client.sendMsg("Alina Shevchenko");
        }
    }
}
