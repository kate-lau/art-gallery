public class Customer {

    private String customerName;
    private int wallet;

    public Customer (String customerName, int wallet){
        this.customerName = customerName;
        this.wallet = wallet;
    }

    // GET & SET CUSTOMER NAME
    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String artistName) {
        this.customerName = customerName;
    }

    // GET & SET CUSTOMER WALLET
    public int getWallet(){
        return this.wallet;
    }
    public void setWallet(int wallet) {
        this.wallet = wallet;
    }


}
