import java.util.InputMismatchException;

public abstract class Loan implements LoanConstants{
    private String loanNum;
    private String lastName;
    private double loanAmount;
    protected double interestRate;
    private int term;

    Loan(String loanNum, String lastName, double loanAmount, int term){
        this.loanNum = loanNum;
        this.lastName = lastName.toUpperCase();

        try{
            if (loanAmount > MAX_LOAN_AMOUNT){
                throw (new InputMismatchException("Loan must be lower than 100,000$"));
            } else{
                this.loanAmount = loanAmount;
            }
        } catch (InputMismatchException x){
            System.out.println(x.getMessage());
        }

        switch (term){
            case MEDIUM_TERM:
            case LONG_TERM:
                this.term = term;
                break;

            case SHORT_TERM:
            default:
                this.term = 1;
                break;
        }
    }

    @Override
    public String toString(){
        return String.format("%s\t\t%s\t\t$%,.2f\t%.2f%%\t\t%d\t\t$%,.2f",
                this.loanNum, this.lastName, this.loanAmount, this.interestRate * 100,
                this.term, this.loanAmount + (this.loanAmount * this.interestRate));
    }
}