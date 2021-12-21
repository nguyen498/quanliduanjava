import java.util.ArrayList;

public class PhongBan {
    private int maPB;
    private String tenPB;
    private ArrayList<NhanVien> dsNV;

    /*Phuong thuc getter setter của class PhongBan*/
    public int getMaPB() {
        return maPB;
    }

    public void setMaPB(int maPB) {
        this.maPB = maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public ArrayList<NhanVien> getDsNV() {
        return dsNV;
    }

    public void setDsNV(ArrayList<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }
}
