public class DoorCloseCommand implements ICommand {
    private final Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override public void execute() { door.close(); }
    @Override public void undo() { door.open(); }
    @Override public String name() { return "Door CLOSE"; }
}
