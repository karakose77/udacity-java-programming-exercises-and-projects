public class HowManyYearsTillTargetBalance {   
    /**
     * Returns the years required to achieve to target balance,
     * given input balance and input yearly interest rate.
     * <p> 
     * @param initialBalance: Input initial balance.
     * @param targetBalance:  Input target balance.
     * @param yearlyInterest: Input yearly interest rate.
     * @return years: The total years required to achieve target balance.
     */
    public static int howManyYearsTillTargetBalance(double initialBalance, double targetBalance, double yearlyInterest) {
        double balance = initialBalance;
        int years = 0;
        while (balance < targetBalance) {
            years ++;
            balance *= (1 + yearlyInterest);
        }
        return years;
    }
    public static void main(String[] args) { 
        double initialBalance = 50000;
        double targetBalance = 100000;
        double yearlyInterest = 0.05;
        int totalYears = howManyYearsTillTargetBalance(initialBalance, targetBalance, yearlyInterest);
        System.out.println(totalYears);
    }
}
