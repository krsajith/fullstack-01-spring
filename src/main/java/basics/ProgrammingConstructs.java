package basics;

public class ProgrammingConstructs {
    public static void main(String[] args) {
        //Sequences of statements
        System.out.println("One");
        System.out.println("Two");
        System.out.println("Three");

        //Conditional statements
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than 5");
        }

        //Loops
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //Switch statements
        int y = 10;
        switch (y) {
            case 1:
                System.out.println("y is 1");
                break;
            case 2:
                System.out.println("y is 2");
                break;
            default:
        }

        //Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[2]);
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length - 1]);
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 2]);


        //Data types
        int a = 10;
        double b = 10.5;
        boolean c = true;
        char d = 'a';
        String e = "Hello";

        //Operators
        int f = 10 + 5;

        //Data structures
        int[] numbers2 = new int[5];
        numbers2[0] = 1;
        numbers2[1] = 2;


    }
}
