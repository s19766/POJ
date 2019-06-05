public class BusinessLoan extends Loan{

    BusinessLoan(String loanNum, String lastName, double loanAmount, int term, double primeIntRate){
        super(loanNum, lastName, loanAmount, term);
        super.interestRate = 0.01 / (primeIntRate / 100);
    }
}
