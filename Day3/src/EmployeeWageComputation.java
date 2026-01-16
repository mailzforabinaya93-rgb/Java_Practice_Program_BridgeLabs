public class EmployeeWageComputation {

    // Constants (Configuration)
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 8;

    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC-3: Single Day Wage using Switch Case
        int empHours = getEmployeeHours();
        int dailyWage = calculateWage(empHours);
        System.out.println("Employee Wage: " + dailyWage);

        // UC-4: Monthly Wage for Fixed Days
        int monthlyWage = calculateMonthlyWage();
        System.out.println("Monthly Employee Wage: " + monthlyWage);

        // UC-5: Wage till Condition (Days or Hours)
        calculateWageTillCondition();
    }

    // Method to get employee working hours
    static int getEmployeeHours() {
        int empType = (int) (Math.random() * 3);
        int empHours;

        switch (empType) {
            case IS_FULL_TIME:
                empHours = FULL_DAY_HOUR;
                break;

            case IS_PART_TIME:
                empHours = PART_TIME_HOUR;
                break;

            default:
                empHours = 0;
        }
        return empHours;
    }

    // Method to calculate wage
    static int calculateWage(int hours) {
        return hours * WAGE_PER_HOUR;
    }

    // UC-4: Monthly Wage Calculation
    static int calculateMonthlyWage() {
        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int empHours = getEmployeeHours();
            totalWage += calculateWage(empHours);
        }
        return totalWage;
    }

    // UC-5: Wage till Days OR Hours condition
    static void calculateWageTillCondition() {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        while (totalWorkingDays < WORKING_DAYS_PER_MONTH
                && totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;
            int empHours = getEmployeeHours();

            totalWorkingHours += empHours;
            totalWage += calculateWage(empHours);
        }

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Wage (Condition Based): " + totalWage);
    }
}
