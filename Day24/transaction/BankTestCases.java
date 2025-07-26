package C2TC_CORE_JAVA_PROGRAM.src.Day24.transaction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BankTestCases {
    BankTransaction trans1;

    @ParameterizedTest
    @ValueSource(ints= {1001, 1006})
    void validateAccountTest(int accNo) {
        trans1 = new BankTransaction();
        boolean status = trans1.validateAccount(accNo);
        //	assertEquals(true, status);
        assertTrue(status);
    }

}
