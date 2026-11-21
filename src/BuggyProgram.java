public class BuggyProgram {

    // Method 1: nested conditionals
    public static String getGrade(int score) {
        if (score >= 90) { // Check Task1Test to verify if boundary is >= 90 or > 90
            return "Exceeds";
        } else {
            if (score >= 80) { // Check Task1Test to verify if boundary is >= 80 or > 80
                return "Meets";
            } else {
                return "Does Not Meet";
            }
        }
    }
    public static int sumEvenNumbers(int[] values) {
        int sum = 0; // Fixed: initialized to 0 instead of 1
        for (int i = 0; i < values.length; i++) { // Fixed: < instead of <= to prevent ArrayIndexOutOfBoundsException
            if (values[i] % 2 == 0) {
                sum += values[i]; // Fixed: adds the even element values[i]
            }
        }
        return sum;
    }
    public static int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) { // Check Task3Test to verify if upper bound is inclusive (<=)
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Test the program using the JUnit tests");
    }
}
