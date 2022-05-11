package cc.proje.AkilliCihaz;
import java.util.ArrayList;
import java.util.List;
public class Publisher implements ISubject{
    private List<IObserver> users = new ArrayList<>();

    @Override
    public void attach(IObserver o) {
        users.add(o);
    }

    @Override
    public void detach(IObserver o) {
        users.remove(o);

    }

    @Override
    public void notify(String m) {
        for(IObserver subscriber: users) {
            subscriber.update(m);
        }

    }
}
