/**
 * @author Rafał Sochacki s20047
 * @author Damian Egert s19766
 */
public abstract class Insurance {
    private String typeOfInsurance;
    protected double monthlyPrice;

    public Insurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }

    protected Insurance() {
    }

    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public abstract double setCost();

    public abstract void display();
}
