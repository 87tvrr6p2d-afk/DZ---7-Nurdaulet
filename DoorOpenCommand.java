public class DoorOpenCommand implements ICommand {
    private final Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override public void execute() { door.open(); }
    @Override public void undo() { door.close(); }
    @Override public String name() { return "Door OPEN"; }
}
