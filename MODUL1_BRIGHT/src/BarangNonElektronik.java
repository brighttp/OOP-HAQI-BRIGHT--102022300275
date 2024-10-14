public class BarangNonElektronik extends Barang {
    //Atribut
    private String material;
    
    // Constructor BarangNonElektronik
    public void material(String material){
        super(nama,jumlah,harga);
        this.material = material;
    }

    // Getter dan Setter untuk material
    public String getmaterial(){
        return material;
    }
    public void setmaterial(String material){
        this.material = material;
    }
    // Override method tampilkanData
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        //Tampilan

    }
}
