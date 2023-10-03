public class kembalian {

  public static void main(String[] args) {
    int jumlah = 200000;
    int sisaKembalian = (jumlah - 81500);

    //menghitung jumlah lima puluh ribu
    int limaPuluh = (int) (sisaKembalian / 50000);
    int sisa = (int) (sisaKembalian % 50000);
    //menghitung sisaKembalian dua puluh ribu
    int sepuluhRibu = (sisa / 20000);
    sisa = sisa % 10000;
    //menghitung sisaKembalian seribun
    int seribu = (sisa / 1000);
    sisa = sisa % 1000;
    //menghitung sisaKembalian lima ratus perak
    int ratusan = sisa / 500;

    //cetak hasil
    System.out.println("Jumlah Uang = " + jumlah);
    System.out.println("kembalian = " + sisaKembalian);
    System.out.println("Jumlah 50000 = " + limaPuluh);
    System.out.println("Jumlah 10000 = " + sepuluhRibu);
    System.out.println("Jumlah 1000 = " + seribu);
    System.out.println("Jumlah 500 = " + ratusan);
  }
}
