package guru.springframework.spring5webapp;

public class Foo {

    private int superUniqueValue;
    private static Foo singleton = null;

    private Foo(){
        this.superUniqueValue = 42;
    }

    public Foo getFooSingleton() {
        if (singleton == null) {
            singleton = new Foo();
        }
        return singleton;
    }

    public int getSuperUniqueValue() {
        return superUniqueValue;
    }

    public void setSuperUniqueValue(int superUniqueValue) {
        this.superUniqueValue = superUniqueValue;
    }

    public int getNumberFour () {
        return 4;
    }
}
