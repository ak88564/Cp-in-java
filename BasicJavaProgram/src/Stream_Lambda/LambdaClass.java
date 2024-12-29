package Stream_Lambda;

interface Drawable2{
    public void draw();
}
public class LambdaClass {
    public static void main(String[] args) {
        int width = 10;

        // with lamda
        Drawable2 d2=()->{
            System.out.println("Drawing "+width);
        };

        d2.draw();
    }
}
