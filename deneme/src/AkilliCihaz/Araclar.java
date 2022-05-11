package cc.proje.AkilliCihaz;

public class Araclar {
    public static void bekle(int sure){
        try
        {
            Thread.sleep(sure);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
