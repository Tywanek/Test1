import interfaces.UEInterface;

public class Polak extends Czlowiek implements UEInterface {
    public Polak(String name, int age) {
        super(name, age);
    }

    @Override
    public String getNarodowosc() {
        return "PL";
    }

    @Override
    public String getPassportID() {
        return "ID1";
    }
}
