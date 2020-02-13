package br.com.std.treinamento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {

    private int passengers;
    private String path = "/home/ubuntu/repository/treinamento/src/test/arquivos";

    public void addPassengers(String filename) throws IOException {

            BufferedReader reader = null;
            try{
            reader = new BufferedReader(new FileReader(filename));
            String line = null;

            while((line =reader.readLine()) != null){
                String[] parts = line.split(" ");
                passengers += Integer.valueOf(parts[0]);

            }
         } finally {
             if (reader != null) reader.close();
         }
    }


}
