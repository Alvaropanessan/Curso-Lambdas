package Unit1;

public class RunneableExample {

    public static void main(String[] args){
        Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Printed inside Renneable");

            }
        });

        myThread.run();

        Thread myLambdaThread = new Thread(()-> System.out.println("Printed inside Lambda Renneable") );

        myLambdaThread.run();
    }
}
