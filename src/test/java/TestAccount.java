import bank.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccount {
    @DisplayName("Account")
    @ParameterizedTest(name = "converting {0} should return {1}")
    @CsvSource({
            "1, 100, 0.1f",
            "2, 10, 0.1f",
            "3, 50, 0.1f"
    })
    public void testAccount(int accountID, double solde, float taux) {
        Account account = new Account(accountID, solde, taux);
        assertEquals(taux, account.getTaux());
    }
}
