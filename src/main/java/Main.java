import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);


//        int choose1;
//        int choose2;
//        int choose3;
//        int choose4;
//        int choose5;
//        do{
//            Menu.MenuTong();
//            System.out.print("Chọn: ");
//            choose1 = sc.nextInt();
//            switch (choose1){
//                case 1:
//                    do {
//                        Menu.MenuQuanLiNhanVien();
//                        choose2 = sc.nextInt();
//                        switch (choose2){
//                            case 1:
//                                break;
//                            case 2:
//                                break;
//                            case 3:
//                                break;
//                            case 4:
//                                do {
//                                    Menu.MenuTimKiemNhanVien();
//                                    choose4 = sc.nextInt();
//                                    switch (choose4){
//                                        case 1:
//                                            break;
//                                        case 2:
//                                            break;
//                                        case 3:
//                                            break;
//                                        default:
//                                            System.out.println("Lựa chọn không hợp lệ!!!");
//                                    }
//                                }while (choose4 != 0);
//                                break;
//                            case 5:
//                                break;
//                            case 6:
//                                break;
//                            default:
//                                System.out.println("Lựa chọn không hợp lệ");
//                        }
//                    }while(choose2 != 0);
//                    break;
//                case 2:
//                    do{
//                        Menu.MenuQuanLiDuAn();
//                        choose3 = sc.nextInt();
//                        switch (choose3){
//                            case 1:
//                                break;
//                            case 2:
//                                break;
//                            case 3:
//                                break;
//                            case 4:
//                                do {
//                                    Menu.MenuTimKiemDuAN();
//                                    choose5 = sc.nextInt();
//                                    switch (choose5){
//                                        case 1:
//                                            break;
//                                        case 2:
//                                            break;
//                                        default:
//                                            System.out.println("Lựa chọn không hợp lệ");
//                                    }
//                                }while (choose5 != 0);
//                                break;
//                            case 5:
//                                break;
//                            case 6:
//                                break;
//                            case 7:
//                                break;
//                            default:
//                                System.out.println("Lựa chọn không hợp lệ!!!");
//                        }
//                    }while (choose3 != 0);
//                    break;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ!!!");
//            }
//        }while (choose1 !=0);












        PhongBan pb1 = new PhongBan("IT");//1
        PhongBan pb2 = new PhongBan("Kinh Doanh");//2

        TruongPB nv1 = new TruongPB("Ha Truong Nguyen", 0, "20/05/2001",
                "1951042133nguyen@ou.edu.vn",
                10, 2 , "5/12/2021");

        NhanVien nv2 = new NhanVien("Luong Duc Huy", 0, "20/05/2001",
                                    "1951042133huy@ou.edu.vn",
                                    8, 3);
        NhanVien nv3 = new LapTrinhVien("Nguyen Thanh Dung", 0, "20/11/2001",
                                "1951042133dung@ou.edu.vn",
                                8, 3,5);
        NhanVien nv4 = new KiemThuVien("Nguyen Thanh Dung", 0, "20/11/2001",
                                "1951042133dung@ou.edu.vn",
                                8,3,5);
        nv1.themPB(pb1);
        nv2.themPB(pb2);
        nv3.themPB(pb1);
        nv4.themPB(pb2);

        DuAn da1 = new DuAn("Xây dựng website bán hàng", "01/12/2021", "31/12/2021", 10);
        DuAn da2 = new DuAn("Xây dựng website khách sạn", "01/12/2021", "31/12/2021", 10);
        // DuAn da3 = new DuAn();


//        da3.nhapThongTin();
//        System.out.print(da3);
//
        // QuanLiDuAn dsDA = new QuanLiDuAn();
        // dsDA.themDA(da1);
        // dsDA.themDA(da2);
        // // dsDA.themDA(da3);
        // dsDA.hienThi();
        // Date nbd = Support.nhapNgayThangNam(sc.nextLine());
        // dsDA.timKiemTheoNgayBD(nbd).hienThi();
        // dsDA.timKiemTheoTen("website").hienThi();
//        dsDA.xoa(3);
//        dsDA.hienThi();
////        dsDA.capNhat(1);
//        dsDA.hienThi();
//
//        da1.themTDA(nv1);
//        da1.themNVVaoDA(nv2);
//        da1.themNVVaoDA(nv3);
//        da1.themNVVaoDA(nv4);
//        nv1.themDA(da2);
//        da1.hienThi();
//        nv1.hienThi();

       QuanLiNhanVien dsNV = new QuanLiNhanVien();
       dsNV.them(nv1);
       dsNV.them(nv2);
       dsNV.them(nv3);
       dsNV.them(nv4);
//        dsNV.hienThi();

//        dsNV.timKiemTheoTen("Nguyen").hienThi();
//        Date ns = Support.nhapNgayThangNam(sc.nextLine());
//        dsNV.timKiemTheoNgaySinh(ns).hienThi();
       dsNV.timKiemTheoPhongBan("Kinh doanh").hienThi();;




//        System.out.println(pb1);
//        System.out.println(pb2);
//        pb1.hienThi();
//        System.out.println(nv1);
//        System.out.println(nv2);
//        System.out.println(nv3);
//        System.out.println(nv4);



//        QuanLiPhongBan dsPB =  new QuanLiPhongBan();
//        dsPB.themPB(pb1);
//        dsPB.themPB(pb2);
//        dsPB.hienThiNVCuaPB();
//        System.out.println(nv1.tinhLuong());
//        System.out.println(nv2.tinhLuong());
//        System.out.println(nv3.tinhLuong());
//        System.out.println(nv4.tinhLuong());
//        NhanVien nv5 = new TruongPB();
//        NhanVien nv6 = new LapTrinhVien();
//        NhanVien nv7 = new KiemThuVien();
//        nv5.nhapThongTinNV();
//        nv6.nhapThongTinNV();
//        nv7.nhapThongTinNV();
//        System.out.print(nv5);
//        System.out.print(nv6);
//        System.out.print(nv7);

    }
}
