package fr.banque;

public class CompteRemunere extends Compte{

    /* Valeur 0 a 1 */
    private double taux;

    //region Constructeurs
    public CompteRemunere() {

    }

    public CompteRemunere(Double taux) {
        this.taux = taux;
    }

    public CompteRemunere(Integer numero, Double solde, Double taux) {
        super(numero, solde);
        this.taux = taux;
    }
    //endregion

    public Double calculerInterets(){
        return getTaux() * getSolde();
    }

    public void verserInterets(){
        this.ajouter(this.calculerInterets());
    }

    @Override
    public String toString() {
        return "CompteRemunere{" +
                "taux=" + taux +
                '}';
    }

    //region Getter/Setter
    public Double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {

        if(0 <= taux && taux <= 1)
            this.taux = taux;
    }
    //endregion
}
