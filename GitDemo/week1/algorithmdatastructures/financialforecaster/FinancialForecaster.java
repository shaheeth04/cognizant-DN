package week1.algorithmdatastructures.financialforecaster;

public class FinancialForecaster {

    public static double forecastValue(double principal, double growthRate, int years) {
        if (years == 0) {
            return principal;
        }
        
        return forecastValue(principal, growthRate, years - 1) * (1 + growthRate);
    }
}
