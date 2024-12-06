public class Ticket {
    private String maVe;
    private String maChuyenBay;
    private char hangGhe;
    private char trangThai;

    public Ticket(String maVe, String maChuyenBay, char hangGhe) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.hangGhe = hangGhe;
        this.trangThai = 'D'; // Default status is "Đã đặt" (Booked)
    }

    public String getMaVe() {
        return maVe;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public char getHangGhe() {
        return hangGhe;
    }

    public char getTrangThai() {
        return trangThai;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setTrangThai(char trangThai) {
        this.trangThai = trangThai;
    }

    public double tinhTienHoan() {
        // Refund calculation based on the seat class (e.g., 'A' = 100%, 'B' = 80%, etc.)
        switch (hangGhe) {
            case 'A':
                return 100.0;
            case 'B':
                return 80.0;
            case 'C':
                return 50.0;
            default:
                return 0.0;
        }
    }

    public double tinhTienDoi() {
        // Calculate exchange fee based on the seat class
        switch (hangGhe) {
            case 'A':
                return 150.0;
            case 'B':
                return 100.0;
            case 'C':
                return 50.0;
            default:
                return 0.0;
        }
    }
}
