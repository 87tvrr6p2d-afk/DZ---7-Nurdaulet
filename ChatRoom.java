import java.util.*;

public class ChatRoom implements IMediator {

    private final Map<String, User> users = new HashMap<>();

    @Override
    public void join(User user) {
        users.put(user.getName(), user);
        broadcastSystem(user.getName() + " joined the chat.", user);
    }

    @Override
    public void leave(User user) {
        if (users.remove(user.getName()) != null) {
            broadcastSystem(user.getName() + " left the chat.", user);
        }
    }

    @Override
    public void sendToAll(String message, User sender) {
        if (!isMember(sender)) {
            System.out.println("[Error] " + sender.getName() + " is not in the chat.");
            return;
        }
        for (User u : users.values()) {
            if (!u.getName().equals(sender.getName())) {
                u.receive(sender.getName() + ": " + message);
            }
        }
    }

    @Override
    public void sendPrivate(String message, User sender, String receiverName) {
        if (!isMember(sender)) {
            System.out.println("[Error] " + sender.getName() + " is not in the chat.");
            return;
        }
        User receiver = users.get(receiverName);
        if (receiver == null) {
            System.out.println("[Error] Receiver '" + receiverName + "' not found.");
            return;
        }
        receiver.receive("[PM from " + sender.getName() + "]: " + message);
        sender.receive("[PM to " + receiverName + "]: " + message);
    }

    private boolean isMember(User user) {
        return users.containsKey(user.getName());
    }

    private void broadcastSystem(String msg, User except) {
        for (User u : users.values()) {
            if (!u.getName().equals(except.getName())) {
                u.receive("[System] " + msg);
            }
        }
    }
}
