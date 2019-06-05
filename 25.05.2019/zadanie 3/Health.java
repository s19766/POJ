/**
 * @author Rafał Sochacki s20047
 * @author Damian Egert s19766
 */
public class Health extends Insurance {

    private final double healthInsuranceCost = 196;

    public Health() {
        super("Health");
        setCost();
    }

    @Override
    public double setCost() {
        return monthlyPrice = healthInsuranceCost;
    }

    @Override
    public void display() {
        System.out.println("Type of Insurance: " + getTypeOfInsurance() + ", Cost : " + getMonthlyPrice());
    }
}
