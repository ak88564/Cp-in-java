package Simple;

/*
By assigning the values of one object to another
 Here we are copying the values from one object to the other By assigning the values of one object to another.
 You can see in the following code
 */

class CopyConstructorEx {
    double x, y;
    // A normal parameterized constructor
    public CopyConstructorEx(double one, double two){
        x=one;
        y=two;
    }
    public CopyConstructorEx(){

    }
    public String display(){
        return "(" + x + " + " + y + "i)";
    }
}

public class CopyConstructorExample2{
    public static void main(String args[]){
        CopyConstructorEx c2 = new CopyConstructorEx(10,15);

        CopyConstructorEx c3= new CopyConstructorEx();
        //here we are copying values of one constructor into another.
        c3.x = c2.x;
        c3.y = c2.y;


        System.out.println(c3.display());// display() of c3 is called here
    }

}
