package Simple;

/*
By constructor
Here we are copying the values from one object to the other using the copy constructor CopyConstructroExample.
 You can see in the following code
 */

class CopyConstructorExample {
    private double x, y;
    // A normal parameterized constructor
    public CopyConstructorExample(double one, double two){
        x=one;
        y=two;
    }
    CopyConstructorExample(CopyConstructorExample c){
        System.out.println("Copy constructor called");
        x=c.x;
        y=c.y;
        System.out.println(c.x);
        System.out.println(c.y);
    }
    public String display(){
        return "(" + x + " + " + y + "i)";
    }
}

public class CopyConstructorExample1{
    public static void main(String args[]){
        CopyConstructorExample c1 = new CopyConstructorExample(10,15);

        //Following involves a copy constructor call
        CopyConstructorExample c2= new CopyConstructorExample(c1);

        //Note that following doesn't involve a copy constructor call as non-primitive variables
        //are just references.
        CopyConstructorExample c3=c2;

        System.out.println(c2.display());// display() of c2 is called here
    }

}
