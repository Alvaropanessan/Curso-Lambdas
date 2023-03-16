package Unit1;

import Unit1.Greeting;

public class HelloGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello");
    }
}
