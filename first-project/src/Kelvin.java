public class Kelvin implements Temperature{
    private double celciusTemperature;
    private double fahrenheitTemperature;
    private double kelvinTemperature;

    public Kelvin(double degress){
        transformationCelcius(degress);
        transformationKelvin(degress);
        transformationFahrenheit(degress);
    }

    public void transformationFahrenheit(double kelvinDegree){
        this.fahrenheitTemperature = (kelvinDegree - 273.15) * 1.8 + 32;    }

    public void transformationKelvin(double kelvinDegree){
        this.kelvinTemperature = kelvinDegree;
    }

    public void transformationCelcius(double kelvinDegree){
        this.celciusTemperature = kelvinDegree + 273.15;
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
