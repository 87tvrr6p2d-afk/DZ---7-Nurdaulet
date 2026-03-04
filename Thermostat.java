public class Thermostat {
    private int temperature;

    public Thermostat(int initialTemp) {
        this.temperature = initialTemp;
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Thermostat: " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }
}
