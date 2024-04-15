public class Fahrenheit implements Temperature{
    private double celciusTemperature;
    private double fahrenheitTemperature;
    private double kelvinTemperature;

    public Fahrenheit(double degress){
        transformationCelcius(degress);
        transformationKelvin(degress);
        transformationFahrenheit(degress);
    }

    public void transformationFahrenheit(double fahrenheitDegree){
        this.fahrenheitTemperature = fahrenheitDegree;
    }

    public void transformationKelvin(double fahrenheitDegree){
        this.kelvinTemperature = (fahrenheitDegree - 32.0) * 5.0/9.0;
    }

    public void transformationCelcius(double fahrenheitDegree){
        this.celciusTemperature = (fahrenheitDegree - 32) * 5 / 9 + 273.15;
    }

    public double getCelciusTemperature(){
        return celciusTemperature;
    }

    public double getFahrenheitTemperature(){
        return fahrenheitTemperature;
    }

    public double getKelvinTemperature(){
        return kelvinTemperature;
    }
}
