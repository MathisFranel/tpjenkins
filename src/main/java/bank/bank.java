package bank;

public class bank {
    private Account[] accounts;

    public bank(){
        this.accounts = new Account[0];
    }
    public int getNbAccounts(){
        return accounts.length;
    }
    public Account[] getAccountsArray(){
        return accounts;
    }
    public void addAccount(Account account){
        Account[] newAccounts = new Account[accounts.length + 1];
        for (int i = 0; i < accounts.length; i++) {
            newAccounts[i] = accounts[i];
        }
        newAccounts[accounts.length] = account;
        accounts = newAccounts;
    }
    public void transfer(Account account1, Account account2, double montant){
        account1.retrait(montant);
        account2.depot(montant);
    }
}
