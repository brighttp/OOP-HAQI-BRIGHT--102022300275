import java.time.LocalDate;

public class Task {
    private String title;
    private String priority;
    private String status;
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private final LocalDate DueDate;

    // TO DO: Buat constructor untuk kelas Task
    public Task (String title, String priority, LocalDate dueDate, String status){
        this.title = title;
        this.priority = priority;
        this.DueDate = dueDate;
        this.status = status;
    }
    // TO DO: Buat getter untuk title
    public String gettitle(String title){
        return title;
    }
    // TO DO: Buat getter untuk priority
    public String getpriority(String Priority){
        return priority;
    }
    // TO DO: Buat getter untuk dueDate
    public String getDuedate(LocalDate DueDate){
        return priority;
    }
    // TO DO: Buat getter untuk status
    public String getstatus(String status){
        return status;
    }
    // TO DO: Buat setter untuk status
    public void setstatus(String status){
        this.status = status;
    }
}
