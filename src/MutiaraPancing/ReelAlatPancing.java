
package MutiaraPancing;


public class ReelAlatPancing extends AlatPancing{
    private int gearRatio;

    // Constructor
    public ReelAlatPancing(int gearRatio, String merk, double harga) {
        super(merk, harga);
        this.gearRatio = gearRatio;
    }
    

    // Accessor dan Mutator
    public int getGearRatio() {
        return gearRatio;
    }

    public void setGearRatio(int gearRatio) {
        this.gearRatio = gearRatio;
    }

    // Override method Info()
    @Override
    public void Info() {
        System.out.println("Merk: " + getMerk());
        System.out.println("Harga: Rp " + getHarga());
        System.out.println("Gear Ratio: " + gearRatio);
    }
}
