package duke.task;

public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    /**
     * generates string of task to save in storage file
     * @return string of task
     */
    @Override
    public String stringToSave() {
        char status = this.isDone ? '1' : '0';
        return "T " + "| " + status + " | " + this.description;
    }

}