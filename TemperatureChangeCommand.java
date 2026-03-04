public class TemperatureChangeCommand implements ICommand {
    private final Thermostat thermostat;
    private final int newTemp;
    private int prevTemp;

    public TemperatureChangeCommand(Thermostat thermostat, int newTemp) {
        this.thermostat = thermostat;
        this.newTemp = newTemp;
    }

    @Override
    public void execute() {
        prevTemp = thermostat.getTemperature();
        thermostat.setTemperature(newTemp);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(prevTemp);
    }

    @Override
    public String name() {
        return "Thermostat -> " + newTemp + "°C";
    }
}
