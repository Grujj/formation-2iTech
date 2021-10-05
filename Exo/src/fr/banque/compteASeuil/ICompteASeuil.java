package fr.banque.compteASeuil;

public interface ICompteASeuil {

    void retirer(double uneValeur);
    double getSeuil();
    void setSeuil(double unSeuil);
}
