import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DuAn {
    private static int dem = 0;
    private int maDA=++dem;
    private String tenDA;
    private Date ngayBD;
    private Date ngayKT;
    private double tongKinhPhi;
    private NhanVien truongDA;
    private List<NhanVien> dsNV = new ArrayList<>();
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    public DuAn(){}

    public DuAn (String ten, String nbd, String nkt, double kp){
        this.tenDA = ten;
        try{
            this.ngayBD = df.parse(nbd);
            this.ngayKT = df.parse(nkt);
        }
        catch(ParseException ex){System.out.println("Loi: " + ex);}
        this.tongKinhPhi = kp;
    }

    public void themTDA(NhanVien nv){
        this.truongDA = nv;
        this.truongDA.themDA(this);
    }

    public void themNVVaoDA(NhanVien nv){
        this.dsNV.add(nv);
        nv.themDA(this);
    }

    public void nhapThongTin (){
        System.out.print("\tNhập tên dự án: ");
        String tenDA = Support.chuanHoa(sc.nextLine());
        if (!tenDA.equalsIgnoreCase("=")) {
            this.tenDA = tenDA;
        }

        System.out.print("\tNgày bắt đầu (dd/MM/yyyy): ");
        String nbd = Support.chuanHoa(sc.nextLine());
        if (!nbd.equalsIgnoreCase("=")) {
            this.ngayBD = Support.nhapNgayThangNam(nbd);
        }

        System.out.print("\tNgày kết thúc (dd/MM/yyyy): ");
        String nkt = Support.chuanHoa(sc.nextLine());
        if (!nkt.equalsIgnoreCase("=")) {
            this.ngayKT = Support.nhapNgayThangNam(nkt);
        }

        System.out.print("\tTổng kinh phí: ");
        double kp = sc.nextDouble();
        this.tongKinhPhi = kp;
    }

    @Override
    public String toString() {
        return String.format("Mã dự án: %d\n" +
                "Tên dự án: %s\n" +
                "Ngày bắt đầu: %s\n" +
                "Ngày kết thức: %s\n" +
                "Tồng kinh phí: %.1f triệu\n",
                this.maDA,
                this.tenDA,
                Support.xuatNgayThangNam(this.ngayBD),
                Support.xuatNgayThangNam(this.ngayKT),
                this.tongKinhPhi
        );
    }

    public void hienThi(){
        System.out.printf("Tên dự án: %s\n", this.tenDA);
        System.out.print("===Danh sách nhân viên===\n");
        System.out.printf("Trưởng dự án: %s\n", this.truongDA.getHoTen());
        dsNV.forEach(nv -> System.out.printf("ID: %d\t Tên NV: %s\n", nv.getId(), nv.getHoTen()));
    }

    /*Phuong thuc getter setter của class DuAn*/
    public int getMaDA() {
        return maDA;
    }

    public void setMaDA(int maDA) {
        this.maDA = maDA;
    }

    public String getTenDA() {
        return tenDA;
    }

    public void setTenDA(String tenDA) {
        this.tenDA = tenDA;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public double getTongKinhPhi() {
        return tongKinhPhi;
    }

    public void setTongKinhPhi(double tongKinhPhi) {
        this.tongKinhPhi = tongKinhPhi;
    }

    public NhanVien getTruongDA() {
        return truongDA;
    }

    public void setTruongDA(NhanVien truongDA) {
        this.truongDA = truongDA;
    }

    public List<NhanVien> getDsNV() {
        return dsNV;
    }

    public void setDsNV(List<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }
}
