package fr.banque.compteASeuilRemunere;

import fr.banque.compteASeuil.CompteASeuil;
import fr.banque.compteRemunere.ICompteRemunere;

public class CompteASeuilRemunere extends CompteASeuil implements ICompteRemunere {

    private double taux;

    public CompteASeuilRemunere(double seuil) {
        super(seuil);
    }

    public CompteASeuilRemunere(Integer numero, Double solde, double seuil) {
        super(numero, solde, seuil);
    }


    @Override
    public double calculerInterets() {
        return this.getTaux() * this.getSolde();
    }

    @Override
    public void verserInterets() {
        this.ajouter(this.calculerInterets());
    }

    @Override
    public double getTaux() {
        return this.getTaux();
    }

    @Override
    public void setTaux(double unTaux) {
        if(0<= unTaux && unTaux <= 1)
            this.taux = unTaux;
    }
}
