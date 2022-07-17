package D20220716;

public class priceCalculationClass {
    public static void main(String[] args) {
        double price = (double) 1/5;
        int count = 2;
        System.out.println(priceCalculation(price,count));
    }
    public static double priceCalculation(double price, int count) {
        double resultOfCalculation;
        resultOfCalculation=price*count;
        return resultOfCalculation;
    }
}