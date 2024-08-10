import java.util.Scanner;

class Excercise_One {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        double sum = a + b;
        System.out.println("Total sum: "+sum);
        sc.close();
    }
}