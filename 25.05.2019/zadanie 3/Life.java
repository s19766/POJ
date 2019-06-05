/**
 * @author Rafał Sochacki s20047
 * @author Damian Egert s19766
 */
public class Life extends Insurance {

    private final double lifeInsuranceCost = 36;

    public Life() {
        super("Life");
        setCost();
    }

    @Override
    public double setCost() {
        return monthlyPrice = lifeInsuranceCost;
    }

    @Override
    public void display() {
        System.out.println("Type of Insurance: " + getTypeOfInsurance() + ", Cost : " + getMonthlyPrice());
    }

}
