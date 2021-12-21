import java.util.ArrayList;
import java.util.Date;

public class DuAn {
    private int maDA;
    private String tenDA;
    private Date ngayBD;
    private Date ngayKT;
    private double tongKinhPhi;
    private NhanVien truongDA;
    private ArrayList<NhanVien> dsNV;

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

    public ArrayList<NhanVien> getDsNV() {
        return dsNV;
    }

    public void setDsNV(ArrayList<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }
}
