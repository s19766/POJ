import java.text.DecimalFormat;

/**
 * @author Rafał Sochacki s20047
 * @author Damian Egert s19766
 */
public class PizzaSpecial extends Pizza {

    private String ing1;
    private String ing2;
    private String ing3;

    private DecimalFormat df1 = new DecimalFormat("#0.00");
    private DecimalFormat df2 = new DecimalFormat("0");

    public PizzaSpecial(double calories, String name, double price) {
        super(calories, name, price);
    }

    public PizzaSpecial(double calories, String name, double price, String ing1, String ing2, String ing3) {
        super(calories, name, price);
        this.ing1 = ing1;
        this.ing2 = ing2;
        this.ing3 = ing3;
    }

    public String getIng1() {
        return ing1;
    }

    public String getIng2() {
        return ing2;
    }

    public String getIng3() {
        return ing3;
    }

    @Override
    public String toString() {
        return "\nPizza Special: " + "" +
                "\nName: " + getName() +
                "\nIngredient 1: " + getIng1() +
                "\nIngredient 2: " + getIng2() +
                "\nIngredient 3: " + getIng3() +
                "\nCalories: " + df2.format(getCalories()) +
                "\ngetPrice: " + df1.format(getPrice());
    }
}
