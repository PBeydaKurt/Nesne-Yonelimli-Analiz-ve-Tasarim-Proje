package cc.proje.AkilliCihaz;

public class SicaklikAlgilayiciFactory implements ISicaklikAlgilayiciFactory{

    @Override
    public ISicaklikAlgilayici factoryMethod() {
        SicaklikAlgilayici sicaklikAlgilayici = new SicaklikAlgilayici();
        sicaklikAlgilayici.setBirim("Fahrenheit");
        sicaklikAlgilayici.setMax(10);
        return sicaklikAlgilayici;
    }
}
