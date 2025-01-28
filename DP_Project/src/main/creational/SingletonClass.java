package main.creational;

public class SingletonClass {
    private static SingletonClass instace;
    public String value;

    private SingletonClass(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.value = value;
    }

    public static SingletonClass getInstace(String value) {
        if(instace == null) {
            instace = new SingletonClass(value);
        }
        return instace;
    }
}
