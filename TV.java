public class TV {
    private boolean isOn = false;

    public void on() {
        isOn = true;
        System.out.println("TV: ON");
    }

    public void off() {
        isOn = false;
        System.out.println("TV: OFF");
    }
}
