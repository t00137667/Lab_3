import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesisTest {

    @org.junit.jupiter.api.Test
    void isBalanced() {

        String expression = "( a + b * ( c / ( d – e ) ) ) + ( d / e )";

        boolean actual = BalancedParenthesis.isBalanced(expression);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    void isNotBalanced() {

        String expression = "( a + b * ( c / ( d – e ) ) ) + ( d / e )";

        boolean actual = BalancedParenthesis.isBalanced(expression);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}