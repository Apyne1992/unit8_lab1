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

}