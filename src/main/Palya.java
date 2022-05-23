package main;

import java.util.Scanner;

public class Palya {

    Scanner sc = new Scanner(System.in);

    public void loves(/*int poz*/) {

        Hajo hajo = new Hajo();
        String t;
        int lovesek = 0, talalat = 0;
        do {
            System.out.printf("Találatok %d Lövések%d",talalat,lovesek);
            System.out.println("\nHova szeretnél lőni:");
            int inp = sc.nextInt();
            t = hajo.talalat(inp);
            if (t.equals("talalat")) {
                talalat++;
            }
            lovesek++;
        } while (talalat != 3);

    }
}
