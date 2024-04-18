package lambdaExpressions.functionalInterface.ex_1;



import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // Convert this anonymous class in a lambda expression
        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for(String part : parts)
                    System.out.println(part);
            }
        };

        Consumer<String> printWordsLambda = (sentence) -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(System.out::println);
        };

        printWords.accept("print this line");
        printWordsLambda.accept("some text");
    }
}

