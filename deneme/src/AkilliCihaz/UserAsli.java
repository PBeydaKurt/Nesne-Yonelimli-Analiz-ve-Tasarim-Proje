package cc.proje.AkilliCihaz;

public class UserAsli implements IObserver{

    @Override
    public void update(String message) {
        System.out.println("2 nolu kullanicimiz "+message);
    }
}
