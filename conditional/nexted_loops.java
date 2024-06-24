import java.util.Scanner;

public class nexted_loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        switch (fruits) {
            case "mango":
                System.out.println("This is the king of fruits");
                break;
            case "banana":
                System.out.println("It is also a nice fruit");
                break;
            default:
                System.out.println("Please Enter the correct fruits name ");
        }
        in.close();
    }
}
