package main.java.behavioral.template_method;

public abstract class OrderProcessTemplate {

        public final void processOrder() {
            selectItem();
            makePayment();
            deliverItem();
            sendConformation();
        }

        private void selectItem() {
            System.out.println("Item selected.");
        }

        private void sendConformation() {
            System.out.println("Order confirmation sent.");
        }

        protected abstract void makePayment();
        protected abstract void deliverItem();
}
