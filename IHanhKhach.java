public interface IHanhKhach {
    boolean datVe(String maChuyenBay, char hangGhe);
    double huyVe(String maVe);
    double doiVe(String maVeCu, String maChuyenBayMoi);
    char kiemTraTrangThaiVe(String maVe);
    void tichLuyDamBay(int soKm, char hangGhe); // Added this method
}
