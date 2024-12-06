public class ChuyenBay {
    private String maChuyenBay;
    private String noiDi;
    private String noiDen;
    private String thoiGian;

    public ChuyenBay(String maChuyenBay, String noiDi, String noiDen, String thoiGian) {
        this.maChuyenBay = maChuyenBay;
        this.noiDi = noiDi;
        this.noiDen = noiDen;
        this.thoiGian = thoiGian;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public String getNoiDi() {
        return noiDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public String getThoiGian() {
        return thoiGian;
    }
}
