package C2TC_CORE_JAVA_PROGRAM.src.Day8.interfaces.functionlinterfaces;

// Regular class implementing the functional interface
public class GreetClass implements GreetInterface {
    @Override
    public String greet() {
        return "Good Morning";
    }
}
