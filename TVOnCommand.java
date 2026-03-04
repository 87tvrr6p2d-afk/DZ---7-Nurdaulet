public class TVOnCommand implements ICommand {
    private final TV tv;

    public TVOnCommand(TV tv) { this.tv = tv; }

    @Override public void execute() { tv.on(); }
    @Override public void undo() { tv.off(); }
    @Override public String name() { return "TV ON"; }
}
