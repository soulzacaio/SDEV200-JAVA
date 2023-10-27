/* 
* Program name: nSidedPoly.java
* Author: Caio Souza
* Date last updated: 10/24/2023
* Purpose: Create a polygon class and define its behavior, present a UML of the class
*/
import java.lang.Math;

class regularPolygon
{
    private int n;//num of sides
    private double side;//length of sides
    private double x;//center x-coord
    private double y;//center y-coord

//Constructors
    //Default Constructor -> Initializes all members to default value
    public regularPolygon()
    {
        n = 3;
        side = 1.0;
        x = y = 0;
    }

    //Secondary Constructor -> Initializes n and side with user input, coords @ origin
    public regularPolygon(int n, double side)
    {
        this.n = n;
        this.side = side;
        x = y = 0;
    }

    //Full Param. Constr. -> initializes all members with user input
    public regularPolygon(int n, double side, double x, double y)
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

//Getters
    public int getN() {return n;}
    public double getSide() {return side;}
    public double getX() {return x;}
    public double getY() {return y;}

//Setters
    public void setN(int value) {this.n = value;}
    public void setSide(double value) {this.side = value;}
    public void setX(double value) {this.x = value;}
    public void setY(double value) {this.y = value;}

//Functionality
    public double getPerimeter() {return n * side;}
    public double getArea() {return  (n * side * side) / 4 * Math.tan(Math.PI/n);}
}

public class nSidedPoly 
{
    public static void main(String[] args)
    {
        regularPolygon p1 = new regularPolygon();
        regularPolygon p2 = new regularPolygon(6, 4);
        regularPolygon p3 = new regularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon #1:");
        System.out.println("Perimeter: " + p1.getPerimeter());
        System.out.println("Area: " + p1.getArea());
        System.out.println();
        
        System.out.println("Polygon #2:");
        System.out.println("Perimeter: " + p2.getPerimeter());
        System.out.println("Area: " + p2.getArea());
        System.out.println();
      
        System.out.println("Polygon #3:");
        System.out.println("Perimeter: " + p3.getPerimeter());
        System.out.println("Area: " + p3.getArea());
    }
}


/* 
 @startuml
skinparam classAttributeIconSize 0

class regularPolygon {

{field}
-n : int
-side : double
-x : double
-y : double

{method}
+regularPolygon()
+regularPolygon(n : int, side : double)
+regularPolygon(n : int, side : double, x : double, y : double)

+getN() : int
+getSide() : double
+getX() : double
+getY() : double
+getPerimeter() : double
+getArea() : double

+setN(value : int)
+setSide(value : double)
+setX(value : double)
+setY(value : double)
}


@enduml
 */