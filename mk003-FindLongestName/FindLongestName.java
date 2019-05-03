public class FindLongestName {   
    /**
     * Returns the longest String from input array of Strings.
     * <p>
     * @param names: The input array of Strings.
     * @return longestName: The longest String among input array of Strings.
     */
    public static String findLongestName(String[] names) {
        int namesLength = names.length;
        String longestName = names[0];
        for (int i = 1; i < namesLength; i++) {
            if (longestName.length() < names[i].length()) {
                longestName = names[i];
            }
        }
        return longestName;
    }
    public static void main(String[] args) { 
        String[] cars =  {"Volvo", "BMW", "Ford", "Ferrari"};
        String longestCar = findLongestName(cars);      
        System.out.println(longestCar);
    }
}
