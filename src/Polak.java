import interfaces.HRInterface;
import interfaces.UEInterface;

public class Polak extends Czlowiek implements UEInterface, HRInterface {
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


    @Override
    public int getPay() {
        return 0;
    }

    public String stuff() {
        Object object = null;
        String result="";
        try {
           result  = object.toString();
        }catch (Exception e){

        }
        return result;
    }
    public String stuff2 () throws Exception{
        Object object = null;
        String  result  = object.toString();
        return result;
    }
}
