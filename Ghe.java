public class Ghe {
    private String maGhe;
    private char hangGhe;
    private boolean trangThai; // true = trống, false = đã đặt
    private double giaCoBan;

    // Constructor
    public Ghe(String maGhe, char hangGhe, boolean trangThai, double giaCoBan) {
        this.maGhe = maGhe;
        this.hangGhe = hangGhe;
        this.trangThai = trangThai;
        this.giaCoBan = giaCoBan;
    }

    // Getter và Setter
    public String getMaGhe() {
        return maGhe;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
