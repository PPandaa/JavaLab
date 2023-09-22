import java.util.Scanner;

public class Lab {
    
    public static void main(String[] args) {
        // int x = 10;
        // int y = x++ * ++x;
        // System.out.println(y);

        // Scanner keyboard = new Scanner(System.in);
        // System.out.print("Please enter your name: ");
        // String name = keyboard.nextLine();
        // System.out.println("Hello " + name + "!");

        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        String s = keyboard.nextLine();
        int y = keyboard.nextInt();
        System.out.println(x);
        System.out.println(s);
        System.out.println(y);
        Integer.parseInt(s);
        System.out.print("Please enter the first number:\n");
        int firstNumber = keyboard.nextInt();
        System.out.print("Please enter the second number:\n");
        int secondNumber = keyboard.nextInt();
        System.out.printf("The sum of %d and %d is %d",firstNumber,secondNumber,firstNumber+secondNumber);


        
        // int x = 10;
        // int y = 4;
        boolean a = x>y;
        boolean b = x%y==3;
        boolean c = ++x==10;

        // == >> && >> ||
        System.out.printf("%b && %b || %b => ",a,b,c);
        System.out.println(a && b || c);

        System.out.printf("%b || %b && %b => ",a,b,c);
        System.out.println(a || b && c);

        keyboard.close();
    }

}