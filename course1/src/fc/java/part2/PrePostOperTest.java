package fc.java.part2;

public class PrePostOperTest {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a++ = " + a++); // a = a + 1
        System.out.println("++a = " + ++a);
        System.out.println("a = " + a);
        
        int b = 10;
        System.out.println("b-- = " + b--);
        System.out.println("--b = " + --b);
        System.out.println("b = " + b);

        int x = 10;
        System.out.println("--x = " + --x);
        System.out.println("x++ = " + x++);
        System.out.println("x-- = " + x--);
        System.out.println("++x = " + ++x);
        System.out.println("x = " + x);
    }
}
