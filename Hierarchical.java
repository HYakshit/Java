//a
class a {
    int parent;
    int age;

    a(int age) {
        this.age = age;
    }

    void info() {
        System.out.println("parent age is" + age);
    }
}

//b
class b extends a {
    int boy;
    int age;

    b(int age) {
        super(0);
        this.age = age;
    }

    void info() {
        System.out.println("boy age is" + age);
    }
}

//c
class c extends a {
    int girl;
    int age;

    c(int age) {
        super(0);
        this.age = age;
    }

    void info() {
        System.out.println("girl age is" + age);
    }
}

//main
public class Hierarchical {
    public static void main(String[] args) {
        a obj = new a(30);
        b objb = new b(18);
        c objc = new c(10);

        obj.info();
        objb.info();
        objc.info();

    }
}