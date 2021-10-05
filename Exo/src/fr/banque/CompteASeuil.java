package fr.banque;

public class CompteASeuil extends Compte{

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
    public void retirer(double uneValeur){

        double montant = getSolde() - uneValeur;

        if(montant > seuil)
            this.setSolde(montant);
    }

    @Override
    public String toString() {
        return super.toString() +
                "seuil=" + seuil +
                '}';
    }
}
