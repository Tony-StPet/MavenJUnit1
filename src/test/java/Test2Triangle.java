import mydomain.geometry.Point;
import mydomain.geometry.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2Triangle {

    @Test
    public void testPerimeter1(){
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        Point c = new Point(4, 3);
        Triangle abc = new Triangle(a,b,c);
        Assertions.assertTrue(abc.perimeter()-11.1<0.1);
    }

    @Test
    public void testPerimeter2(){
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        Point c = new Point(4, 3);
        Triangle abc = new Triangle(a,b,c);
        Assertions.assertTrue(abc.perimeter() > 0);
    }


}
