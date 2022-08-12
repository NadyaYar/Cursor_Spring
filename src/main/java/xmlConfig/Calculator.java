package xmlConfig;


public class Calculator {
    private final xmlConfig.PlusService plusService;
    private final xmlConfig.MinusService minusService;

    public Calculator(PlusService plusService, MinusService minusService) {
        this.plusService = plusService;
        this.minusService = minusService;
    }

    public int mathComparison(int num1, int num2) {
        if (num1 > num2) {
            return minusService.minus(num1, num2);
        } else {
            return plusService.plus(num1, num2);
        }
    }
}
