package fr.banque;

public class Compte {

    private Integer numero;
    private Double solde;

    public Compte(){

    }

    public Compte(Integer numero, Double solde){
        this.setNumero(numero);
        this.setSolde(solde);
    }

    public void ajouter(Double unMontant){
        this.setSolde(this.getSolde() + unMontant);
    }

    public void retirer(Double unMontant){
        this.setSolde(this.getSolde() - unMontant);
    }

    @Override
    public String toString(){
        return "Compte numero : " + getNumero() + ", solde : " + getSolde();
    }

    public Integer getNumero() {
        return numero;
    }

    private void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSolde() {
        return solde;
    }

    private void setSolde(Double solde) {
        this.solde = solde;
    }
}
