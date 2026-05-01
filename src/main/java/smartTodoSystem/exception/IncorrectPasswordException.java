package smartTodoSystem.exception;

public class IncorrectPasswordException extends UserNotFoundException {
    public IncorrectPasswordException() {
        super("Incorrect password");
    }
}
