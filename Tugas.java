public class Tugas implements Comparable{
    private int priority;
    private String description;

    public Tugas(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Object o) {
        Tugas tugas = (Tugas) o;
        if (this.priority > tugas.getPriority()) {
            return 1;
        } else if (this.priority < tugas.getPriority()) {
            return -1;
        }
        return 0;
    }
}