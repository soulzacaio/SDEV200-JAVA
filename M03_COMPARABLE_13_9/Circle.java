public class Circle extends GeometricObject implements Comparable<Circle>
{
    private double radius;

    public Circle()
    {

    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object otherCircle)
    {
        Circle oc = (Circle) otherCircle;
        return this.radius == oc.radius;
        // return this.radius == otherCircle.radius;
    }

    @Override
    public int compareTo(Circle otherC)
    {
        if (this.radius > otherC.radius)
            return 1;
        else if (this.radius < otherC.radius)
            return -1;
        else
            return 0;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return "Size of radius is " + this.radius;
    }
}
