public class LineComparisonComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        // Line 1 points
        double x1 = 1;
        double y1 = 2;
        double x2 = 4;
        double y2 = 6;

        // Line 2 points
        double a1 = 1;
        double b1 = 2;
        double a2 = 4;
        double b2 = 6;

        Double length1 = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        Double length2 = Math.sqrt(
                Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2)
        );

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        // UC-2: Equality check
        if (length1.equals(length2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }

        // UC-3: Comparison
        int compareResult = length1.compareTo(length2);

        if (compareResult == 0) {
            System.out.println("Both lines are equal");
        } else if (compareResult > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}
