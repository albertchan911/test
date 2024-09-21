/**
 * pohon
 */
class pohon {
    String nama_phn;
    int umur_phn;
    boolean bunga;
    boolean buah;
    int tinggi_phn;
    String warna_daun;

    void desc_phn (){
        System.out.println("Nama Pohon adalah : " + nama_phn);
        System.out.println("Umur Pohon adalah : " + umur_phn);
        System.out.println("Apakah pohon berbunga : " + bunga);
        System.out.println("Apakah pohon berbuah : " + buah);
        System.out.println("Berapa tinggi pohon : " + tinggi_phn);
        System.out.println("Apakah warna daun pohon : " + warna_daun);
    }
}

class Main{
    public static void main(String[] args) {
        pohon pohon1=new pohon();
        pohon1.nama_phn="Pohon Durian";
        pohon1.umur_phn=15;
        pohon1.bunga=false;
        pohon1.buah=true;
        pohon1.tinggi_phn=90;
        pohon1.warna_daun="Merah";

        System.out.println();
        System.out.println("Output : ");
        pohon1.desc_phn();
        System.out.println();
    }
}