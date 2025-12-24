import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = scan.nextInt();
        int count = 0;
        if(a<=1){
            System.out.println("not a prime number");
            return;
        }
        for (int i = 1; i <= a; i++) {
            if(a%i==0){
                count++;
            } 
        }
            if(count ==2)
                System.out.println("this is prime number");
            else
                System.out.println("not a prime number");
        }
    }

