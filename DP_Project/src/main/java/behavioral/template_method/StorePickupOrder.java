package main.java.behavioral.template_method;

public class StorePickupOrder extends OrderProcessTemplate {
    @Override
    protected void makePayment() {
        System.out.println("Payment made at store.");
    }

    @Override
    protected void deliverItem() {
        System.out.println("Customer picked up item from store.");
    }
}
