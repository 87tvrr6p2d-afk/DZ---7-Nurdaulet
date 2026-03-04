public class Light {
    private boolean isOn = false;

    public void on() {
        isOn = true;
        System.out.println("Light: ON");
    }

    public void off() {
        isOn = false;
        System.out.println("Light: OFF");
    }

    public boolean isOn() {
        return isOn;
    }
}
