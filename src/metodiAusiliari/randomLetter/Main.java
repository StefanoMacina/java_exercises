package metodiAusiliari.randomLetter;

import java.util.Random;

public class Main {
    private final static Random r = new Random();

    public static void main(String[] args) {
        char x = randomGenerator('A','D');
        System.out.println(x);
    }

    public static char randomGenerator(char from, char to){
        return (char) r.nextInt(from, to);
    };
}
