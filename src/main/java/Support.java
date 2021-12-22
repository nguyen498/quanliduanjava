import java.text.SimpleDateFormat;
import java.util.Date;

public class Support {

    public static Date nhapNgayThangNam(String ntn) {
        Date date = new Date();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            date = df.parse(ntn);
        } catch (Exception e) {
            System.out.println("Ngày tháng không hợp lệ");
        }

        return date;
    }

    public static String xuatNgayThangNam(Date ntn) {
        if (ntn != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

            return formatter.format(ntn);
        }else
            return "n/a";
    }

    public static String chuanHoa(String str) {
        str = str.trim().replaceAll("\\s+", " ");
        String[] arr = str.split(" ");

        StringBuilder s = new StringBuilder();
        for (String x : arr) {
            s.append(x.substring(0, 1).toUpperCase()).append(x.substring(1));
            s.append(" ");
        }

        return s.toString().trim();
    }
}
