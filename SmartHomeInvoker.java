import java.util.ArrayDeque;
import java.util.Deque;

public class SmartHomeInvoker {
    private final Deque<ICommand> history = new ArrayDeque<>();
    private ICommand current;

    public void setCommand(ICommand command) {
        this.current = command;
    }

    public void pressExecute() {
        if (current == null) {
            System.out.println("[Error] No command assigned.");
            return;
        }
        current.execute();
        history.push(current);
        System.out.println("Executed: " + current.name());
    }

    public void pressUndo() {
        if (history.isEmpty()) {
            System.out.println("[Error] Nothing to undo (no executed commands).");
            return;
        }
        ICommand last = history.pop();
        last.undo();
        System.out.println("Undone: " + last.name());
    }

    public void undoMany(int times) {
        for (int i = 0; i < times; i++) {
            pressUndo();
        }
    }
}
