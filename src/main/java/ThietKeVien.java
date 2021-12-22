public class ThietKeVien extends NhanVien{
    private double bonus;

    public ThietKeVien(){this.role = "(Thiết kế viên)";}

    public ThietKeVien (String ten, int gt,String ngaySinh,
                        String email, double luongCB, double heSo,double bonus){
        super(ten, gt, ngaySinh, email, luongCB, heSo);
        this.setBonus(bonus);
        this.role = "(Thiết kế viên)";
    }

    public ThietKeVien (String ten, int gt,String ngaySinh,
                        String email, double luongCB, double heSo, PhongBan pb,double bonus){
        super(ten, gt, ngaySinh, email, luongCB, heSo, pb);
        this.setBonus(bonus);
        this.role = "(Thiết kế viên)";
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + this.getBonus();
    }

    @Override
    public void nhapThongTinNV() {
        super.nhapThongTinNV();
        System.out.print("\tNhập số lỗi phát hiện: ");
        this.setBonus(sc.nextDouble());
    }

    @Override
    public String toString() {
        return super.toString() + "Bonus: " + this.getBonus() + "\n";
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
