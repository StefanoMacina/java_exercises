package lambdaExpressions.functionalInterface.challenge;

import java.io.BufferedReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {


    public static void main(String[] args) {
        String[] names = {"Anna","Charlie","Maria","Michel","Xenya"};


        // use Arrays.setAll or List.replaceAll to
        // 1) transform names to all uppercase

        System.out.println("------ to upper case ------");
        Arrays.setAll(names, i -> names[i].toUpperCase() );

        Arrays.asList(names).forEach(System.out::println);

        // 2) Add a randomnly generated middle initial and include a period
        System.out.println("-----with random middle initial-----");
        UnaryOperator<String> addRandomLetter = source -> {
            char randomLetter = (char) new Random().nextInt(65,91);
            return "%s %s,".formatted(source, randomLetter);
        };

        Arrays.setAll(names,i -> addRandomLetter.apply(names[i]));
        Arrays.asList(names).forEach(System.out::println);

        // 3) add a lastname wich is reversed name
        System.out.println("----- with lastname reverse of the firstname -----");

        UnaryOperator<String> addreversedNameAsLastname = (source) -> {
            StringBuilder sb = new StringBuilder();
            String name = source.substring(0, source.length() -1);
            String[] longname = source.split(" ");
            sb.append(longname[0]);
            String lastName = String.valueOf(sb.reverse());
            return "%s %s,".formatted(name,lastName);
        };

        Arrays.setAll(names, i -> addreversedNameAsLastname.apply(names[i]));
        Arrays.asList(names).forEach(System.out::println);
        System.out.println("----- ArrayList from names array removing any names where the last name equales the first name -----");

        // 4) create a new modifiable ArrayList from names array removing any names where the last name equales the first name
        List<String> modifiableArray = new ArrayList<>(List.of(names));

        Predicate<String> removeIfNameEqualsLastname = source -> {
            String[] arrayFromName = source.split(" ");
            String lastName = arrayFromName[arrayFromName.length - 1].substring(0, arrayFromName[arrayFromName.length - 1].length() - 1);
            String name = arrayFromName[0];
            return lastName.equals(name);
        };

        modifiableArray.removeIf(name -> removeIfNameEqualsLastname.test(name));
        modifiableArray.forEach(System.out::println);

    }
}
