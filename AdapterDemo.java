package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        CelsiusTemperatureService celsiusService = new CelsiusTemperatureService();
        KelvinTemperatureService kelvinService = new KelvinTemperatureService();

        TemperatureService adapter = new TemperatureAdapter(celsiusService, kelvinService);

        System.out.println("Temperature in Farenheits: (from Celsius): " + adapter.getTemperatureFahrenheit());
        System.out.println("Temperature in Celsius: (from Kelvin): " + adapter.getTemperatureCelsius());
    }
}
