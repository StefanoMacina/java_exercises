package lambdaExpressions.functionalInterface;

public class Main {
    public static void main(String[] args) {

        int result = calculator((a, b) -> a + b, 1,2);
        System.out.println(result);

    }
    public static <T> T calculator(Operation<T> function, T value1, T value2){
        return function.operate(value1, value2);
    }
}

@FunctionalInterface
interface Operation<T>{
    T operate(T value1, T value2);
}