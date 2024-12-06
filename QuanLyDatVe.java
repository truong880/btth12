import java.util.Scanner;
import java.util.ArrayList;

public class QuanLyDatVe {
    // Danh sách các vé máy bay (giả sử đã có)
    private static ArrayList<VeMayBay> veList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hiển thị tiêu đề
        System.out.println("=====================================");
        System.out.println("   Chương Trình Quản Lý Vé Máy Bay");
        System.out.println("=====================================");

        // Menu chính
        while (true) {
            System.out.println("\nChọn một chức năng:");
            System.out.println("1. Đặt vé");
            System.out.println("2. Kiểm tra trạng thái vé");
            System.out.println("3. Đổi vé");
            System.out.println("4. Hủy vé");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự new line sau khi nhập số

            // Xử lý lựa chọn người dùng
            switch (choice) {
                case 1:
                    datVe(scanner);
                    break;

                case 2:
                    kiemTraVe(scanner);
                    break;

                case 3:
                    doiVe(scanner);
                    break;

                case 4:
                    huyVe(scanner);
                    break;

                case 5:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    scanner.close();
                    return;  // Thoát chương trình

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại!");
            }
        }
    }

    // Đặt vé
    public static void datVe(Scanner scanner) {
        System.out.println("\n--- Đặt Vé Mới ---");
        System.out.print("Nhập mã vé: ");
        String maVe = scanner.nextLine();
        System.out.print("Nhập tên hành khách: ");
        String tenHanhKhach = scanner.nextLine();
        System.out.print("Nhập hạng ghế (A/B/C): ");
        String hangGhe = scanner.nextLine();
        System.out.print("Nhập điểm đi: ");
        String diemDi = scanner.nextLine();
        System.out.print("Nhập điểm đến: ");
        String diemDen = scanner.nextLine();
        System.out.print("Nhập giá vé: ");
        double giaVe = scanner.nextDouble();

        VeMayBay ve = new VeMayBay(maVe, tenHanhKhach, hangGhe, diemDi, diemDen, giaVe);
        veList.add(ve);
        System.out.println("Vé đã được đặt thành công!");
    }

    // Kiểm tra trạng thái vé
    public static void kiemTraVe(Scanner scanner) {
        System.out.println("\n--- Kiểm Tra Trạng Thái Vé ---");
        System.out.print("Nhập mã vé cần kiểm tra: ");
        String maVe = scanner.nextLine();

        for (VeMayBay ve : veList) {
            if (ve.getMaVe().equals(maVe)) {
                System.out.println(ve);
                return;
            }
        }
        System.out.println("Không tìm thấy vé với mã: " + maVe);
    }

    // Đổi vé
    public static void doiVe(Scanner scanner) {
        System.out.println("\n--- Đổi Vé ---");
        System.out.print("Nhập mã vé cần đổi: ");
        String maVe = scanner.nextLine();

        for (VeMayBay ve : veList) {
            if (ve.getMaVe().equals(maVe)) {
                System.out.println("Thông tin vé hiện tại: ");
                System.out.println(ve);

                System.out.print("Nhập hạng ghế mới (A/B/C): ");
                String hangGhe = scanner.nextLine();
                System.out.print("Nhập điểm đi mới: ");
                String diemDi = scanner.nextLine();
                System.out.print("Nhập điểm đến mới: ");
                String diemDen = scanner.nextLine();

                ve.setHangGhe(hangGhe);
                ve.setDiemDi(diemDi);
                ve.setDiemDen(diemDen);

                System.out.println("Vé đã được đổi thành công!");
                System.out.println(ve);
                return;
            }
        }
        System.out.println("Không tìm thấy vé với mã: " + maVe);
    }

    // Hủy vé
    public static void huyVe(Scanner scanner) {
        System.out.println("\n--- Hủy Vé ---");
        System.out.print("Nhập mã vé cần hủy: ");
        String maVe = scanner.nextLine();

        for (VeMayBay ve : veList) {
            if (ve.getMaVe().equals(maVe)) {
                veList.remove(ve);
                System.out.println("Vé đã được hủy thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy vé với mã: " + maVe);
    }
}

class VeMayBay {
    private String maVe;
    private String tenHanhKhach;
    private String hangGhe;
    private String diemDi;
    private String diemDen;
    private double giaVe;

    public VeMayBay(String maVe, String tenHanhKhach, String hangGhe, String diemDi, String diemDen, double giaVe) {
        this.maVe = maVe;
        this.tenHanhKhach = tenHanhKhach;
        this.hangGhe = hangGhe;
        this.diemDi = diemDi;
        this.diemDen = diemDen;
        this.giaVe = giaVe;
    }

    // Getters và Setters
    public String getMaVe() {
        return maVe;
    }

    public String getTenHanhKhach() {
        return tenHanhKhach;
    }

    public String getHangGhe() {
        return hangGhe;
    }

    public String getDiemDi() {
        return diemDi;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setHangGhe(String hangGhe) {
        this.hangGhe = hangGhe;
    }

    public void setDiemDi(String diemDi) {
        this.diemDi = diemDi;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    // Hiển thị thông tin vé
    @Override
    public String toString() {
        return "Mã vé: " + maVe + "\n" +
                "Tên hành khách: " + tenHanhKhach + "\n" +
                "Hạng ghế: " + hangGhe + "\n" +
                "Điểm đi: " + diemDi + "\n" +
                "Điểm đến: " + diemDen + "\n" +
                "Giá vé: " + giaVe + " VND\n";
    }
}
