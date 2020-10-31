import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    
    @Test
    public void testAdd(){
    	SimpleCalculator calculatorObj = new SimpleCalculator();
        assertEquals(-1, calculatorObj.add(-1), "Single Argument Test : This test case will PASS.");

        assertEquals(-2, calculatorObj.add(-1,-1), "Double Argument Test : This test case will PASS.");

        assertEquals(15, calculatorObj.add(1,2,3,4,5), "Multiple Argument Test : This test case will PASS.");
    }
    @Test
    public void testMultiply(){
    	SimpleCalculator calculatorObj = new SimpleCalculator();
        assertEquals(1, calculatorObj.multiply(1), "Single Argument Test : This test will PASS ");
        assertEquals(-3, calculatorObj.multiply(-1, 3), "Double Argument Test : This test case will PASS");
        assertEquals(240, calculatorObj.multiply(1,2,2,3,4,5),"Multiple Test : This test case will PASS");
    }
    @Test
    public void testLastAndSlotAsParameters(){
        SimpleCalculator cal = new SimpleCalculator();
        assertEquals(3,cal.add(1,2));
        cal.set_slot(1);
        assertEquals(7,cal.add(4,cal.LAST));
        assertEquals(14,cal.add(4,cal.LAST,cal.get_slot(1)));
    }

}