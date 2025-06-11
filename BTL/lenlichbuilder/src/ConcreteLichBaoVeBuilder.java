class ConcreteLichBaoVeBuilder implements LichBaoVeBuilder {
    private LichBaoVe lich = new LichBaoVe();

    public void chonSinhVien(SinhVien sv) { lich.setSinhVien(sv); }
    public void ganHoiDong(HoiDongChamThi hd) { lich.setHoiDong(hd); }
    public void chonNgay(String ngay) { lich.setNgay(ngay); }
    public void chonGio(String gio) { lich.setGio(gio); }
    public void chonDiaDiem(String diaDiem) { lich.setDiaDiem(diaDiem); }

    public LichBaoVe build() {
        return lich;
    }
}