package C2TC_CORE_JAVA_PROGRAM.src.Day8.interfaces.extendinginterfaces;

// Implements ChildInterface (and indirectly InterfaceOne)
public class ExtendingInterfaceDemo implements ChildInterface {

    // Implements method from ChildInterface
    public void print() {
        System.out.println("print method");
    }

    // Implements method from InterfaceOne
    public void show() {
        System.out.println("show method");
    }

    public static void main(String[] args) {
        ExtendingInterfaceDemo obj = new ExtendingInterfaceDemo();
        obj.print();  // Output: print method
        obj.show();   // Output: show method
    }
}
