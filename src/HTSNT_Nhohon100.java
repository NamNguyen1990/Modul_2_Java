public class HTSNT_Nhohon100 {
    public static boolean SNT(int n) {
        String s = "SNT";
        int p = (int) Math.sqrt(n);
        for (int i = 2; i <= p; i++) {
            if (n%i == 0) {
                s = "KPSNT";
            }
        }
        if (s == "SNT") {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (SNT(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
}