import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(i+"x"+num+"="+(num*i));
        }
    }
}
