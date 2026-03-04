public class MainMediator {
    public static void main(String[] args) {
        IMediator chat = new ChatRoom();

        User a = new User("Ali", chat);
        User n = new User("Nurdaulet", chat);
        User d = new User("Dana", chat);

        // error: not in chat yet
        n.send("Hello? anyone here?");

        a.joinChat();
        n.joinChat();
        d.joinChat();

        n.send("Сәлем бәріне!");
        a.sendPrivate("Dana", "Hi Dana!");
        d.leaveChat();

        a.send("Dana left?");
        a.sendPrivate("Dana", "Where are you?"); // receiver not found
    }
}
