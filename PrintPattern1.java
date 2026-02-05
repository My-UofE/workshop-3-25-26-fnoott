import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = in.nextInt();
        in.nextLine();

        // Outer loop to print each of the rows
        int i = 1;
        for (int row = i; row <= size; row++) {
            // Inner loop to print each of the columns of a particular row
            int j = 1;
            for (int col = j; col <= i; col++) {
                System.out.print(j);
                ++j;
            }
            System.out.println("");
        ++i;
        }
    }
}