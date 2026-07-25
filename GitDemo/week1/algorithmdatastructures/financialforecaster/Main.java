package week1.algorithmdatastructures.financialforecaster;

public class Main {
    public static void main(String[] args) {
        double initialInvestment = 10000.0;
        double annualGrowth = 0.07;         
        int targetYears = 10;              

        double futureValue = FinancialForecaster.forecastValue(initialInvestment, annualGrowth, targetYears);
        
        System.out.printf("Predicted Future Value after %d years: $%.2f%n", targetYears, futureValue);
}
}
