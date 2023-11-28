public abstract class BaseConverter {
    public abstract double convert(double inputTemperature);

    public static void main(String[] args) {
        CelsiusToKelvinConverter celsiusToKelvinConverter = new CelsiusToKelvinConverter();
        CelsiusToFahrenheitConverter celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();

        double celsiusTemperature = 25.0;

        double kelvinTemperature = celsiusToKelvinConverter.convert(celsiusTemperature);
        double fahrenheitTemperature = celsiusToFahrenheitConverter.convert(celsiusTemperature);

        System.out.println(celsiusTemperature + " Celsius = " + kelvinTemperature + " Kelvin");
        System.out.println(celsiusTemperature + " Celsius = " + fahrenheitTemperature + " Fahrenheit");
    }
}

class CelsiusToKelvinConverter extends BaseConverter {
    @Override
    public double convert(double inputTemperature) {
        // Selsiydan Kelvinga o'tish formula: K = C + 273.15
        return inputTemperature + 273.15;
    }
}

class CelsiusToFahrenheitConverter extends BaseConverter {
    @Override
    public double convert(double inputTemperature) {
        // Selsiydan Farengeytga o'tish formula: F = (C * 9/5) + 32
        return (inputTemperature * 9 / 5) + 32;
    }
    
}

