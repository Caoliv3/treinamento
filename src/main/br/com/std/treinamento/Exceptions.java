package br.com.std.treinamento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions implements Constantes{

    private int passengers;
   // private String path = "C:\\Users\\carlos\\Documents\\repository\\treinamento\\src\\test\\arquivos";
   // private String path = "/home/ubuntu/repository/treinamento/src/test/arquivos";
      private String path1 = null;

    public void addPassengers(String filename) throws IOException {

      //  arquivo = String.format(path,filename);
      //  path = path.concat("\\").concat(filename);
          path1 = path.concat("/").concat(filename);

            BufferedReader reader = null;
            try{
            reader = new BufferedReader(new FileReader(path1));
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
