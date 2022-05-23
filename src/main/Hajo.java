package main;

public class Hajo {

    private int[] pozicio;

    public Hajo() {
        this.pozicio = new int[3];
        this.pozicio[0] = (int) (Math.random() * 5);
        this.pozicio[1] = pozicio[0] + 1;
        this.pozicio[2] = pozicio[0] + 2;
    }

    public String talalat(int poz) {
        int i = 0;
        while (i < 3 && !(pozicio[i] == poz)) {
            i++;
        }
        return i < 3 ? "találat" : "mellé";
    }

}
