package lambdaExpressions.functionalInterface.ex_2;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        UnaryOperator<String> everySecondCharLambda = source -> {
            StringBuilder returnVal = new StringBuilder();

            for(int i=0; i<source.length(); i++)
            {
                if(i%2==1)
                    returnVal.append(source.charAt(i));
            }
            return returnVal.toString();
        };

        System.out.println(everySecondCharacter(everySecondCharLambda,"123456789"));
    }

    public static <T> T everySecondCharacter(UnaryOperator<T> function, T source){
        return function.apply(source);
    }

    // write the following method as a lambda expression
    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for(int i=0; i< source.length(); i++)
        {
            if(i%2==1)
                returnVal.append(source.charAt(i));
        }
        return returnVal.toString();
    }
}
