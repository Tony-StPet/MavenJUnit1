import mydomain.geometry.Point;
import mydomain.geometry.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2Triangle {

    @Test
    public void testPerimeter1(){
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(4, 0);
        Triangle abc = new Triangle(a,b,c);
        Assertions.assertEquals(12, abc.perimeter());
    }

    @Test
    public void testPerimeter2(){
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        Point c = new Point(4, 3);
        Triangle abc = new Triangle(a,b,c);
        Assertions.assertTrue(abc.perimeter() > 0);
    }

    @Test
    public void testPerimeter3(){
        Point a = new Point(0, 0);
        Point b = new Point(30, 0);
        Point c = new Point(0, 40);
        Assertions.assertNotEquals(0, c.distanceTo(a));
        Assertions.assertNotEquals(0, a.distanceTo(b));
        Assertions.assertNotEquals(0, b.distanceTo(c));
    }
    @Test
    public void testPerimeter4(){
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        Point c = new Point(4, 3);
        Triangle abc = new Triangle(a,b,c);
        Triangle t2 = new Triangle(b,c,a);
        Assertions.assertTrue(abc.perimeter() == t2.perimeter());
    }

}
