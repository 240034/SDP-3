package adapter;

public class TemperatureAdapter implements TemperatureService {

    private CelsiusTemperatureService celsiusService;
    private KelvinTemperatureService kelvinService;

    public TemperatureAdapter(CelsiusTemperatureService celsiusService,
                              KelvinTemperatureService kelvinService) {
        this.celsiusService = celsiusService;
        this.kelvinService = kelvinService;
    }

    @Override
    public double getTemperatureFahrenheit() {

        double celsius = celsiusService.getTemperatureCelsius();
        return celsius * 9 / 5 + 32;
    }

    @Override
    public double getTemperatureCelsius() {

        return kelvinService.getTemperatureKelvin() - 273.15;
    }
}
