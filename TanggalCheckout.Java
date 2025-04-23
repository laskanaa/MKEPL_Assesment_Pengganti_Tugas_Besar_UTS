import java.util.Date;

public class CheckoutDate {
    private Date checkout;

    public CheckoutDate(Date checkout) {
        this.checkout = checkout;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Check-out: " + checkout;
    }
}
