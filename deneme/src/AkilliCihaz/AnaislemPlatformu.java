package cc.proje.AkilliCihaz;

public class AnaislemPlatformu {
    public static void main(String args[]){
        UserBeyda u1 = new UserBeyda();
        UserAsli u2 = new UserAsli();
        Publisher p = new Publisher();

        p.attach(u1);
        p.attach(u2);
        // p.notify("güncellendi...");
        AgArayuzu agArayuzu = new AgArayuzu();
        agArayuzu.basla();
    }
}
