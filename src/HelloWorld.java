

public class HelloWorld {
    static String helloWorld = "Hello World";
    static String aString = "";
    static int[] intArray = new int[10];

    public static void main (String [] args) {
        System.out.println(helloWorld);
        printString("Woo Woo");
        System.out.println(returnString());

        System.out.println(operators(23,0, false));
        arrays();

        System.out.println("\niteration()");
        iteration();

        System.out.println("\niterationArray()");
        iterationArrays();

        System.out.println("\niteration2()");
        itterationArrays2();


    }


    private static void printString(String s) {
        System.out.println(s);
    }

    private static String returnString() {
        return "Hello World!";
    }

    private static int operators(int x , int y, boolean b) {
        if (x ==0 || y == 0) {
            return x + y;
        }
        else if (b) {
            return x + y;
        } else {
            return x * y;
        }
    }

    private static void iteration(){
        for (int i =0; i <10; i++) {
            System.out.println(operators(34, i ,true));
        }

    }

    private static void arrays(){
        for (int i =0; i <10; i++) {
            intArray[i]= i+5;
            System.out.println(operators(intArray[i], i ,true));
        }
    }

    private static void iterationArrays(){
        for (int i =0; i <10; i++) {
            System.out.println(intArray[i]);
        }

    }

    private static void itterationArrays2(){
        for (int i =0; i <10; i++) {
            intArray[i]= i*2;
            System.out.println(intArray[i]);
        }

        for (int i =0; i <10; i++) {
            intArray[i]= intArray[i]*10;
            System.out.println(intArray[i]);
        }
    }



}
