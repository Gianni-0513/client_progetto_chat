package com.example;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ThreadMessaggio extends Thread {

    private Socket s;

    public ThreadMessaggio(Socket s) {
        this.s = s;
    }

    public void run() {

        try {

            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            Scanner scan;

            do {
                
                scan = new Scanner(System.in);
                out.writeBytes(scan.nextLine() + "\n");
                break;

            } while (true);

        } catch (Exception e) {

        }

    }
}