package fr.banque;

import java.util.Arrays;

public class Client {

    private String nom;
    private String prenom;
    private Integer age;
    private Integer numero;
    private Compte[] comptes = new Compte[5];

    public Client(){

    }

    public Client(String nom, String prenom, Integer age, Integer numero){
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
        this.setNumero(numero);
    }

    /**
     * Methode qui permet d ajouter un compte
     *
     * @param unCompte : Compte
     */
    public void ajouterCompte(Compte unCompte){

        /* Boucle dans le tableau de comptes */
        for(int i = 0; i < this.comptes.length; i++){

            /* Si une place est disponible pour le compte */
            if(this.comptes[i] == null){

                /* Ajoute le compte et stop la boucle */
                this.comptes[i] = unCompte;
                return;
            }
        }
    }

    /**
     * Methode qui permet de retourner un compte grace a son numero
     *
     * @param unNumero : int
     *
     * @return : Compte
     */
    public Compte getCompte(int unNumero){

        /* Boucle dans le tableau de comptes */
        for(int i = 0; i < this.comptes.length; i++){

            /* Si un compte existe avec ce numero */
            if(compteExiste(this.comptes[i], unNumero))

                /* Retourne le compte et stop la boucle */
                return this.comptes[i];
        }

        return null;
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
        return compte != null && compte.getNumero() != null && compte.getNumero() == unNumero;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + Arrays.toString(comptes) +
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

    public Compte[] getComptes() {
        return comptes;
    }

    private void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }
}
