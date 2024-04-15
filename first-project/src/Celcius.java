public class Celcius implements Temperature{
    private double celciusTemperature;
    private double fahrenheitTemperature;
    private double kelvinTemperature;

    public Celcius(double degress){
        if(test(degress)){
            System.out.println("Hola mundo");
            transformationFahrenheit(degress);
            transformationKelvin(degress);
            transformationCelcius(degress);
        } else{
            System.out.println("Error: Wrong temperature");
        }
    }

    public boolean test(double celciudDegress){
        return(celciudDegress > -273.15);
    }

    public void transformationFahrenheit(double celciusDegree){
        this.fahrenheitTemperature = (celciusDegree * 9/5) +32;    }

    public void transformationKelvin(double celciusDegree){
        this.kelvinTemperature = celciusDegree + 273.15;
    }

    public void transformationCelcius(double celciusDegree){
        this.celciusTemperature = celciusDegree;
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
