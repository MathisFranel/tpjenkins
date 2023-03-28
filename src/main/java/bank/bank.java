package bank;

public class bank {
    private Account[] accounts;

    public bank(){
        this.accounts = new Account[100];
    }
    public void addAccount(Account account){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null){
                accounts[i] = account;
                break;
            }
        }
    }
}
