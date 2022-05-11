package cc.proje.AkilliCihaz;

public class UserBeyda implements IObserver{

    @Override
    public void update(String message) {
        System.out.println("1 nolu kullanıcımız "+message);
    }
}
