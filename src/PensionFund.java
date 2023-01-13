public class PensionFund {

    private static final double PENSION_COEFFICIENT = 0.02;
    private static final int AVERAGE_SALARY = 1500;

    private String name;
    private boolean isState;
    private final String data;

    public PensionFund(String name, boolean isState, String data) {
        this.name = name;
        this.isState = isState;
        this.data = data;
    }

    public double calculatePension(int age, double minSalary, double maxSalary) {
        double averageSalary;
        if (isState) {
            averageSalary = AverageUtils.average(minSalary, maxSalary);
        }
        else {
            averageSalary = AverageUtils.average(minSalary, maxSalary, AVERAGE_SALARY);
        }
        return averageSalary * age * PENSION_COEFFICIENT;
    }
}
