package fr.banque.compteRemunere;

public interface ICompteRemunere {

    double calculerInterets();
    void verserInterets();
    double getTaux();
    void setTaux(double unTaux);
}
