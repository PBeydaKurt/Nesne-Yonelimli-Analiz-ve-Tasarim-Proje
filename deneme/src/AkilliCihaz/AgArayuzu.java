package cc.proje.AkilliCihaz;
import cc.proje.veritabani.PostgreSQLSurucu;

import java.util.Scanner;
public class AgArayuzu {

    private IEyleyici eyleyici;
    private ISicaklikAlgilayici sicaklikAlgilayici;

    private static final int SICAKLIK_GONDER = 1;
    private static final int SOGUTUCU_ACMA = 2;
    private static final int SOGUTUCU_KAPATMA = 3;
    private static final int CIKIS = 4;

    public AgArayuzu()
    {
        eyleyici = new Eyleyici();
        sicaklikAlgilayici = new SicaklikAlgilayici();
    }
    public void basla()
    {
        PostgreSQLSurucu surucu = new PostgreSQLSurucu();
        int sayac =0;
        System.out.println("HOŞGELDİNİZ...");
        do {
            boolean dogruMu = surucu.kullaniciDogrula();
            if(dogruMu)
            {
                islemSecimi();
            }
            else
            {
                sayac++;
                System.out.println("Girdiğiniz Bilgi Yanlış Lütfen Kontrol Edip Tekrar Deneyiniz...");
            }
        }while(sayac!=0);
    }


    public void islemSecimi() {
        int secim;
        do{
            secim=anaMenuyuGoster();
            //ekran temizle
            switch (secim) {
                case SICAKLIK_GONDER:
                    IIslem sicaklikGonder=new SicaklikGonder();
                    sicaklikGonder.islemYap();
                    break;
                case SOGUTUCU_ACMA:
                    IIslem sogutucuyuAcma=new SogutucuAcma();
                    sogutucuyuAcma.islemYap();
                    break;

                case SOGUTUCU_KAPATMA:
                    IIslem sogutucuyuKapatma=new SogutucuKapatma();
                    sogutucuyuKapatma.islemYap();
                    break;

                case CIKIS:
                    System.out.println("Çıkılıyor....");
                    break;
                default:
                    System.out.println("1-4 arasında bir sayı girmelisiniz");
            }
        }while(secim!=4);
    }


    public int anaMenuyuGoster() {
        System.out.println("**********************************************");
        System.out.println("Ana Menu");
        System.out.println("1-Sıcaklık Görüntüle");
        System.out.println("2-Soğutucuyu Aç");
        System.out.println("3-Soğutucuyu Kapat");
        System.out.println("4-Cikis");
        System.out.println("**********************************************");
        System.out.print("Seciminiz:");
        Scanner input=new Scanner(System.in);
        return input.nextInt();
    }

}
