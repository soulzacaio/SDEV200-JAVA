
public class TestClass
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(1.5);
        Circle c2 = new Circle(1.5);
        Circle c3 = new Circle(2);

        System.out.println("c1: " + c1.toString());
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());
        System.out.println("");

        System.out.println("c2: " + c2.toString());
        System.out.println("Area of c2: " + c2.getArea());
        System.out.println("Perimeter of c2: " + c2.getPerimeter());
        System.out.println("");

        System.out.println("c3: " + c3.toString());
        System.out.println("Area of c3: " + c3.getArea());
        System.out.println("Perimeter of c3: " + c3.getPerimeter());
        System.out.println("");

        System.out.println("Is c1 equal to c2? -->" + c1.equals(c2));
        System.out.println("Is c1 equal to c3? -->" + c1.equals(c3));

        System.out.println("");
        System.out.println("Now using compareTo() from Comparable:\n");
        System.out.println("How does c1 compare to c2?\n");

        int temp = c1.compareTo(c2);
        switch (temp)
        {
        case 1:
            System.out.println("c1 > c2");
            break;
        case -1:
            System.out.println("c1 < c2");
            break;
        case 0:
            System.out.println("c1 == c2");
            break;
        }

        System.out.println("\nHow does c1 compare to c3?\n");

        temp = c1.compareTo(c3);
        switch (temp)
        {
        case 1:
            System.out.println("c1 > c3");
            break;
        case -1:
            System.out.println("c1 < c3");
            break;
        case 0:
            System.out.println("c1 == c3");
            break;
        }
    }

}
