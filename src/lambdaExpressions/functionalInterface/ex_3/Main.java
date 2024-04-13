package lambdaExpressions.functionalInterface.ex_3;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //write a lambda expression that is declared with the Supplier interface

        Supplier<String> function = () -> "i love java";
        String ILoveJava = function.get();
        System.out.println(ILoveJava);
    }
}
