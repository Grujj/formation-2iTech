package fr.banque;

import java.util.HashMap;
import java.util.Map;

public class Client {

    private String nom;
    private String prenom;
    private int age;
    private int numero;
    private Map<Integer, Compte> comptes = new HashMap<>();

    public Client(){

    }

    /**
     * Methode qui permet d ajouter un compte
     *
     * @param unCompte : Compte
     */
    public void ajouterCompte(Compte unCompte) {

        /* Boucle dans le tableau de comptes */
        this.comptes.put(unCompte.getNumero(), unCompte);
    }

    /**
     * Methode qui permet de retourner un compte grace a son numero
     *
     * @param unNumero : int
     *
     * @return : Compte
     */
    public Compte getCompte(int unNumero){

        return this.getComptes().get(unNumero);
    }

    /**
     * Methode qui verifie si un compte existe grace a son numero
     *
     * @param compte : Compte
     * @param unNumero : int
     *
     * @return : boolean
     */
    private boolean compteExiste(Compte compte, int unNumero){
        return compte != null && compte.getNumero() == unNumero;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + comptes.toString() +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Map<Integer, Compte> getComptes() {
        return comptes;
    }

    private void setComptes(Map<Integer, Compte> comptes) {
        this.comptes = comptes;
    }
}
