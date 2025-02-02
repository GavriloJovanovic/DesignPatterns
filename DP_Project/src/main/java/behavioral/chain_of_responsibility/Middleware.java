package main.java.behavioral.chain_of_responsibility;

public abstract class Middleware {
    private Middleware next;

    // Build chains of middleware objects
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for(Middleware instanceOfChain : chain) {
            head.next = instanceOfChain;
            head = instanceOfChain;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if(next == null) {
            return true;
        }
        return next.check(email,password);
    }
}
