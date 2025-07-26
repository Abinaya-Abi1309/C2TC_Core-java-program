package C2TC_CORE_JAVA_PROGRAM.src.Day8.interfaces.instanceofinterfaces;

//Program to define concrete class that implements the Phone interface.

public class Samsung implements Phone {

	@Override
	public void call() {
		System.out.println("Calling using Samsung");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Samsung");

	}

}