public class Barang {
    //Atribut
    private String nama;
    private int jumlah;
    private double harga;

    // Constructor Barang
    public Barang (String nama, int jumlah, double harga){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;

    }

    // Getter dan Setter
    public String getnama(){
        return nama;
    }
    public int getjumlah(){
        return jumlah;
    }
    public double getharga(){
        return harga;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setjumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public void setharga(double harga){
        this.harga = harga;
    }



    // Method tampilkanData
    public void tampilkanData(){
        System.out.println("Nama barang :"+ nama);
        System.out.println("Jumlah barang :"+ jumlah);
        System.out.println("Harga barang :"+ harga);
    }

}
