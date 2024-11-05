package com.example;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {

        Socket s = new Socket("10.22.9.1", 3000);

        do{

            ThreadAscolto ts = new ThreadAscolto(s);
            ts.start();

            ThreadMessaggio tm = new ThreadMessaggio(s);
            tm.start();

        }while(true);
    }
}