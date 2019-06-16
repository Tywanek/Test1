import java.util.Random;

public class Roslina {
    private String name;
    private COLORS color;

    public Roslina(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public COLORS getKolor() {
        if(color != null){
            return color;
        }else {
            int pick = new Random().nextInt(COLORS.values().length);
            this.color = COLORS.values()[pick];
            return this.color;
        }
    }
}
