import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    Calculator calculator = Calculator.instance.get();
    @org.junit.jupiter.api.Test

    public void plus() {
        int x = 40;
        int y = 20;
        int result = calculator.plus.apply(x, y);

        Assertions.assertEquals(60, result);
    }
    @Test
    public void minus() {
        int x = 20;
        int y = 2;
        int result = calculator.minus.apply(x, y);

        Assertions.assertEquals(18, result);
    }
    @Test
    public  void multiply (){
        int x = 10;
        int y = 10;
        int result = calculator.multiply.apply(x,y);

        Assertions.assertEquals(100,result);
    }
    @Test
    public void devide() {
        int x = 20;
        int y = 10;
        int result = calculator.devide.apply(x, y);

        Assertions.assertEquals(2, result);
    }
}