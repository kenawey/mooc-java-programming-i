
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//         Scanner scanner = new Scanner(System.in);

        while (true) {

            String string = scanner.nextLine();
            if (string.equals("end")) {
                break;
            }
            int result = Integer.valueOf(string);
            System.out.println(result * result * result);

        }

    }
}