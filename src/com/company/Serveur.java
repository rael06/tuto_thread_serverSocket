package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static final int PORT = 2500;
    public static void main (String[] args) {
        try {
            ServerSocket waitingSocket = new ServerSocket(PORT);
            do {
                Socket socket = waitingSocket.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String machine = br.readLine();
                System.out.println(machine + " vient de se connecter ! ");
                Thread.sleep(5000);
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                pw.println("J'ai bien reçu ton message, machine : " + machine);
                pw.close();
                br.close();
                socket.close();
            } while (true);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
