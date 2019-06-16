

package animals;
import interfaces.UEInterface;
public class Pet extends Cat implements UEInterface {
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
}
