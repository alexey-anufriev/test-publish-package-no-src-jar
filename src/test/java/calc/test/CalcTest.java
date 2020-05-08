package calc.test;

import calc.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void shouldAddTwoNumbers() {
        Assertions.assertEquals(2, new Calc().sum(1, 1));
    }

}
