package test.behavioral.strategy;

import main.behavioral.strategy.Customer;
import main.behavioral.strategy.PremiumCustomer;
import main.behavioral.strategy.ShoppingCart;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;


public class StrategyTest {

    @Test
    public void testRegularCustomer() {
        ShoppingCart cart = new ShoppingCart();
        Customer mihajlo = new Customer("Mihajlo", 500);

        cart.setPaymentStrategy(mihajlo);
        cart.checkout(100);

        assertEquals(400, mihajlo.getAmount(), "Mihajlo should have 400 moneys");
    }

    @Test
    public void testPremiumCustomer() {
        ShoppingCart cart = new ShoppingCart();
        Customer gavrilo = new PremiumCustomer("Gavrilo", 500, new GregorianCalendar(2025, Calendar.AUGUST,12).getTime());

        cart.setPaymentStrategy(gavrilo);
        cart.checkout(100);

        assertEquals(420, gavrilo.getAmount(), "Gavrilo should have 420 moneys");
    }
}
