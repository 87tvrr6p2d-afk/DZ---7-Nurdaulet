public class User {
    private final String name;
    private final IMediator mediator;

    public User(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void joinChat() {
        mediator.join(this);
    }

    public void leaveChat() {
        mediator.leave(this);
    }

    public void send(String message) {
        System.out.println(name + " (public): " + message);
        mediator.sendToAll(message, this);
    }

    public void sendPrivate(String receiverName, String message) {
        System.out.println(name + " (private -> " + receiverName + "): " + message);
        mediator.sendPrivate(message, this, receiverName);
    }

    public void receive(String message) {
        System.out.println("[" + name + " got] " + message);
    }
}
