public class LightOnCommand implements ICommand {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override public void execute() { light.on(); }
    @Override public void undo() { light.off(); }
    @Override public String name() { return "Light ON"; }
}
