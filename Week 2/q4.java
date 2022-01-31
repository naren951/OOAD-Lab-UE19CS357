public class q4 {
    public static void main(String[] args) {
        Invoice one = new Invoice("001", "Macbook", 100, 1.5);
        System.out.println("Part number: " + one.getpno() + "; Part description: " + one.getpdesc() +
                "; Sold: " + one.getquantOfPurch() + "; Price: " + one.getPricePreItem() + "; Invoice amount: " +
                one.getInvoiceAmount());
        one.setpno("002");
        one.setpdesc("Zenbook");
        one.setquantOfPurch(1000);
        one.setPricePreItem(.75);
        System.out.println("After changing:");
        System.out.println("Part number: " + one.getpno() + "; Part description: " + one.getpdesc() +
                "; Sold: " + one.getquantOfPurch() + "; Price: " + one.getPricePreItem() + "; Invoice amount: " +
                one.getInvoiceAmount());
    }
}
public class Invoice {
    private String pno;
    private String pdesc;
    private int quantOfPurch;
    private double pricePreItem;

    public Invoice(String pno, String pdesc, int quantOfPurch, double pricePreItem) {
        this.pno = pno;
        this.pdesc = pdesc;
        if(quantOfPurch > 0){
        this.quantOfPurch = quantOfPurch;
        }
        else{
            this.quantOfPurch = 0;
        }
        if(pricePreItem > 0){
        this.pricePreItem = pricePreItem;
        }
        else{
            this.pricePreItem = 0;
        }
    }

    public void setpno(String pno) {
        this.pno = pno;
    }

    public String getpno() {
        return pno;
    }

    public void setpdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public String getpdesc() {
        return pdesc;
    }

    public void setquantOfPurch(int quantOfPurch) {
        if (quantOfPurch > 0) {
            this.quantOfPurch = quantOfPurch;
        } else {
            this.quantOfPurch = 0;
        }
    }

    public int getquantOfPurch() {
        return quantOfPurch;
    }

    public void setPricePreItem(double pricePreItem) {
        if (pricePreItem > 0) {
            this.pricePreItem = pricePreItem;
        } else {
            this.pricePreItem = 0;
        }
    }

    public double getPricePreItem() {
        return pricePreItem;
    }

    public double getInvoiceAmount() {
        return pricePreItem * quantOfPurch;
    }
}