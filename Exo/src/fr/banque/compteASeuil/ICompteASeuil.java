package fr.banque.compteASeuil;

import fr.banque.BanqueException;

public interface ICompteASeuil {

    void retirer(double uneValeur) throws BanqueException;
    double getSeuil();
    void setSeuil(double unSeuil);
}
