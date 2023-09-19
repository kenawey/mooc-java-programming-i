
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while (number >= 1) {
            System.out.print("*");
            number--;
        }
        System.out.println();

    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number >= 1) {
            System.out.print(" ");
            number--;
        }

    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        int numberOfStars = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(numberOfStars);

            i++;
            numberOfStars += 2;
        }
        printSpaces((numberOfStars / 2) - 2);
        printStars(3);
        printSpaces((numberOfStars / 2) - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
