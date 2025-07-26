package C2TC_CORE_JAVA_PROGRAM.src.Day8.abstraction;

// Program to define abstract class
public abstract class Shape {
    protected float area;  // declare once with the desired access level

    // abstract method
    abstract void calArea();

    // concrete method
    void show() {
        System.out.println("Area of shape is " + area);
    }
}
