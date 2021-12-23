public class Tester {
    public static void main (String[] args){
        PhongBan pb1 = new PhongBan("IT");//1
        PhongBan pb2 = new PhongBan("Kinh Doanh");//2

        TruongPB nv1 = new TruongPB("Ha Truong Nguyen", 0, "20/05/2001",
                "1951042133nguyen@ou.edu.vn",
                10, 2 , "5/12/2021");
        nv1.themPBQL(pb1);
        nv1.themPB(pb1);

        NhanVien nv2 = new NhanVien("Luong Duc Huy", 0, "13/05/2001",
                "1951042133huy@ou.edu.vn",
                8, 3);
        nv2.themPB(pb2);

        NhanVien nv3 = new LapTrinhVien("Lê Thị Thuỷ", 0, "11/6/2001",
                "1951042133thuy@ou.edu.vn",
                8, 3);
        nv3.themPB(pb1);

        NhanVien nv4 = new KiemThuVien("Nguyen Thanh Dung", 0, "20/11/2001",
                "1951042133dung@ou.edu.vn",
                8,3);
        nv4.themPB(pb1);

        NhanVien nv5 = new ThietKeVien("Vương Vĩnh Hoà", 0, "20/11/2001",
                "1951042133huy@ou.edu.vn",
                8,3);
        nv5.themPB(pb1);

        NhanVien nv6 = new NhanVien("Trần Thị Liên", 1, "18/04/2001",
                "1951042133huy@ou.edu.vn",
                8, 3);
        nv6.themPB(pb2);

        DuAn da1 = new DuAn("Xây dựng website bán hàng", "01/12/2021", "31/12/2021", 15);
        da1.themNVVaoDA(nv1);
        da1.themNVVaoDA(nv3);
        da1.themNVVaoDA(nv2);

        DuAn da2 = new DuAn("Xây dựng website khách sạn", "01/12/2021", "31/12/2021", 10);
        da2.themNVVaoDA(nv2);
        da2.themNVVaoDA(nv5);
        da2.themNVVaoDA(nv6);

        DuAn da3 = new DuAn("Xây dựng website đặt vé máy bay", "01/12/2021", "31/12/2021", 30);
        da3.themNVVaoDA(nv4);
        da3.themNVVaoDA(nv3);
        da3.themNVVaoDA(nv1);

        QuanLiDuAn dsDA = new QuanLiDuAn();
        dsDA.themDA(da1);
        dsDA.themDA(da2);
        dsDA.themDA(da3);

        QuanLiNhanVien dsNV = new QuanLiNhanVien();
        dsNV.them(nv1);
        dsNV.them(nv2);
        dsNV.them(nv3);
        dsNV.them(nv4);
        dsNV.them(nv5);
        dsNV.them(nv6);

        QuanLiPhongBan dsPB = new QuanLiPhongBan();
        dsPB.themPB(pb1);
        dsPB.themPB(pb2);

        dsNV.hienThi();
        dsNV.hienThiNVPB();
    }
}
