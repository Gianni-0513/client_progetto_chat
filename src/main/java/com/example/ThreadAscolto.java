package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadAscolto extends Thread {

    private Socket s;

    public ThreadAscolto(Socket s) {
        this.s = s;
    }

    public void run() {

        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            do {

                String[] messaggioRicevuto = in.readLine().split(getName());

                switch (messaggioRicevuto[0]) {
                    
                }

                System.out.println(messaggioRicevuto[1]);

            } while (true);

        } catch (Exception e) {

        }

    }
}
