public class PersonalLoan extends Loan {

    PersonalLoan(String loanNum, String lastName, double loanAmount, int term, double primeIntRate) {
        super(loanNum, lastName, loanAmount, term);
        super.interestRate = 0.02 / (primeIntRate / 100);
    }
}
