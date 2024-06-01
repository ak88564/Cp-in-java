package Simple;

public class Paypal {
    public static void main(String args[]){
        parentClass obj1 = new parentClass();

    }
}
class parentClass{

    parentClass() {
        System.out.println("This is parentClass");
    }
}
class childClass extends parentClass{
    childClass(){

    }
    childClass(int a){
        this(); // we cannot use this and super in the same constructor
        System.out.println("This is child class");

    }

}
