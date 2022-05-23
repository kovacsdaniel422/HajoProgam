package main;

public class TorpedoTeszt {

    public static void main(String[] args) {
        System.out.println("Teszt");
        new TorpedoTeszt().tesztLoves(4);
        
        //assert 1 == 2 : "Nem jó a találat ellenörzése";
    }

    public String tesztLoves(int poz) {
        Hajo hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("találat") : "nem jó a találat";
        return "";
    }

}
