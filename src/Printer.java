public class Printer {

    private int tonerLevel = -1;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {

        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }

        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tA){
        int total = this.tonerLevel + tA;

        if (tA > 0 && tA <= 100){
            return -1;
        }

        if (total > 0 && total <= 100){
            return -1;
        }

        return total;


    }
}
