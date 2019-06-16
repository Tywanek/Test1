package animals;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void miaucz(){
        String myName = getName();
        System.out.println("miau miau" + myName);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
