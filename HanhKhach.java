public class HanhKhach {
    private String maHanhKhach;
    private String tenHanhKhach;
    private int namSinh;
    private String soCMT;

    public HanhKhach(String maHanhKhach, String tenHanhKhach, int namSinh, String soCMT) {
        this.maHanhKhach = maHanhKhach;
        this.tenHanhKhach = tenHanhKhach;
        this.namSinh = namSinh;
        this.soCMT = soCMT;
    }

    public boolean datVe(ChuyenBay chuyenBay, char hạngGhế) {
        // Logic to book the ticket
        System.out.println("Đặt vé cho chuyến bay: " + chuyenBay.getMaChuyenBay());
        return true; // Return true if booking is successful
    }

    public String kiemTraTrangThaiVe(String maVe) {
        // Check ticket status
        return "Đã xác nhận"; // Return ticket status
    }

    public double doiVe(String maVe, String maChuyenBayMoi) {
        // Handle ticket change
        System.out.println("Đổi vé thành công từ " + maVe + " sang " + maChuyenBayMoi);
        return 100.0; // Example fee for exchanging the ticket
    }

    public double huyVe(String maVe) {
        // Cancel ticket and refund
        return 100.0; // Example refund
    }

    public void tichLuyDamBay(double km, char hạngGhế) {
        // Logic to accumulate miles
        System.out.println("Tích lũy " + km + " km cho hạng ghế " + hạngGhế);
    }
}
