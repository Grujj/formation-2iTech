package fr.banque.compteASeuil;

import fr.banque.BanqueException;
import fr.banque.Compte;
import fr.banque.compteRemunere.ICompteRemunere;

public class CompteASeuil extends Compte implements ICompteASeuil {

    private double seuil;

    //region Constructeur
    public CompteASeuil(double seuil) {
        this.seuil = seuil;
    }

    public CompteASeuil(Integer numero, Double solde, double seuil) {
        super(numero, solde);
        this.seuil = seuil;
    }
    //endregion

    @Override
    public void retirer(double uneValeur) throws BanqueException{

        double montant = this.getSolde() - uneValeur;

        if(montant > seuil)
            super.retirer(uneValeur);
        else
            throw new BanqueException("Impossible de depasser le seuil minimum");
    }

    @Override
    public double getSeuil() {
        return this.getSeuil();
    }

    @Override
    public void setSeuil(double unSeuil) {
        this.seuil = unSeuil;
    }

    @Override
    public String toString() {
        return super.toString() +
                "seuil=" + seuil +
                '}';
    }
}
