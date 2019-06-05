/**
 * @author Rafał Sochacki s20047
 * @author Damian Egert s19766
 */
public class Pizza implements Comparable<Pizza> {

    private double calories;
    private String name;
    private double price;

    public Pizza(double calories, String name, double price) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Pizza p) {
        if (calories == p.calories)
            return 0;
        else if (calories > p.calories)
            return 1;
        else
            return -1;
    }
}
