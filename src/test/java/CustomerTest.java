import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Jack", 10000);
    }

    // CUSTOMER NAME GET & SET TESTS
    @Test
    public void canGetCustomerName(){
        assertThat(customer.getCustomerName()).isEqualTo("Jack");
    }
    @Test
    public void canSetCustomerName(){
        customer.setCustomerName("Jill");
        assertThat(customer.getCustomerName()).isEqualTo("Jill");
    }

    // CUSTOMER WALLET GET & SET TESTS
    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(10000);
    }
    @Test
    public void canSetWallet(){
        customer.setWallet(99);
        assertThat(customer.getWallet()).isEqualTo(99);
    }
}