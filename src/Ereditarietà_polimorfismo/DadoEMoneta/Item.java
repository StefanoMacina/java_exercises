package Ereditarietà_polimorfismo.DadoEMoneta;


import java.util.Random;

abstract class Item {
    String result;
    int numericResult;
    Random r = new Random();
    protected int spin(int origin, int bound){
       return r.nextInt(origin,bound);
    };
    protected int spin(){
        return r.nextInt(1,7);
    };
    protected int spin(int bound){
        return r.nextInt(1,bound);
    };

    @Override
    public String toString() {
        return "%s -> %s".formatted(this.getClass().getSimpleName(), result);
    }
}

class MazzoDiCarte extends Item{
    int numeroCarte;
}

class Moneta extends Item{
    public Moneta(){
        if(spin() > 3) {
            result = "Testa";
        } else {
            result = "Croce";
        }
    }

}

class Dado extends Item{
    public Dado(){
        numericResult = spin();
    }

    @Override
    public String toString() {
        return "Dado -> %d".formatted(numericResult);
    }
}
class CarteDaPoker extends MazzoDiCarte{
    public CarteDaPoker(){
        this.numeroCarte = 52;
        int numeroCarta = spin(1, numeroCarte);
        if(numeroCarta > 13){
            if(numeroCarta > 26){
                if(numeroCarta > 39){
                    result = "Fiori";
                } else {
                    result = "Cuori";
                }
            } else {
                result = "Quadri";
            }
        } else {
            result = "Picche";
        }
    }

}

class CarteNapoletane extends MazzoDiCarte{
    public CarteNapoletane(){
        numeroCarte = 40;
        int num = spin(numeroCarte);
        if(num > 10){
            if(num > 20){
                if(num > 30){
                    result = "Bastoni";
                } else {
                    result = "Coppe";
                }
            } else {
                result = "Denari";
            }
        } else {
            result = "Spade";
        }
    }

}