public class BarangElektronik extends Barang {
    //Atribut
    private String garansi;

    // Constructor BarangElektronik
    public BarangElektronik(String nama, int jumlah, double harga,String garansi){
        super(nama,jumlah,harga);
        this.garansi = garansi;
    }

    // Getter dan Setter untuk garansi
    public String getgaransi(){
        return garansi;
    }
    public void setgaransi(String garansi){
        this.garansi = garansi;
    }
    // Override method tampilkanData
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        // Tampilan
        System.out.println("Ketersediaan garansi :"+ garansi);
    }
}
