package com.temp;

public strictfp class StrictfpExample {
    // All methods in this class will follow strict floating-point rules

    public static void main(String[] args) {
        double num1 = 0.2;
        double num2 = 0.1;
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }
}

/*class AnotherExample {
    public strictfp double computeSum(double a, double b) {
        // This method follows strict floating-point rules
        return a + b;
    }
}
*/