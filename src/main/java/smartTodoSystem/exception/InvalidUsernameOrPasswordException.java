package smartTodoSystem.exception;

public class InvalidUsernameOrPasswordException extends UserNotFoundException {
    public InvalidUsernameOrPasswordException() {
        super("Invalid username or password");
    }
}
