import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {
    @org.junit.jupiter.api.Test
    void test1() throws Exception {
        assertEquals(Password.passwordEvaluation(0, false), "ValueError");
    }

    @org.junit.jupiter.api.Test
    void test2() throws Exception {
        assertEquals(Password.passwordEvaluation(5, false), "Very week");
    }

    @org.junit.jupiter.api.Test
    void test3() throws Exception {
        assertEquals(Password.passwordEvaluation(13, true), "Strong");
    }

    @org.junit.jupiter.api.Test
    void test4() throws Exception {
        assertEquals(Password.passwordEvaluation(13, false), "Medium");
    }

    @org.junit.jupiter.api.Test
    void test5() throws Exception {
        assertEquals(Password.passwordEvaluation(7, false), "Weak");
    }

    @org.junit.jupiter.api.Test
    void test6() throws Exception {
        assertEquals(Password.passwordEvaluation(17, false), "ValueError");
    }

    @org.junit.jupiter.api.Test
    void test7() throws Exception {
        assertEquals(Password.passwordEvaluation(8, false), "Weak");
    }

    @org.junit.jupiter.api.Test
    void test8() throws Exception {
        assertEquals(Password.passwordEvaluation(8, true), "Medium");
    }

    @org.junit.jupiter.api.Test
    void test9() throws Exception {
        assertEquals(Password.passwordEvaluation(16, false), "Medium");
    }

    @org.junit.jupiter.api.Test
    void test10() throws Exception {
        assertEquals(Password.passwordEvaluation(15, false), "Medium");
    }

    @org.junit.jupiter.api.Test
    void test11() throws Exception {
        assertEquals(Password.passwordEvaluation(1, false), "Very week");
    }

    @org.junit.jupiter.api.Test
    void test12() throws Exception {
        assertEquals(Password.passwordEvaluation(2, false), "Very week");
    }
}
