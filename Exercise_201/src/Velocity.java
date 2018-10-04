
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Velocity implements Serializable{
    
    private LocalDate date;
    private LocalTime time;
    private String sign;
    private int gemessen;
    private int erlaubt;
    private int uebertreten = gemessen - erlaubt;
    
    private transient DateTimeFormatter dtfdate = DateTimeFormatter.ofPattern("dd.MM.yyyy"); 
    private transient DateTimeFormatter dtftime = DateTimeFormatter.ofPattern("HH:mm");

    public Velocity(LocalDate date, LocalTime time, String sign,int gemessen, int erlaubt) {
        this.date = date;
        this.time = time;
        this.sign = sign;
        this.gemessen = gemessen;
        this.erlaubt = erlaubt;
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
        uebertreten = gemessen-erlaubt;
        return uebertreten;
    }

    public DateTimeFormatter getDtfdate() {
        return dtfdate;
    }

    public DateTimeFormatter getDtftime() {
        return dtftime;
    }

    public String getSign() {
        return sign;
    }
}
