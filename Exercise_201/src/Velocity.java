
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Velocity implements Serializable{
    
    private LocalDate date;
    private LocalTime time;
    private int gemessen;
    private int erlaubt;
    private int uebertreten;
    
    private transient DateTimeFormatter dtfdate = DateTimeFormatter.ofPattern("dd.MM.yyyy"); 
    private transient DateTimeFormatter dtftime = DateTimeFormatter.ofPattern("hh:mm");

    public Velocity(LocalDate date, LocalTime time, int gemessen, int erlaubt, int uebertreten) {
        this.date = date;
        this.time = time;
        this.gemessen = gemessen;
        this.erlaubt = erlaubt;
        this.uebertreten = uebertreten;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getGemessen() {
        return gemessen;
    }

    public int getErlaubt() {
        return erlaubt;
    }

    public int getUebertreten() {
        return uebertreten;
    }

    public DateTimeFormatter getDtfdate() {
        return dtfdate;
    }

    public DateTimeFormatter getDtftime() {
        return dtftime;
    }
    
    

}
