public class PaymentStatus {
    private boolean sudahDibayar;

    public PaymentStatus(boolean sudahDibayar) {
        this.sudahDibayar = sudahDibayar;
    }

    public boolean isSudahDibayar() {
        return sudahDibayar;
    }

    public void setSudahDibayar(boolean sudahDibayar) {
        this.sudahDibayar = sudahDibayar;
    }

    @Override
    public String toString() {
        return sudahDibayar ? "Sudah Dibayar" : "Belum Dibayar";
    }
}
