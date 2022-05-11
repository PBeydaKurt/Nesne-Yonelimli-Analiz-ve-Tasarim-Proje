package cc.proje.AkilliCihaz;

public class SogutucuKapatma implements IIslem{
    private IEyleyici eyleyici;
    public SogutucuKapatma()
    {
        eyleyici = new Eyleyici();
    }

    @Override

    public void islemYap() {
        eyleyici.sogutucuKapat();
    }
}
