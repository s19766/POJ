import java.util.*;

class CreateLoans {

    private Loan[] loanDetails = new Loan[5];

    public static void main(String[] args){
        CreateLoans loan = new CreateLoans();

        loan.getLoanDetails();
        loan.displayDetails();
    }

    public void displayDetails(){
        System.out.println("Num| Name| Amount| Rate| Term| Total");

        for (int x = 0; x < loanDetails.length; x++){
            System.out.println(loanDetails[x].toString());
        }
    }

    public static Character getLoanType(){
        Scanner sc = new Scanner(System.in);
        Character loanType;

        do{
            System.out.print("PersonalLoan 2% or BusinessLoan 1%? (P/B): ");
            loanType = sc.next().toUpperCase().charAt(0);

            if (!((loanType.equals('P')) || (loanType.equals('B'))))
                System.out.println("Error");
        } while (!((loanType.equals('P')) || (loanType.equals('B'))));
        return loanType;
    }

    public static String getLoanNum(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Loan number: ");
        return sc.next();
    }

    public static String getLastName(){
        Scanner sc = new Scanner(System.in);
        String lastName;

        System.out.print("Name: ");
        lastName = sc.next();
        return lastName;
    }

    public static double getLoanAmount(){
        Scanner sc = new Scanner(System.in);
        double loanAmount;

        System.out.print("Loan amount: ");
        loanAmount = sc.nextDouble();
        return loanAmount;
    }

    public static double getPrimeIntRate(){
        Scanner sc = new Scanner(System.in);
        double primeIntRate;

        System.out.print("Interest rate (%): ");
        primeIntRate = sc.nextDouble();
        return primeIntRate;
    }

    public static int getTerm(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Loan term (1, 3, or 5): ");
        return sc.nextInt();
    }

    public void getLoanDetails(){
        Character loanType;
        String loanNum;
        String lastName;
        double loanAmount;
        double primeIntRate;
        int term;

        for (int x = 0; x < loanDetails.length; x++){
            System.out.println("Enter data for customer " + (x + 1));

            loanType = getLoanType();
            loanNum = getLoanNum();
            lastName = getLastName();
            loanAmount = getLoanAmount();
            primeIntRate = getPrimeIntRate();
            term = getTerm();

            System.out.println();

            if (loanType.equals('P')){
                loanDetails[x] = new PersonalLoan(loanNum, lastName, loanAmount, term, primeIntRate);
            } else if (loanType.equals('B')){
                loanDetails[x] = new BusinessLoan(loanNum, lastName, loanAmount, term, primeIntRate);
            }
        }
    }
}
