package br.com.std.treinamento;

import java.io.IOException;

public class Main {

    public static void  main (String[] args){

       Exceptions exc = new Exceptions();
        try {
            exc.addPassengers("passageiros");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
