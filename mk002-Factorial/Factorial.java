public class Factorial {    
    /**
     * Returns the product of all the numbers from 1 to the parameter n.
     * <p> 
     * @param n: The number for which the factorial is calculated.
     * @return factorial: The factorial value of given number.
     */
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        System.out.println(factorial(4));
    }
}
