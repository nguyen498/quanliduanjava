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
            System.out.println("XOÁ KHỒN THÀNH CÔNG!!!");
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

    public List<DuAn> getDsDA() {
        return dsDA;
    }

    public void setDsDA(List<DuAn> dsDA) {
        this.dsDA = dsDA;
    }
}
