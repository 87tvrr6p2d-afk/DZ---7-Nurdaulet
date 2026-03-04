public class TVOffCommand implements ICommand {
    private final TV tv;

    public TVOffCommand(TV tv) { this.tv = tv; }

    @Override public void execute() { tv.off(); }
    @Override public void undo() { tv.on(); }
    @Override public String name() { return "TV OFF"; }
}
