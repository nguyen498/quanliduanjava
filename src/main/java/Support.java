import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Support {
    Scanner sc = new Scanner(System.in);

    public void nhapNgayThangNam(String ntn) {
        Date date = new Date();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            date = df.parse(ntn);
        } catch (Exception e) {
            System.out.println("Ngày tháng không hợp lệ");
        }
    }

    public String xuatNgayThangNam(Date ntn) {
        if (ntn != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM?yyyy");

            return formatter.format(ntn);
        }else
            return "n/a";
    }
    public String chuanHoa(String str) {
        str = str.trim().replaceAll("\\s+", " ");
        String[] arr = str.split(" ");

        String s = "";
        for (String x : arr) {
            s = s + (x.substring(0, 1).toUpperCase() + x.substring(1));
            s = s + " ";
        }

        return s.trim();
    }


}
