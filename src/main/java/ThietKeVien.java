public class ThietKeVien extends NhanVien{
    private double bonus;

    public ThietKeVien(){this.role = "(Thiết kế viên)";}

    public ThietKeVien (String ten, int gt,String ngaySinh,
                        String email, double luongCB, double heSo){
        super(ten, gt, ngaySinh, email, luongCB, heSo);
        this.role = "(Thiết kế viên)";
    }

    @Override
    public double tinhLuong() {
        System.out.print("Nhập số tiền bonus: ");
        this.bonus = sc.nextDouble();

        return super.tinhLuong() + this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
