public class MathFunctions {

    // Ikkita sonni yig'indisini qaytaradigan method
    public static double add(double a, double b) {
        return a + b;
    }

    // Ikkita sonni ayirmasini qaytaradigan method
    public static double sub(double a, double b) {
        return a - b;
    }

    // Ikkita sonni ko'paytmasini qaytaradigan method
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Ikkita sonni bo'linmasini qaytaradigan method
    public static double div(double a, double b) {
        // Bitta sonni nolga bo'lishini tekshirish
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Nolga bo'lish mumkin emas.");
            return Double.NaN; // "Not a Number" (NaN) qiymatni qaytaradi
        }
    }

    // Bitta sonning absolyut qiymatini qaytaradigan method
    public static double abs(double a) {
        return Math.abs(a);
    }

    // Bitta sonning kvadrat qiymatini qaytaradigan method
    public static double pow(double a) {
        return Math.pow(a, 2);
    }

    public static void main(String[] args) {
        // Misol uchun methodlarni sinash
        double x = 5.5;
        double y = 2.0;

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + sub(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + div(x, y));
        System.out.println("Absolute Value: " + abs(x));
        System.out.println("Square: " + pow(x));
    }
}
