public class Printer {

    private int tonerLevel = -1;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }

        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tA){
        int total = this.tonerLevel + tA;

        if (tA > 0 && tA <= 100){
            if(total > 100){
                return -1;
            } else {
                this.tonerLevel = total;
                return total;
            }
        } else {
            return -1;
        }

    }

    public int printPages(int pages){
        int pagesToPrint = pages;

        if (this.duplex){
            pagesToPrint = (int) Math.ceil(pagesToPrint / 2.0);
        }

        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
