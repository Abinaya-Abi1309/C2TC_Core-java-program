package C2TC_CORE_JAVA_PROGRAM.src.Day19;
public class LambdaWithoutParameter {

    public static void main(String[] args) {

        IStatement s = () -> {return "Hello World!!";};
        System.out.println(s.show());


    }

}
