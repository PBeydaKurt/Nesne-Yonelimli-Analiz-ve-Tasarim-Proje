
package cc.proje.AkilliCihaz;

import java.util.Random;
public class SicaklikAlgilayici implements ISicaklikAlgilayici {
    private int sicaklik;
    private String birim;
    private int max;
    public String getBirim() {
        return birim;
    }

    public void setBirim(String bbirim) {
        this.birim = bbirim;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int mmax) {
        this.max = mmax;
    }

    public SicaklikAlgilayici()
    {
        birim = "C";
        max =50;
        Random rand = new Random();
        sicaklik = rand.nextInt(max);
    }
    @Override
    public int sicaklikGonder() {

        return this.sicaklik;
    }
}
