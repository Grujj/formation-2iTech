package fr.banque;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        client.ajouterCompte(new Compte());
        client.ajouterCompte(null);
        client.ajouterCompte(new Compte(123, 500D));
        client.ajouterCompte(new Compte());
        client.ajouterCompte(new Compte(345, 750D));

        System.out.println(client.toString());
    }
}
