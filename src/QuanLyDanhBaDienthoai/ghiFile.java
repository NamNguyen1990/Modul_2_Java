package QuanLyDanhBaDienthoai;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class ghiFile {
    public static void writeToFile (List<Nguoi> danhbaList) throws IOException {
        File file = new File("KtraMD2.csv");
        file.createNewFile();
        PrintWriter pw = new PrintWriter(file);
        String str = "số dt, nhom, hote, gioitinh, địa chỉ" +"\n";
        for (Nguoi i: danhbaList) {
            str += i.getSdt() +","+ i.getNhom() +","+ i.getHoTen() +","+ i.getGioiTinh() +","+ i.getDiaChi() +"\n";
        }
        pw.write(str);
        pw.close();
    }
    public static void readFromFile (List<Nguoi> danhbaList) throws IOException {
        File file = new File("KtraMD2.csv");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String a = sc.nextLine();
            System.out.println(a);
        }
        sc.close();
    }
}
