import java.text.ParseException;
import java.util.Date;

public class TruongPB extends NhanVien {
    private Date ngayNhanChuc;
    private PhongBan pbql;

    public TruongPB(){}

    public TruongPB(String ten, int gt, String ngaySinh, String email,
                    double luongCB, double heSo, String ngayNhanChuc) {

        super(ten, gt, ngaySinh, email, luongCB, heSo);
        try{this.ngayNhanChuc = df.parse(ngayNhanChuc);}
        catch(ParseException ex){System.out.println("Loi: " + ex);}
    }

    public TruongPB(String ten, int gt, String ngaySinh, String email,
                    double luongCB, double heSo, String ngayNhanChuc, PhongBan pbql) {

        super(ten, gt, ngaySinh, email, luongCB, heSo);
        try{this.ngayNhanChuc = df.parse(ngayNhanChuc);}
        catch(ParseException ex){System.out.println("Loi: " + ex);}
        this.pbql = pbql;
        pbql.themTP(this);
    }

    @Override
    public void nhapThongTinNV() {
        super.nhapThongTinNV();
        System.out.print("\tNgày nhận chức (dd/MM/yyyy): ");
        String nnc;
        nnc = sc.nextLine();
        if (!nnc.equalsIgnoreCase("=")) {
            this.ngayNhanChuc = Support.nhapNgayThangNam(nnc);
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %d\n" +
                            "Họ tên: %s (Trưởng phòng ban)\n" +
                            "Giới tính: %s\n" +
                            "Ngày sinh: %s\n" +
                            "Email: %s\n" +
                            "Lương cơ bản: %.1f\n" +
                            "Hệ số lương: %.1f\n" +
                            // "Phòng ban QL: %s\n" +
                            "Ngày nhận chức: %s",
                            super.getId(),
                            super.getHoTen(),
                            super.getGioiTinh() == 0 ? "Nam" : super.getGioiTinh() == 1 ? "Nữ" : "Khác",
                            Support.xuatNgayThangNam(super.getNgaySinh()),
                            super.getEmail(),
                            super.getLuongCoBan(),
                            super.getHeSo(),
                            // this.pbql.getTenPB(),
                            Support.xuatNgayThangNam(ngayNhanChuc)
                );
    }


    public Date getNgayNhanChuc() {
        return ngayNhanChuc;
    }

    public void setNgayNhanChuc(Date ngayNhanChuc) {
        ngayNhanChuc = ngayNhanChuc;
    }
}
