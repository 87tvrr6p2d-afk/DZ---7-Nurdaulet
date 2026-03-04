public interface IMediator {
    void join(User user);
    void leave(User user);

    void sendToAll(String message, User sender);
    void sendPrivate(String message, User sender, String receiverName);
}
