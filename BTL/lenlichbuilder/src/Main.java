
public class Main {
    public static void main(String[] args) {
        LichBaoVeBuilder builder = new ConcreteLichBaoVeBuilder();
        VanPhongKhoa vanPhong = new VanPhongKhoa();

        LichBaoVe lich = vanPhong.taoLich(builder);

        System.out.println("=== Lịch Bảo Vệ Đồ Án ===");
        System.out.println("Sinh viên: Nguyễn Văn A");
        System.out.println("Hội đồng: Hội đồng 1");
        System.out.println("Ngày: 10/06/2025");
        System.out.println("Giờ: 09:00");
        System.out.println("Địa điểm: Phòng 204");
    }
}
