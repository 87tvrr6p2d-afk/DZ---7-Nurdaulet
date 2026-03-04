public class MainCommand {
    public static void main(String[] args) {
        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat(22);
        TV tv = new TV();

        SmartHomeInvoker invoker = new SmartHomeInvoker();

        invoker.pressUndo(); // ошибка: нечего отменять

        invoker.setCommand(new LightOnCommand(light));
        invoker.pressExecute();

        invoker.setCommand(new DoorOpenCommand(door));
        invoker.pressExecute();

        invoker.setCommand(new TemperatureChangeCommand(thermostat, 26));
        invoker.pressExecute();

        invoker.setCommand(new TVOnCommand(tv));
        invoker.pressExecute();

        System.out.println("---- UNDO x3 ----");
        invoker.undoMany(3);
    }
}
