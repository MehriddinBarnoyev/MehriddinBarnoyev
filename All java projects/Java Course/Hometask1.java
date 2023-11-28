public class Hometask1 {
    private static final double pi = 3.14159265359;
    private static final double e = 2.71828182846;

    public static double CalculateCircleArea(double radius) {
        return pi * radius * radius;
    }

    public static double PowerOfE(double a) {
        return Math.pow(e, a);
    }

    public static double CalculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        CalculateCircleArea(2.4);
        PowerOfE(48);
        CalculateTriangleArea(25, pi, e);
        
        
    }
    
}
