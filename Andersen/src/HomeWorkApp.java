import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
//        drawSquare();
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void drawSquare() {
        System.out.println("-----");
        System.out.println("|   |");
        System.out.println("-----");
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a=-1;
        int b=-21;
        int sum= a+b;
        if (sum>=0) {

            System.out.println("The sum is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }
    public static void printColor() {
        int a= 154;
        if (a<=0) {
            System.out.println("Red");

        }  else if (a>0 && a<=100) {
            System.out.println("Yellow");
        }  else if (a>100) {
            System.out.println("Green");
        }
    }
    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
