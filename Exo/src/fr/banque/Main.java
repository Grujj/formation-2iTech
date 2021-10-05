package fr.banque;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        client.ajouterCompte(new Compte());
        client.ajouterCompte(new Compte(123, 500D));
        client.ajouterCompte(new Compte());

        System.out.println(client.getCompte(345));
        System.out.println(client.getCompte(123).toString());
    }
}
