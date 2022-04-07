package hcn;

public class HCN {
    int Dai;
    int Rong;


    public HCN() {
    }

    public HCN(int dai, int rong) {
        Dai = dai;
        Rong = rong;
    }

    public int getDai() {
        return Dai;
    }

    public void setDai(int dai) {
        Dai = dai;
    }

    public int getRong() {
        return Rong;
    }

    public void setRong(int rong) {
        Rong = rong;
    }

    public static int getDientich(int Dai, int Rong) {
        return Dai*Rong;
    }

    public static int getChuVi(int Dai, int Rong) {
        return (Dai+Rong)*2;
    }
}
