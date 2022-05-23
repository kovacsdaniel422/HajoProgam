package main;

public class TorpedoTeszt {

    public static void main(String[] args) {
        System.out.println("Teszt");
        new TorpedoTeszt().tesztLovesTalalt(4);
        
        //assert 1 == 2 : "Nem jó a találat ellenörzése";
    }

    public String tesztLovesTalalt(int poz) {
        Hajo hajo = new Hajo();
        String t = hajo.talalat(poz);
        assert t.equals("találat") : "nem jó a találat";
        return "";
    }

}
