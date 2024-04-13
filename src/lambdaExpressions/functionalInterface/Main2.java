package lambdaExpressions.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Main2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of(
                "Charlie", "Balderun","Nikolas","Thomas"
        ));

        var namess = names.removeIf(name -> name.equalsIgnoreCase("charlie"));

        Consumer<String> c = (a -> System.out.printf("%s %s%n", a,a.charAt(0)));

        names.forEach(c);

    }

}


