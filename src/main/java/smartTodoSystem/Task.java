package smartTodoSystem;

import smartTodoSystem.enums.Priority;
import smartTodoSystem.enums.Status;

import java.time.LocalDateTime;

public class Task {
    //📦 Field-lər:
    //id → task nömrəsi
    //title → işin adı
    //description → iş haqqında izah
    //status → task vəziyyəti
    //priority → vaciblik dərəcəsi
    //deadline → son tarix (optional)
    private final int id;
    private String title;
    private String description;
    private Status status;
    private Priority priority;
    private LocalDateTime deadline;
    private static int idCounter = 0;
    public Task(String title, String description, Priority priority, LocalDateTime deadline) {
        this.id = idCounter++;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
        this.status = Status.TODO;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", deadline=" + deadline +
                '}';
    }
}
