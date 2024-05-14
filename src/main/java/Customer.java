import java.util.ArrayList;

public class Customer {

    private String customerName;
    private double wallet;
    private ArrayList<Artwork> artCollection;

    public Customer (String customerName, double wallet){
        this.customerName = customerName;
        this.wallet = wallet;
        this.artCollection = new ArrayList<Artwork>();
    }

    // GET & SET CUSTOMER NAME
    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String artistName) {
        this.customerName = customerName;
    }

    // GET & SET CUSTOMER WALLET
    public double getWallet(){
        return this.wallet;
    }
    public void setWallet(int wallet) {
        this.wallet = wallet;
    }


}
