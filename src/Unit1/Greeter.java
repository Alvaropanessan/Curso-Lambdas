package Unit1;

public class Greeter {


    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();

        Greeting lambdaGreeting = () -> System.out.println("Hello 2");


        lambdaGreeting.perform();

        greeter.greet(lambdaGreeting);
    }
}

