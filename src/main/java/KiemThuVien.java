public class KiemThuVien extends NhanVien{
    private int soLoi;

    public KiemThuVien(){this.role = "(Lập kiểm viên)";}

    public KiemThuVien(String ten, int gt,String ngaySinh,
                       String email, double luongCB, double heSo){
        super(ten, gt, ngaySinh, email, luongCB, heSo);
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
        System.out.print("Nhập số lỗi phát hiện: ");
        this.soLoi = sc.nextInt();

        return super.tinhLuong() + this.soLoi * 0.2;
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }
}
