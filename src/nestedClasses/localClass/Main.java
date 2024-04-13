package nestedClasses.localClass;

public class Main {
    public static String printSomething(String someThinToPrint){

        class hello{
            private String somethingToPrint;

            public hello(String somethingToPrint) {
                this.somethingToPrint = somethingToPrint;
            }

            private String print(){
                return somethingToPrint;
            }
        }
        return new hello(someThinToPrint).print();
    }


    public static void main(String[] args) {

        System.out.println(printSomething("hello"));

    }
}
