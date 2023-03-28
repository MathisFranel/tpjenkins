package bank;

public class Account {
    private int accountID;
    private double solde;
    private float taux;
    public Account(int accountID, double solde, float taux){
        this.accountID = accountID;
        this.solde = solde;
        this.taux = taux;

    }

    public double getSolde() {
        return solde;
    }

    public float getTaux() {
        return taux;
    }

    public int getAccountID() {
        return accountID;
    }
    public void depot(double montant){
        this.solde += montant;
    }
    public void retrait(double montant){
        this.solde -= montant;
    }
    public void calculInteret(){
        this.solde += this.solde * this.taux;
    }

}
