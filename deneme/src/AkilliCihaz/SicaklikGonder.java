package cc.proje.AkilliCihaz;

public class SicaklikGonder implements IIslem {
    private ISicaklikAlgilayici sicaklikAlgilayici;
    public SicaklikGonder()
    {
        sicaklikAlgilayici = new SicaklikAlgilayici();
    }

    @Override
    public void islemYap() {
        System.out.println("Sıcaklık Değeri Okuyunuyor, Lütfen Bekleyiniz...");
        Araclar.bekle(1000);
        System.out.print("Sıcaklık Değeri: ");
        int sicaklik = sicaklikAlgilayici.sicaklikGonder();
        System.out.println(sicaklik);
    }
}
