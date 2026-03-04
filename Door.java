public class Door {
    private boolean isOpen = false;

    public void open() {
        isOpen = true;
        System.out.println("Door: OPEN");
    }

    public void close() {
        isOpen = false;
        System.out.println("Door: CLOSED");
    }

    public boolean isOpen() {
        return isOpen;
    }
}
