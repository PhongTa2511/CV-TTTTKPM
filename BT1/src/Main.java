public class Main {
    public static void main(String[] args) {
        BoNho boNho = new BoNho("SSD", 512);
        MayTinh mayTinh = new MayTinh("Laptop Dell", boNho);

        mayTinh.hienThiThongTin();

        // Kiểm tra khi xóa bộ nhớ
        mayTinh.setBoNho(null);
        System.out.println("\nSau khi xóa bộ nhớ:");
        mayTinh.hienThiThongTin();
    }
}