import java.util.ArrayList;
import java.util.List;

public class QuanLiPhongBan {
    private List<PhongBan> dsPB = new ArrayList<>();

    public void themPB(PhongBan pb){
        this.dsPB.add(pb);
    }

    public void hienThi() {
        if (this.dsPB.isEmpty()) {
            System.out.println("\n\t\t### KHÔNG CÓ DỮ LIỆU ###");
        } else {
            System.out.println("Danh sách phòng ban: ");
            this.dsPB.forEach((pb) -> {
                System.out.print(pb.toString() + "\n");
            });

            System.out.println("");
        }
    }

    public void hienThiNVCuaPB(){
        if (this.dsPB.isEmpty()) {
            System.out.println("\n\t\t### KHÔNG CÓ DỮ LIỆU ###");
        }else {
            this.dsPB.forEach(pb -> {
                pb.hienThi();
                System.out.println("");
            });
        }
    }

    public List<PhongBan> getDsPB() {
        return dsPB;
    }

    public void setDsPB(List<PhongBan> dsPB) {
        this.dsPB = dsPB;
    }
}
