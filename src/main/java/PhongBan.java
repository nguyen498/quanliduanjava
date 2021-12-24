import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhongBan {
    private static int demPB = 0;
    private int maPB =++demPB;
    private String tenPB;
    private TruongPB truongPB;
    private List<NhanVien> dsNV = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public PhongBan(){}

    public PhongBan(String ten){
        this.tenPB = ten;
    }

    public PhongBan(String ten, TruongPB tp){
        this.tenPB = ten;
        this.truongPB = tp;
    }

    public void nhapPB(){
        String s = sc.nextLine();
        this.tenPB = s;
    }

    public void themNVVaoPB(NhanVien nv){
        this.dsNV.add(nv);
    }

    public void themTP(TruongPB tp){
        this.truongPB = tp;
    }

    public void nhapThongTin() {
        System.out.print("\tTên phòng ban: ");
        this.tenPB = sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%d. %s.", this.maPB, this.tenPB);
    }

    public void hienThi (){
        System.out.printf("===Danh sách nhân viên của phòng ban %s===\n", this.tenPB);
        System.out.printf("-Trưởng phòng: %s\n", this.truongPB.getHoTen());
        this.dsNV.forEach((nv) -> {
            System.out.printf("ID: %d\tHọ Tên: %s\n", nv.getId(), nv.getHoTen());
        });
    }

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

    public List<NhanVien> getDsNV() {
        return dsNV;
    }

    public void setDsNV(List<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }

    public TruongPB getTruongPB() {
        return truongPB;
    }

    public void setTruongPB(TruongPB truongPB) {
        this.truongPB = truongPB;
    }
}
