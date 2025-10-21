package Buoi1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vn.fpoly.TutorBuoi1.Calculator;

public class CalculatorTest {
        Calculator calc =  new Calculator();
        @Test
        public void testAdd(){
                int exp = 7;
                int act = calc.add(4,3);
                Assertions.assertEquals(exp,act);
        }
        @Test
        public void testDivine(){
                double exp = 1.5;
                double act = calc.divide(3,2);
                Assertions.assertEquals(exp,act);
        }

        @Test
        public void testSubtract() {
                int exp = 1;
                int act = calc.subtract(4, 3);
                Assertions.assertEquals(exp, act);
        }

        @Test
        public void testMultiply() {
                int exp = 12;
                int act = calc.multiply(4, 3);
                Assertions.assertEquals(exp, act);
        }

        @Test
        public void testDivineZero(){
             Assertions.assertThrows(
                     ArithmeticException.class,()->calc.divide(3,0)
             );
        }


        @Test
        public void testIsEven(){
                Assertions.assertTrue(calc.isEven(4));
                Assertions.assertFalse(calc.isEven(5));
        }


        @Test
        public void testFactorial(){
                Assertions.assertEquals(1, calc.factorial(0));
                Assertions.assertEquals(1, calc.factorial(1));
                Assertions.assertEquals(120, calc.factorial(5));
        }

}
