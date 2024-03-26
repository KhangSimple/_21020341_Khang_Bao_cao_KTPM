import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {
    @org.junit.jupiter.api.Test
    void test1() throws Exception {
        assertEquals(Password.passwordEvaluation(17, false), "ValueError");
    }

    @org.junit.jupiter.api.Test
    void test2() throws Exception {
        assertEquals(Password.passwordEvaluation(4, false), "Very weak");
    }

    @org.junit.jupiter.api.Test
    void test3() throws Exception {
        assertEquals(Password.passwordEvaluation(7, false), "Weak");
    }


    @org.junit.jupiter.api.Test
    void test4() throws Exception {
        assertEquals(Password.passwordEvaluation(11, true), "Medium");
    }

    @org.junit.jupiter.api.Test
    void test5() throws Exception {
        assertEquals(Password.passwordEvaluation(16, true), "Strong");
    }

    @org.junit.jupiter.api.Test
    void test6() throws Exception {
        assertEquals(Password.passwordEvaluation(11, false), "Weak");
    }

    @org.junit.jupiter.api.Test
    void test7() throws Exception {
        assertEquals(Password.passwordEvaluation(16, false), "Medium");
    }
}
