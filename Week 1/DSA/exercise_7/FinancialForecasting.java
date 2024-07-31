package exercise_7;

public class FinancialForecasting {
    
    // Recursive method to predict future value
    public static double predictionValue(double currentCash, double growthRate, int years) {
        if (years == 0) {
            return currentCash;
        }
        

        double futureValue = currentCash * (1 + growthRate);
        return predictionValue(futureValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentCash = 1000.0;  
        double annualGrowthRate = 0.07;  
        int years = 10;  
        
        double predictedValue = predictionValue(currentCash, annualGrowthRate, years);
        System.out.printf("The predicted future value - "+predictedValue);
    }
}