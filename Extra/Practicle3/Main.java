class Base {
    static int baseValue = 10;
    final void show() {
        System.out.println("Base show: Value is " + baseValue);
    }
}

class Derived extends Base {
    static int baseValue = 20;
    void show() {
        super.show();
        System.out.println("Derived show: Value is " + baseValue);
    }
}

public class Main {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.show();
    }
}
