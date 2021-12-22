public class KiemThuVien extends NhanVien{
    private int soLoi;

    public KiemThuVien(){this.role = "(Lập kiểm viên)";}

    public KiemThuVien(String ten, int gt,String ngaySinh,
                       String email, double luongCB, double heSo, int soLoi){
        super(ten, gt, ngaySinh, email, luongCB, heSo);
        this.soLoi = soLoi;
        this.setRole("(Kiểm thử viên)");
    }

    public KiemThuVien(String ten, int gt,String ngaySinh,
                       String email, double luongCB, double heSo, PhongBan pb, int soLoi){
        super(ten, gt, ngaySinh, email, luongCB, heSo, pb);
        this.soLoi = soLoi;
        this.setRole("(Kiểm thử viên)");
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + this.soLoi*0.2;
    }

    @Override
    public String toString() {
        return super.toString() + "Số lỗi phát hiện: " + this.soLoi + "\n";
    }

    @Override
    public void nhapThongTinNV() {
        super.nhapThongTinNV();
        System.out.print("\tNhập số giờ làm thêm: ");
        soLoi = sc.nextInt();
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }
}
