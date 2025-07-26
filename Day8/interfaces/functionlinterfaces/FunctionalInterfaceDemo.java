package C2TC_CORE_JAVA_PROGRAM.src.Day8.interfaces.functionlinterfaces;

//Program to demonstrate FunctionalInterface

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		//using Lambda Expression
		GreetInterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());

	}
}