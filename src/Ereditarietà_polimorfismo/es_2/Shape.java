package Ereditarietà_polimorfismo.es_2;

abstract class Shape {
    protected double alt;
    abstract double Area();
    protected double Volume(){
        return alt * Area();
    }
    @Override
    public String toString() {
        return "%s -> volume = %.2f".formatted(this.getClass().getSimpleName(), Volume());
    }
}

class Parallelepipedo extends Shape{
  private double l1,l2;
  public Parallelepipedo(double alt, double l1, double l2){
    this.alt = alt;
    this.l1 = l1;
    this.l2 = l2;
  }
    @Override
    double Area() {
        return l1 * l2;
    }
}
class Cilindro extends Shape{
    private double r;
    public Cilindro(double alt,double r) {
        this.r = r;
        this.alt = alt;
    }
    @Override
    double Area() {
        return Math.PI * (r * r);
    }
}