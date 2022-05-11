package cc.proje.AkilliCihaz;

public class Eyleyici implements IEyleyici {


    @Override
    public void sogutucuAc() {
        System.out.println("Soğutucu Açılıyor, Lütfen Bekleyiniz...");
        Araclar.bekle(1000);
        System.out.println("Soğutucu Açıldı");
    }

    @Override
    public void sogutucuKapat() {
        System.out.println("Soğutucu Kapatılıyor, Lütfen Bekleyiniz...");
        Araclar.bekle(1000);
        System.out.println("Soğutucu Kapatıldı");
    }
}
