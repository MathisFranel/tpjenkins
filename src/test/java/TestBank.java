import bank.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {
    @DisplayName("Bank")
    @ParameterizedTest(name = "converting {0} should return {1}")
    @CsvSource({
            "1, 100, 0.1f"
    })
    public void testBank(int accountID, double solde, float taux) {
        bank bank = new bank();
        Account account = new Account(accountID, solde, taux);
        Account account2 = new Account(accountID+1, solde+50, taux);
        bank.addAccount(account);
        bank.addAccount(account2);
        Assert.assertEquals(2, bank.getNbAccounts());

    }
}
