public class Artwork {

    private String title;
    private String artist;
    private int price;
    private boolean sold;

    public Artwork(String title, String artist, int price, boolean sold) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.sold = false;
    }

    // GET & SET ARTWORK TITLE
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String artworkTitle) {
        this.title = artworkTitle;
    }

    // GET & SET ARTIST
    public String getArtist(){
        return this.artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
        }


    // GET & SET ARTWORK PRICE
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    // GET & SET ARTWORK SOLD STATUS
    public boolean getArtworkSold(){
        return this.sold;
    }
    public void setArtworkSold(boolean sold){
        this.sold = sold;
    }



    public void sale(Gallery gallery){
        if ((this.sold() == false) && (Customer.wallet >= getPrice())){
            this.sold() = true;
            Customer.wallet -= getPrice();
            Gallery.getTill() += getPrice();
        }
        else;
    }
}