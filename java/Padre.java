public class Padre {
    private void m1() {
        System.out.println("desde el padre m1()");
    }

    protected void m2() {
        System.out.println("desde el padre m2()");
    }
}

class Hija extends Padre{
    private void m1() {
        System.out.println("desde la hija m1()");
    }
}

class main {
    public static void main(String[] args) {
        Padre p = new Padre();
        p.m2();
        Hija h = new Hija();
        h.m2();
        
    }
}
