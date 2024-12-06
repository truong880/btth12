import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create some sample flights (ChuyenBay)
        ChuyenBay cb1 = new ChuyenBay("CB001", "Hanoi", "Ho Chi Minh", "2024-12-10 08:00");
        ChuyenBay cb2 = new ChuyenBay("CB002", "Ho Chi Minh", "Da Nang", "2024-12-11 10:00");

        // Create a new passenger (HanhKhach)
        HanhKhach hk1 = new HanhKhach("HK123", "Nguyen Anh", 1990, "123456789");

        // Display the welcome message and main menu
        while (true) {
            System.out.println("\n==================== MENU ====================");
            System.out.println("1. Đặt vé");
            System.out.println("2. Kiểm tra trạng thái vé");
            System.out.println("3. Đổi vé");
            System.out.println("4. Hủy vé");
            System.out.println("5. Tích lũy điểm bay");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn (1-6): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Booking tickets
                    System.out.println("Bạn muốn đặt vé cho chuyến bay nào?");
                    System.out.println("1. Chuyến bay 1 (Hanoi -> Ho Chi Minh)");
                    System.out.println("2. Chuyến bay 2 (Ho Chi Minh -> Da Nang)");
                    System.out.print("Chọn chuyến bay (1-2): ");
                    int flightChoice = scanner.nextInt();
                    System.out.print("Nhập hạng ghế (A/B/C): ");
                    char seatClass = scanner.next().charAt(0);

                    if (flightChoice == 1) {
                        if (hk1.datVe(cb1, seatClass)) {
                            System.out.println("Đặt vé thành công cho chuyến bay: " + cb1.getMaChuyenBay());
                        } else {
                            System.out.println("Không thể đặt vé. Vé đã hết.");
                        }
                    } else if (flightChoice == 2) {
                        if (hk1.datVe(cb2, seatClass)) {
                            System.out.println("Đặt vé thành công cho chuyến bay: " + cb2.getMaChuyenBay());
                        } else {
                            System.out.println("Không thể đặt vé. Vé đã hết.");
                        }
                    } else {
                        System.out.println("Chọn chuyến bay không hợp lệ.");
                    }
                    break;

                case 2:
                    // Checking ticket status
                    System.out.print("Nhập mã vé (VD: V1001): ");
                    String ticketCode = scanner.next();
                    System.out.println("Trạng thái của vé " + ticketCode + ": " + hk1.kiemTraTrangThaiVe(ticketCode));
                    break;

                case 3:
                    // Exchanging tickets
                    System.out.print("Nhập mã vé cần đổi (VD: V1001): ");
                    String ticketCodeToExchange = scanner.next();
                    System.out.print("Nhập chuyến bay mới: ");
                    String newFlightCode = scanner.next();
                    double exchangeFee = hk1.doiVe(ticketCodeToExchange, newFlightCode);
                    System.out.println("Phí đổi vé: " + exchangeFee);
                    break;

                case 4:
                    // Cancelling tickets
                    System.out.print("Nhập mã vé cần hủy (VD: V1001): ");
                    String ticketCodeToCancel = scanner.next();
                    double refundAmount = hk1.huyVe(ticketCodeToCancel);
                    System.out.println("Số tiền hoàn vé: " + refundAmount);
                    break;

                case 5:
                    // Accumulating miles
                    System.out.print("Nhập số km tích lũy: ");
                    double km = scanner.nextDouble();
                    System.out.print("Nhập hạng ghế (A/B/C): ");
                    char seatClassForMiles = scanner.next().charAt(0);
                    hk1.tichLuyDamBay(km, seatClassForMiles);
                    break;

                case 6:
                    // Exit
                    System.out.println("Cảm ơn bạn đã sử dụng dịch vụ!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}
