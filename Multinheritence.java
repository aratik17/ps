package ps;

interface Printer {
    void start();
}


interface Scanner {
    void start();
}


class MultiFunctionPrinter implements Printer, Scanner {

    @Override
    public void start() {
        System.out.println("MultiFunctionPrinter is starting both printing and scanning.");
    }
}

public class Multinheritence {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.start();
}
}
