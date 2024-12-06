import java.util.ArrayList;

public class HangBay {
    private String id;
    private String tenHangBay;
    private ArrayList<ChuyenBay> danhSachChuyenBay;
    private ArrayList<HanhKhach> danhSachHanhKhach;

    public HangBay(String id, String tenHangBay) {
        this.id = id;
        this.tenHangBay = tenHangBay;
        this.danhSachChuyenBay = new ArrayList<>();
        this.danhSachHanhKhach = new ArrayList<>();
    }

    // Thêm chuyến bay vào danh sách
    public void themChuyenBay(ChuyenBay chuyenBay) {
        danhSachChuyenBay.add(chuyenBay);
    }

    // Thêm hành khách vào danh sách
    public void themHanhKhach(HanhKhach hanhKhach) {
        danhSachHanhKhach.add(hanhKhach);
    }

    // Tìm chuyến bay theo mã
    public ChuyenBay timChuyenBay(String maChuyenBay) {
        for (ChuyenBay cb : danhSachChuyenBay) {
            if (cb.getMaChuyenBay().equals(maChuyenBay)) {
                return cb; // Trả về chuyến bay nếu tìm thấy
            }
        }
        return null; // Trả về null nếu không tìm thấy chuyến bay
    }

    // Getter, Setter và các phương thức khác
    public String getId() {
        return id;
    }

    public String getTenHangBay() {
        return tenHangBay;
    }

    public ArrayList<ChuyenBay> getDanhSachChuyenBay() {
        return danhSachChuyenBay;
    }

    public ArrayList<HanhKhach> getDanhSachHanhKhach() {
        return danhSachHanhKhach;
    }


    @Override
    public String toString() {
        return "HangBay{" +
                "id='" + id + '\'' +
                ", tenHangBay='" + tenHangBay + '\'' +
                ", danhSachChuyenBay=" + danhSachChuyenBay +
                ", danhSachHanhKhach=" + danhSachHanhKhach +
                '}';
    }
}
