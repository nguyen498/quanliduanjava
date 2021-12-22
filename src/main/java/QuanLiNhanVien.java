import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuanLiNhanVien {
    private List<NhanVien> dsNV = new ArrayList<>();

    public void hienThi() {
        if (this.getDsNV().isEmpty()) {
            System.out.println("\n\t\t### KHÔNG CÓ DỮ LIỆU ###");
        } else {
            this.getDsNV().forEach((nv) -> {
                System.out.println(nv);
                System.out.print("================\n");
            });

            System.out.println();
        }
    }

    public int isExist (int id){
        for(int i = 0; i < this.getDsNV().size(); i++){
            if(this.getDsNV().get(i).getId() == id)
                return i;
        }
        return -1;
    }

    public void xoa(int id){
        int vt = isExist(id);

        if(vt != -1)
            this.getDsNV().remove(vt);
        else {
            System.out.println("XOÁ KHỒN THÀNH CÔNG!!!");
        }
    }

    public void capNhat(int id){
        int vt = isExist(id);

        if(vt != -1)
            this.getDsNV().get(vt).nhapThongTinNV();
        else
            System.out.println("CẬP NHẬT KHÔNG THÀNH CÔNG!!!");
    }

    public void them(NhanVien nv) {
        this.getDsNV().add(nv);
    }

    public QuanLiNhanVien timKiemTheoTen(String ten){
        QuanLiNhanVien ds = new QuanLiNhanVien();

        for (NhanVien nv:this.dsNV)
            if(nv.getHoTen().contains(ten))
                ds.them(nv);

        return ds;
    }

    public QuanLiNhanVien timKiemTheoNgaySinh(Date ns){
        QuanLiNhanVien ds = new QuanLiNhanVien();

        for (NhanVien nv:this.dsNV)
            if(nv.getNgaySinh().equals(ns))
                ds.them(nv);

        return ds;
    }

   public QuanLiNhanVien timKiemTheoPhongBan (String pb){
       QuanLiNhanVien ds = new QuanLiNhanVien();

       for (NhanVien nv:this.dsNV)
            // System.out.print(nv.getPhongban().getTenPB());
           if(nv.getPhongban().getTenPB().equalsIgnoreCase(pb))
               ds.them(nv);

       return ds;
   }

    public List<NhanVien> getDsNV() {
        return dsNV;
    }

    public void setDsNV(List<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }
}
