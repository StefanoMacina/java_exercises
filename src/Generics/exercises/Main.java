package Generics.exercises;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] stirngs = {1,2,3};

        print(stirngs);
    }
    public static <E> void print(E[] els){
        for(E el : els){
            System.out.println(el);
        }
    }

}

class CoppiaMista<T,S>{
    private T primo;
    private S secondo;

    public boolean checkOmogenei(){
        return primo.getClass().getSimpleName().equals(secondo.getClass().getSimpleName());
    }
    public CoppiaMista(T primo, S secondo) {
        this.primo = primo;
        this.secondo = secondo;
    }
    public T getPrimo() {
        return primo;
    }

    public S getSecondo() {
        return secondo;
    }

    @Override
    public String toString() {
        return "CoppiaMista{" +
                "primo=" + primo +
                ", secondo=" + secondo +
                '}';
    }
}