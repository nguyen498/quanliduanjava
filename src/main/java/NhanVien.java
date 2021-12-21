import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NhanVien {
    private int id;
    private String hoTen;
    private int gioiTinh;
    private Date ngaySinh;
    private String email;
    private double luongCoBan;
    private double heSo;
    private PhongBan phongban;
    private ArrayList<DuAn>dsDuAn;
    private static int dem = 0;
    private Support sp1;

    {
        this.id = dem++;
    }

    public NhanVien(){}

    public NhanVien(String ten, int gt,String ngaySinh, String email, double luongCB, double heSo){
        this.hoTen = sp1.chuanHoa(ten);
        this.gioiTinh = gt;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngaySinh = df.parse(ngaySinh);
        } catch (Exception e) {
            System.out.println(e + "");
        }
        this.email = email;
        this.luongCoBan = luongCB;
        this.heSo = heSo;
    }

    public String toString() {
        String str = String.format("%d"
                        + "\t%-30s"
                        + "\t%-15s"
                        + "\t\t%-6s"
                        + "\t\t%-13s"
                        + "\t\t%-13s"
                        + "\t\t%s",
                this.getId(),
                this.getHoTen(),
                this.getGioiTinh() == 0 ? "Nam" : this.getGioiTinh() == 1 ? "Nữ" : "Khác",
                sp1.xuatNgayThangNam(this.ngaySinh)
        );
        return str;
    }
    public void hienThi(){
        System.out.printf("%d\n%s\n%s\n%s\n%t\n%d\n%d",this.getId(), this.getHoTen(),
                        this.getGioiTinh()==0 ? "Nam" : this.getGioiTinh() == 1 ? "Nữ" : "Khác",
                        sp1.xuatNgayThangNam(this.ngaySinh), this.getEmail(), this.getLuongCoBan(),
                        this.getHeSo());
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

    public ArrayList<DuAn> getDsDuAn() {
        return dsDuAn;
    }

    public void setDsDuAn(ArrayList<DuAn> dsDuAn) {
        this.dsDuAn = dsDuAn;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
