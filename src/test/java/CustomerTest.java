import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

        Customer customer;
        Luggage luggage;
        @Before
        public void before(){

            luggage = new Luggage(13.0, 3);
            customer = new Customer("Mike", luggage);
        }

        @Test
        public void hasName(){
            assertEquals("Mike", customer.getName());
        }
}
