interface LichBaoVeBuilder {
    void chonSinhVien(SinhVien sv);
    void ganHoiDong(HoiDongChamThi hd);
    void chonNgay(String ngay);
    void chonGio(String gio);
    void chonDiaDiem(String diaDiem);
    LichBaoVe build();
}

