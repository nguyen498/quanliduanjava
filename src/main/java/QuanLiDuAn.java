import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuanLiDuAn {
    private List<DuAn> dsDA = new  ArrayList<>();

    public void themDA (DuAn da){
        this.dsDA.add(da);
    }

    public void hienThi (){
        this.dsDA.forEach(da -> {
            System.out.println("=================");
            System.out.print(da);
        });
    }

    public void hienThiDA(){
        if (this.getDsDA().isEmpty()) {
            System.out.println("\t\t### KHÔNG CÓ DỮ LIỆU ###\n");
        } else {
            this.dsDA.forEach(da -> {
                System.out.printf("ID: %d\t Tên DA: %s\n", da.getMaDA(), da.getTenDA());
            });
        }
    }

    public void hienThiDANV(int id){
        if (this.getDsDA().isEmpty()) {
            System.out.println("\n\t\t### KHÔNG CÓ DỮ LIỆU ###");
        } else {
            this.dsDA.get(id-1).getDsNV().forEach(nv ->
                    System.out.printf("ID: %d\t Tên NV: %s\n", nv.getId(), nv.getHoTen())
            );
        }
    }

    public int isExist (int id){
        for(int i = 0; i < this.dsDA.size(); i++){
            if(this.dsDA.get(i).getMaDA() == id)
                return i;
        }
        return -1;
    }

    public void xoa(int id){
        int vt = isExist(id);

        if(vt != -1)
            this.dsDA.remove(vt);
        else {
            System.out.println("XOÁ KHÔNG THÀNH CÔNG!!!");
        }
    }

    public void capNhat(int id){
        int vt = isExist(id);

        if(vt != -1)
            this.dsDA.get(vt).nhapThongTin();
        else
            System.out.println("CẬP NHẬT KHÔNG THÀNH CÔNG!!!");
    }

    public QuanLiDuAn timKiemTheoTen(String ten){
        QuanLiDuAn ds = new QuanLiDuAn();

        for (DuAn da:this.dsDA)
            if(da.getTenDA().contains(ten))
                ds.themDA(da);

        return ds;
    }

    public QuanLiDuAn timKiemTheoNgayBD(Date nbd){
        QuanLiDuAn ds = new QuanLiDuAn();

        for (DuAn da:this.dsDA)
            if(da.getNgayBD().equals(nbd))
                ds.themDA(da);

        return ds;
    }

    public void sapXep(){
        this.dsDA.sort((da1, da2)-> Double.compare(da1.getTongKinhPhi(), da2.getTongKinhPhi()));
    }

    public List<DuAn> getDsDA() {
        return dsDA;
    }

    public void setDsDA(List<DuAn> dsDA) {
        this.dsDA = dsDA;
    }
}
