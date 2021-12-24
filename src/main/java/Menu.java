public class Menu {
    //MENU lv1
    public static void MenuTong(){
        System.out.println("1.Quản lí nhân viên.");
        System.out.println("2.Quản lí Dự án.");
        System.out.println("3.Xem nhân viên của các phòng ban.");
        System.out.println("0.Thoát.");
    }

    //MENU lv2 của quản lí nhân viên
    public static void MenuQuanLiNhanVien(){
        System.out.println("1.Xem danh sách nhân viên.");
        System.out.println("2.Xem dự án của nhân viên.");
        System.out.println("3.Thêm nhân viên.");
        System.out.println("4.Tìm kiếm.");
        System.out.println("5.Xoá nhân viên.");
        System.out.println("6.Cập nhật lại thông tin nhân viên.");
        System.out.println("7.Tính lương.");
        System.out.println("0.Thoát.");
    }

    //MENU lv3 của tìm kiếm nhân viên
    public static void MenuTimKiemNhanVien(){
        System.out.println("1.Tìm kiếm theo tên nhân viên.");
        System.out.println("2.Tìm kiếm theo ngày sinh.");
        System.out.println("3.Tìm kiếm theo phòng ban.");
        System.out.println("0.Thoát.");
    }

    //MENU lv2 của quản lí dự án
    public static void MenuQuanLiDuAn(){
        System.out.println("1.Xem danh sách dự án.");
        System.out.println("2.Xem nhân viên của dự án.");
        System.out.println("3.Thêm dự án.");
        System.out.println("4.Tìm kiếm.");
        System.out.println("5.Xoá dự án.");
        System.out.println("6.Cập nhật lại thông tin dự án.");
        System.out.println("7.Sắp xếp dự án theo tổng kinh phí.");
        System.out.println("8.Thêm nhân viên vào dự án.");
        System.out.println("0.Thoát.");
    }

    //MENU lv3 của tìm kiếm dự án
    public static void MenuTimKiemDuAN(){
        System.out.println("1.Tìm kiếm theo tên dự án.");
        System.out.println("2.Tìm kiếm theo bắt đầu.");
        System.out.println("0.Thoát.");
    }
}
