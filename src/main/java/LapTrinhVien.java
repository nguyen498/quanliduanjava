public class LapTrinhVien extends NhanVien {
    private int soGioLamThem;

    public LapTrinhVien(){this.role = "(Lập trình viên)";}

    public LapTrinhVien (String ten, int gt,String ngaySinh,
                         String email, double luongCB, double heSo){
        super(ten, gt, ngaySinh, email, luongCB, heSo);
        this.setRole("(Lập trình viên)");
    }

    @Override
    public double tinhLuong() {
        System.out.print("Nhập số giờ làm thêm: ");
        this.soGioLamThem = sc.nextInt();

        return super.tinhLuong() + this.soGioLamThem * 0.2;
    }


    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }
}
