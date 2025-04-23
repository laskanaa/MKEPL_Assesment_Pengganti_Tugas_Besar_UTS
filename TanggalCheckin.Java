import java.util.Date;

public class CheckinDate {
    private Date checkin;

    public CheckinDate(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    @Override
    public String toString() {
        return "Check-in: " + checkin;
    }
}
