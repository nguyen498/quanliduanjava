public class LapTrinhVien extends NhanVien {
    private int soGioLamThem;

    public LapTrinhVien(){this.role = "(Lập trình viên)";}

    public LapTrinhVien (String ten, int gt,String ngaySinh,
                         String email, double luongCB, double heSo,int soGioLamThem){
        super(ten, gt, ngaySinh, email, luongCB, heSo);
        this.soGioLamThem =soGioLamThem;
        this.setRole("(Lập trình viên)");
    }

    public LapTrinhVien (String ten, int gt,String ngaySinh,
                         String email, double luongCB, double heSo, PhongBan pb,int soGioLamThem){
        super(ten, gt, ngaySinh, email, luongCB, heSo, pb);
        this.setSoGioLamThem(soGioLamThem);
        this.setRole("(Lập trình viên)");
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + this.soGioLamThem * 0.2;
    }

    @Override
    public void nhapThongTinNV() {
        super.nhapThongTinNV();
        System.out.print("\tNhập số lỗi phát hiện: ");
        soGioLamThem = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "Số giờ làm thêm: " + this.soGioLamThem + "\n";
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }
}
