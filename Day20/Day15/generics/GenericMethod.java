package C2TC_CORE_JAVA_PROGRAM.src.Day15.generics;

public class GenericMethod {
    //Generic Method
    public <E> void displayArrayElements(E[] elements) {
        for (E element : elements) {
            System.out.println("element is: " + element);
        }
    }
}
