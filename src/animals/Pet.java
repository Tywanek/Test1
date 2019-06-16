

package animals;
import interfaces.HRInterface;
import interfaces.UEInterface;
public class Pet extends Cat implements UEInterface, HRInterface {
    public Pet(String name, int age) {
        super(name, age);
    }

    @Override
    public String getNarodowosc() {
        return "GB";
    }

    @Override
    public String getPassportID() {
        return "IDmiau";
    }

    @Override
    public int getPay() {
        return Integer.parseInt(null);
    }
}
