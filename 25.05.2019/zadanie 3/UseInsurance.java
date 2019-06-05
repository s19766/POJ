import java.util.Scanner;

/**
 * @author Rafał Sochacki s20047
 * @author Damian Egert s19766
 */
public final class UseInsurance {

    private static int input;
    private static Health health;
    private static Life life;

    public static void main(String[] args) {

        menu();
        printInsurance(input);

    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome in Life & Health insurance -> select and buy: " +
                "\n1 -> buy Health Insurance " +
                "\n2 -> buy Life insurance " +
                "\nYour choice is: ");

        input = scanner.nextInt();

        switch (input) {
            case 1: {
                health = new Health();
                break;
            }
            case 2: {
                life = new Life();
                break;
            }
        }

        return input;
    }

    private static void printInsurance(int input) {

        if (input == 1) {
            health.display();
        } else if (input == 2) {
            life.display();
        }
    }

}
