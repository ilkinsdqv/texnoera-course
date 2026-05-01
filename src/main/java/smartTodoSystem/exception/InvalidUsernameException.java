package smartTodoSystem.exception;

public class InvalidUsernameException extends UserNotFoundException {
    public InvalidUsernameException() {
        super("Invalid username");
    }
}
