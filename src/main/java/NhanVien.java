import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class NhanVien {
    public static int dem = 0;
    private int id = ++dem;
    private String hoTen;
    private int gioiTinh;
    private Date ngaySinh;
    private String email;
    protected double luongCoBan;
    protected double heSo;
    protected String role;
    protected PhongBan phongban;
    private List<DuAn> dsDA = new ArrayList<>();
    public static final Scanner sc = new Scanner(System.in);
    public static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public NhanVien(){this.setRole("");}

    public NhanVien(String ten, int gt,String ngaySinh, String email, double luongCB, double heSo){
        this.hoTen = Support.chuanHoa(ten);
        this.gioiTinh = gt;
        try {
            this.ngaySinh = df.parse(ngaySinh);
        } catch (Exception e) {
            System.out.println(e + "");
        }
        this.email = email;
        this.luongCoBan = luongCB;
        this.heSo = heSo;
        this.setRole("");
    }

    public NhanVien(String ten, int gt, String ngaySinh, String email, double luongCB, double heSo, PhongBan pb){
        this.hoTen = Support.chuanHoa(ten);
        this.gioiTinh = gt;
        try {
            this.ngaySinh = df.parse(ngaySinh);
        } catch (Exception e) {
            System.out.println(e + "");
        }
        this.email = email;
        this.luongCoBan = luongCB;
        this.heSo = heSo;
        this.setRole("");
        this.phongban = pb;
        this.phongban.themNVVaoPB(this);
    }

    public void themPB(PhongBan pb){
        this.phongban = pb;
    }

    public void themDA(DuAn da){
        this.dsDA.add(da);
    }

    public double tinhLuong() {
        return this.luongCoBan * this.heSo;
    }

    public void nhapThongTinNV(){
        System.out.print("\tHọ và tên: ");
        String ten = Support.chuanHoa(sc.nextLine());
        if (!ten.equalsIgnoreCase("=")) {
            this.hoTen = ten;
        }

        String gt;
        System.out.print("\tGiới tính: ");
        gt = Support.chuanHoa(sc.nextLine());
        if (!gt.equalsIgnoreCase("=")) {
            if (gt.compareToIgnoreCase("nam") == 0) {
                this.gioiTinh = 0;
            } else if (gt.compareToIgnoreCase("nu") == 0) {
                this.gioiTinh = 1;
            } else {
                this.gioiTinh = -1;
            }
        }

        System.out.print("\tNgày sinh (dd/MM/yyyy): ");
        String ns;
        ns = Support.chuanHoa(sc.nextLine());
        if (!ns.equalsIgnoreCase("=")) {
            this.ngaySinh = Support.nhapNgayThangNam(ns);
        }

        System.out.print("\tEmail: ");
        String email = sc.nextLine();
        if (!email.equalsIgnoreCase("=")) {
            this.email = email;
        }

        System.out.print("\tLương cơ bản: ");
        this.luongCoBan = sc.nextDouble();

        System.out.print("\tHệ số: ");
        this.heSo = sc.nextDouble();

        // sc.nextLine();
        // System.out.print("\tPhòng Ban: ");
        // String pb = Support.chuanHoa(sc.nextLine());
        // this.phongban = new PhongBan(pb);
    }

    @Override
    public String toString(){
        return String.format("ID: %d\n" +
                        "Họ tên: %s %s\n" +
                        "Giới tính: %s\n" +
                        "Ngày sinh: %s\n" +
                        "Email: %s\n" +
                        "Lương cơ bản: %.1f triệu\n" +
                        "Hệ số lương: %.1f\n" ,
                        // "Phòng Ban: %s\n",
                this.getId(),
                this.getHoTen(),
                this.getRole(),
                this.getGioiTinh() == 0 ? "Nam" : this.getGioiTinh() == 1 ? "Nữ" : "Khác",
                Support.xuatNgayThangNam(this.ngaySinh),
                this.getEmail(),
                this.getLuongCoBan(),
                this.getHeSo()
                // this.phongban.getTenPB()
        );
    }

    public void hienThi(){
        System.out.printf("Tên NV: %s\n", this.hoTen);
        System.out.print("===Danh sách dự án===\n");
        dsDA.forEach(da -> System.out.printf("ID: %d\t Tên NV: %s\n", da.getMaDA(), da.getTenDA()));
    }

    /*Phuong thuc getter setter của class NhanVien*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    public PhongBan getPhongban() {
        return phongban;
    }

    public void setPhongban(PhongBan phongban) {
        this.phongban = phongban;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<DuAn> getDsDA() {
        return dsDA;
    }

    public void setDsDA(List<DuAn> dsDA) {
        this.dsDA = dsDA;
    }
}
