package com.company;

import java.net.ServerSocket;
import java.net.Socket;

public class Service implements Runnable {
    private Socket service;

    void Service (Socket service) {
        this.service = service;
    }


    @Override
    public void run() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
