import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        PhongBan pb1 = new PhongBan("IT");//1
        PhongBan pb2 = new PhongBan("Kinh Doanh");//2

        TruongPB nv7 = new TruongPB("Nguyễn Thị Mai", 1, "18/01/2001",
                "1951042133mai@ou.edu.vn",
                10, 2 , "5/7/2021");
        nv7.themPBQL(pb2);
        nv7.themPB(pb2);
        pb2.themTP(nv7);

        TruongPB nv1 = new TruongPB("Ha Truong Nguyen", 0, "20/05/2001",
                "1951042133nguyen@ou.edu.vn",
                10, 2 , "5/12/2021");
        nv1.themPBQL(pb1);
        nv1.themPB(pb1);
        pb1.themTP(nv1);

        NhanVien nv2 = new NhanVien("Luong Duc Huy", 0, "13/05/2001",
                "1951042133huy@ou.edu.vn",
                8, 3);
        nv2.themPB(pb2);
        pb2.themNVVaoPB(nv2);

        NhanVien nv3 = new LapTrinhVien("Lê Thị Thuỷ", 1, "11/6/2001",
                "1951042133thuy@ou.edu.vn",
                8, 3);
        nv3.themPB(pb1);
        pb1.themNVVaoPB(nv3);

        NhanVien nv4 = new KiemThuVien("Nguyen Thanh Dung", 0, "20/11/2001",
                "1951042133dung@ou.edu.vn",
                8,3);
        nv4.themPB(pb1);
        pb1.themNVVaoPB(nv4);

        NhanVien nv5 = new ThietKeVien("Vương Vĩnh Hoà", 0, "20/11/2001",
                "1951042133huy@ou.edu.vn",
                8,3);
        nv5.themPB(pb1);
        pb1.themNVVaoPB(nv5);

        NhanVien nv6 = new NhanVien("Trần Thị Liên", 1, "18/04/2001",
                "1951042133lien@ou.edu.vn",
                8, 3);
        nv6.themPB(pb2);
        pb2.themNVVaoPB(nv6);

        DuAn da1 = new DuAn("Xây dựng website bán hàng", "02/12/2021", "31/12/2021", 15);
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
        dsNV.them(nv7);

        QuanLiPhongBan dsPB = new QuanLiPhongBan();
        dsPB.themPB(pb1);
        dsPB.themPB(pb2);


        int choose1;
        int choose2;
        int choose3;
        int choose4;
        int choose5;
        do{
            Menu.MenuTong();
            System.out.println("==============");
            System.out.print("Chọn: ");
            choose1 = sc.nextInt();
            switch (choose1){
                case 1:
                    do {
                        Menu.MenuQuanLiNhanVien();
                        System.out.println("==============");
                        System.out.print("Chọn: ");
                        choose2 = sc.nextInt();
                        switch (choose2){
                            case 1:
                                dsNV.hienThi();
                                break;
                            case 2:
                                dsNV.hienThiNV();
                                System.out.print("Nhập NV muốn chọn: ");
                                int id = sc.nextInt();
                                dsNV.hienThiNVDA(id);
                                System.out.println("");
                                break;
                            case 3:
                                NhanVien nvthem = new NhanVien();
                                nvthem.nhapThongTinNV();
                                dsNV.them(nvthem);
                                dsNV.hienThiNV();
                                break;
                            case 4:
                                do {
                                    Menu.MenuTimKiemNhanVien();
                                    System.out.println("==============");
                                    System.out.print("Chọn: ");
                                    choose4 = sc.nextInt();
                                    switch (choose4){
                                        case 1:
                                            sc.nextLine();
                                            System.out.println("===Tìm kiếm theo tên===");
                                            System.out.print("Nhập từ khoá muốn tìm: ");
                                            String kw = sc.nextLine();
                                            dsNV.timKiemTheoTen(kw).hienThiNV();
                                            break;
                                        case 2:
                                            sc.nextLine();
                                            System.out.println("===Tìm kiếm theo ngày sinh===");
                                            System.out.print("Nhập ngày sinh muốn tìm: ");
                                            String temp = Support.chuanHoa(sc.nextLine());
                                            Date ns = Support.nhapNgayThangNam(temp);
                                            dsNV.timKiemTheoNgaySinh(ns).hienThiNV();
                                            break;
                                        case 3:
                                            sc.nextLine();
                                            System.out.println("===Tìm kiếm theo phòng ban===");
                                            System.out.print("Nhập phòng ban muốn tìm: ");
                                            String pb = sc.nextLine();
                                            dsNV.timKiemTheoPhongBan(pb).hienThiNV();
                                            break;
                                        default:
                                            System.out.println();
                                    }
                                }while (choose4 != 0);
                                break;
                            case 5:
                                dsNV.hienThiNV();
                                System.out.print("Nhập id muốn xoá: ");
                                int idx1 = sc.nextInt();
                                dsNV.xoa(idx1);
                                System.out.println("===Danh sách đã xoá===");
                                dsNV.hienThiNV();
                                break;
                            case 6:
                                System.out.print("Nhập id muốn cập nhật: ");
                                int idx2 = sc.nextInt();
                                dsNV.capNhat(idx2);
                                System.out.println(dsNV.getDsNV().get(idx2-1).toString());
                                System.out.println("==============");
                                break;
                            case 7:
                                dsNV.hienThiNV();
                                System.out.println("===Tính lương===");
                                System.out.print("Nhập id muốn tính lương: ");
                                int idx3 = sc.nextInt();
                                System.out.println(dsNV.getDsNV().get(idx3-1).getHoTen());
                                System.out.printf("Lương: %.1f triệu\n",dsNV.getDsNV().get(idx3-1).tinhLuong());
                                System.out.println("==============");
                                break;
                            default:
                                System.out.println("");
                        }
                    }while(choose2 != 0);
                    break;
                case 2:
                    do{
                        Menu.MenuQuanLiDuAn();
                        System.out.println("==============");
                        System.out.print("Chọn: ");
                        choose3 = sc.nextInt();
                        switch (choose3){
                            case 1:
                                dsDA.hienThi();
                                System.out.println("");
                                break;
                            case 2:
                                dsDA.hienThiDA();
                                System.out.print("Nhập id dự án muốn xem: ");
                                int id = sc.nextInt();
                                dsDA.hienThiDANV(id);
                                System.out.println("");
                                break;
                            case 3:
                                DuAn daThem = new DuAn();
                                daThem.nhapThongTin();
                                dsDA.themDA(daThem);
                                dsDA.hienThi();
                                break;
                            case 4:
                                do {
                                    Menu.MenuTimKiemDuAN();
                                    System.out.println("==============");
                                    System.out.print("Chọn: ");
                                    choose5 = sc.nextInt();
                                    switch (choose5){
                                        case 1:
                                            sc.nextLine();
                                            System.out.println("===Tìm kiếm theo tên===");
                                            System.out.print("Nhập từ khoá muốn tìm: ");
                                            String kw = sc.nextLine();
                                            dsDA.timKiemTheoTen(kw).hienThiDA();
                                            break;
                                        case 2:
                                            sc.nextLine();
                                            System.out.println("===Tìm kiếm theo ngày bắt đầu===");
                                            System.out.print("Nhập ngày bắt đầu: ");
                                            String temp = Support.chuanHoa(sc.nextLine());
                                            Date ns = Support.nhapNgayThangNam(temp);
                                            dsDA.timKiemTheoNgayBD(ns).hienThiDA();
                                            break;
                                        default:
                                            System.out.println("");
                                    }
                                }while (choose5 != 0);
                                break;
                            case 5:
                                dsDA.hienThiDA();
                                System.out.print("Nhập id muốn xoá: ");
                                int idx1 = sc.nextInt();
                                dsDA.xoa(idx1);
                                System.out.println("===Danh sách đã xoá===");
                                dsDA.hienThiDA();
                                System.out.println("");
                                break;
                            case 6:
                                System.out.print("Nhập id muốn cập nhật: ");
                                int idx2 = sc.nextInt();
                                dsDA.capNhat(idx2);
                                System.out.println(dsDA.getDsDA().get(idx2-1).toString());
                                System.out.println("==============");
                                break;
                            case 7:
                                dsDA.sapXep();
                                dsDA.hienThi();
                                System.out.println("==============\n");
                                break;
                            default:
                                System.out.println("");
                        }
                    }while (choose3 != 0);
                    break;
                case 3:
                    dsPB.hienThiNVCuaPB();
                    System.out.println("");
                    break;
                default:
                    System.out.println("==EXIT==");
            }
        }while (choose1 !=0);
    }
}
