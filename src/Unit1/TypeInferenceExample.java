package Unit1;

public class TypeInferenceExample {

    public static void main(String[] args){
        printLambdas(s -> s.length());
    }
    public static void printLambdas(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }
}
