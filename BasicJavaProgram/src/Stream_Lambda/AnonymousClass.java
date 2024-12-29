package Stream_Lambda;

// Functional interface is a interface which has only 1 abstract method
interface Drawable{
    public void draw();
}
public class AnonymousClass {
    public static void main(String[] args) {

        int width = 10;

        // without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable(){
            public void draw() {
                System.out.println("Drawing "+width);
            }
        };
        d.draw();
    }
}
