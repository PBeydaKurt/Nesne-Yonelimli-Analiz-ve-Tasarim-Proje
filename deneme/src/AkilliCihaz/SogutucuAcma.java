package cc.proje.AkilliCihaz;

public class SogutucuAcma implements IIslem{
    private IEyleyici eyleyici;
    public SogutucuAcma()
    {
        eyleyici = new Eyleyici();
    }
    @Override
    public void islemYap() {
        eyleyici.sogutucuAc();
    }
}
