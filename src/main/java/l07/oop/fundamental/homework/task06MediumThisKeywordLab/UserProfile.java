package l07.oop.fundamental.homework.task06MediumThisKeywordLab;

public class UserProfile {
    //Create UserProfile class with fields: username, email, active.
    //Implement constructor overloading:
    //full constructor
    //constructor with only username and email (active = true)
    //Use this(...) constructor chaining.
    //Use this.field = parameter in constructors/setters.
    private String userName;
    private String email;
    private boolean active;

    public UserProfile(String userName, String email) {
        this(userName, email, true);
    }

    public UserProfile(String userName, String email, boolean active) {
        this.userName = userName;
        this.email = email;
        this.active = active;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
