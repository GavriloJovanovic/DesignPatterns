package test.java.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import main.java.behavioral.observer.*;

class ConcreteObserverTest {

    @Test
    void update() {
        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        assertEquals("Observer 1 received: EVENT!\n" +
                "Observer 2 received: EVENT!\n", subject.notifyObservers("EVENT!"), "Observers should received: 'EVENT!'");
    }
}