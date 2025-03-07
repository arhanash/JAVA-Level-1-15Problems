import java.util.Scanner;

public class CountdownRocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = scanner.nextInt();
        
        while (counter > 0) {
            System.out.println(counter--);
        }
        
        System.out.println("Liftoff!");
        scanner.close();
    }
}
