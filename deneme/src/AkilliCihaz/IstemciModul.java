package cc.proje.AkilliCihaz;

import java.awt.*;

public class IstemciModul {
    ISicaklikAlgilayiciFactory sicaklikFactory;
    public IstemciModul(ISicaklikAlgilayiciFactory sicaklikFactory)
    {
        this.sicaklikFactory = sicaklikFactory;

    }
    public void bbasla()
    {
        ISicaklikAlgilayici sicaklikAlgilayici = sicaklikFactory.factoryMethod();
        System.out.println(sicaklikAlgilayici.sicaklikGonder());

    }


}
