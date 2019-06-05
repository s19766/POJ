import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Rafał Sochacki s20047
 * @author Damian Egert s19766
 */
public class PizzaPortal {
    private static ArrayList<Pizza> pizzas = new ArrayList<>();
    private static Random random = new Random();
    private static String[] names = {"Marinara", "Quattro Stagioni", "Margherita", "Carbonara", "Napoli", "Frutti di Mare"};
    private static String[] ingredients = {"Bacon", "Tomatoes", "Feta Cheese",
            "Birthday Candles", "Chicken", "Tons of Cheese",
            "Pickled Cucumber", "Whipped Cream", "Snails"};
    private static DecimalFormat df2 = new DecimalFormat("0");

    public static void main(String[] args) {
        createPizzas();
        printPizzas();
        printSortedPizzas();
        System.out.println(pizzaStatistics());
    }

    private static void createPizzas() {

        for (int i = 0; i < 40; i++) {
            int x = random.ints(1, 4).findFirst().getAsInt(); //random choose between 3 kinds of Pizza;
            int name = random.ints(0, 6).findFirst().getAsInt(); //random name of a pizza
            int ing1 = random.ints(0, 9).findFirst().getAsInt(); //random first ingredient
            int ing2 = random.ints(0, 9).findFirst().getAsInt(); //random second ingredient
            int ing3 = random.ints(0, 9).findFirst().getAsInt(); //random third ingredient
            double price = random.doubles(100, 201).findFirst().getAsDouble(); //random price of a single pizza
            double calories = random.doubles(250, 701).findFirst().getAsDouble(); //random number of calories in a single pizza

            switch (x) {
                case 1: {
                    pizzas.add(new PizzaDeluxe(calories, names[name], price, ingredients[ing1], ingredients[ing2], ingredients[ing3]));
                    break;
                }
                case 2: {
                    pizzas.add(new PizzaSpecial(calories, names[name], price, ingredients[ing1], ingredients[ing2], ingredients[ing3]));
                    break;
                }
                case 3: {
                    pizzas.add(new PizzaWoogy(calories, names[name], price, ingredients[ing1], ingredients[ing2], ingredients[ing3]));
                    break;
                }
            }

        }
    }

    private static void printPizzas() {
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println("number: " + (i + 1) + " \nPizza " + pizzas.get(i));
        }

    }

    private static void printSortedPizzas() {
        Collections.sort(pizzas);
        System.out.println("\n\n");
        for (Pizza pizza : pizzas) {
            System.out.println("Calories: " + df2.format(pizza.getCalories()) + " Type: " + pizza.getClass().getSimpleName() + " Pizza: " + pizza.getName());
        }
    }

    private static String pizzaStatistics() {
        int caloriesPD = 0;
        int caloriesPW = 0;
        int caloriesPS = 0;
        int amountPD = 0;
        int amountPW = 0;
        int amountPS = 0;

        for (int i = 0; i < pizzas.size(); i++) {
            if (pizzas.get(i) instanceof PizzaDeluxe) {
                caloriesPD += pizzas.get(i).getCalories();
                amountPD += 1;

            } else if (pizzas.get(i) instanceof PizzaWoogy) {
                caloriesPW += pizzas.get(i).getCalories();
                amountPW += 1;

            } else if (pizzas.get(i) instanceof PizzaSpecial) {
                caloriesPS += pizzas.get(i).getCalories();
                amountPS += 1;

            }
        }
        return "\namount of Pizza Deluxe: " + amountPD + ", total calories : " + caloriesPD +
                "\namount of Pizza Woggy: " + amountPW + ", total calories : " + caloriesPW +
                "\namount of Pizza Special: " + amountPS + ", total calories : " + caloriesPS;
    }
}
