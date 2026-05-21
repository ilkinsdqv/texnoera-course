package smartTodoSystem.exception;

public class UsernameAlreadyExistsException extends Exception {
    public UsernameAlreadyExistsException(String username) {
        super("Username already exists: " + username);
    }
}
