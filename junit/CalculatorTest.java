package Examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc=new Calculator();
    @Test
    public void addTest(){
        //call add method
        int result= calc.add(10,15);

        //Assertions
        Assertions.assertEquals(25, result);
    }
    @Test
    public void multiplyTest(){
        int result=calc.multiply(20,20);
        Assertions.assertEquals(400,result);
    }
}
