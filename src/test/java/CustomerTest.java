import musicShop.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Niall", 1500);
    }

    @Test
    public void customerHasName(){
        assertEquals("Niall", customer.getName());
    }

    @Test
    public void customerHasCash(){
        assertEquals(1500, customer.getCash());
    }
}
