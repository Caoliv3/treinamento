package br.com.std.treinamento.jdbc;

public class Main {

    public static void main(String[] args) throws Exception {

        try {
            ConnectComponent comp = new ConnectComponent();

            if (comp.tryConnection()) {

                System.out.println("The attempt to Connection was a SUCCESS");
            } else {

                System.out.println("The attempt to Connection FAILED");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
