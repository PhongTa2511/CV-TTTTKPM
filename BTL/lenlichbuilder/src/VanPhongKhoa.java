class VanPhongKhoa {
    public LichBaoVe taoLich(LichBaoVeBuilder builder) {
        builder.chonSinhVien(new SinhVien("Nguyễn Văn A"));
        builder.ganHoiDong(new HoiDongChamThi("Hội đồng 1"));
        builder.chonNgay("10/06/2025");
        builder.chonGio("09:00");
        builder.chonDiaDiem("Phòng 204");
        return builder.build();
    }
}

