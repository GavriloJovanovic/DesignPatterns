package main.java.behavioral.template_method;

public class OnlineOrder extends OrderProcessTemplate {
    @Override
    protected void makePayment() {
        System.out.println("Payment made online using credit card.");
    }

    @Override
    protected void deliverItem() {
        System.out.println("Item delivered to the given address.");
    }
}
