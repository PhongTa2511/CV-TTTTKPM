public class MayTinh {
    private String ten;
    private BoNho boNho;

    public MayTinh(String ten, BoNho boNho) {
        this.ten = ten;
        this.boNho = boNho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public BoNho getBoNho() {
        return boNho;
    }

    public void setBoNho(BoNho boNho) {
        this.boNho = boNho;
    }

    public void hienThiThongTin() {
        System.out.println("Tên máy tính: " + ten);
        if (boNho != null) {
            boNho.hienThiThongTin();
        } else {
            System.out.println("Không có bộ nhớ.");
        }
    }
}
