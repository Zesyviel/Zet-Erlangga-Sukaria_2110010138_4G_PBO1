
package MutiaraPancing;


public class AlatPancing {
    private String merk;
    private double harga;
    
    //Constructor
    public AlatPancing(String merk, double harga) {
        this.merk = merk;
        this.harga = harga;
    }
    
    //Accesor dan Mutator
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    //Method
    public void Info(){
        System.out.println("==========================");
        System.out.println("Nama Merk : " + merk);
        System.out.println("Harga     : Rp. " + harga);
    }
    
}
