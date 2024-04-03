package metodiAusiliari.MezziCasuali;

import java.text.DecimalFormat;

public class Main {
    static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {
        double d = randomDouble();
        System.out.println(d);
    }
    public static double randomDouble(){
        double d = Double.parseDouble(df.format(Math.random()));
        if(d >= .5){
            return d - .5;
        }
        return d;
    }
}
