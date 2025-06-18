public class TypeCastingDemo {
    public static void main(String[] args) {

        // Widening (Implicit) Type Casting
        System.out.println("Widening (Implicit) Type Casting:");

        byte b = 10;
        int i = b; // byte to int
        System.out.println("byte to int: " + i);

        float f = 22.14f; // float value assigned
        double d = f; // float to double
        System.out.println("float to double: " + d);

        char ch = 'A';
        int i3 = ch; // char to int (ASCII value)
        System.out.println("char 'A' to int: " + i3);

        char var1 = '\u00A7'; // Unicode for '§'
        int i4 = var1; // char to int (Unicode value)
        System.out.println("char '\\u00A7' to int: " + i4);

        System.out.println();

        // Narrowing (Explicit) Type Casting
        System.out.println("Narrowing (Explicit) Type Casting:");

        double f1 = 10.52;
        long l = (long) f1; // double to long (decimal truncated)
        System.out.println("double to long: " + l);

        long l1 = 9233720368547758061l1;
        int i2 = (int) l1; // long to int (overflow occurs)
        System.out.println("long to int (with overflow): " + i2);

        float f2 = 34.56f;
        int i1 = (int) f2; // float to int (decimal truncated)
        System.out.println("float to int: " + i1);

        byte b1 = 90;
        char ch1 = (char) b1; // byte to char (ASCII conversion)
        System.out.println("byte to char (ASCII 90): " + ch1);
    }
}
