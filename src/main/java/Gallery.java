import java.util.ArrayList;

public class Gallery {

    private String galleryName;
    private int till;

    private ArrayList<Artwork> stock;

    public Gallery (String galleryName){
        this.galleryName = galleryName;
        this.till = 0;
        this.stock = new ArrayList<Artwork>();
    }

    // METHOD: GALLERY NAME
    public String getGalleryName(){
        return this.galleryName;
    }

    // METHOD: GET GALLERY STOCK COUNT
    public int getStockCount(){
        return this.stock.size();
    }

    // METHOD: GET GALLERY STOCK LIST
    public ArrayList<Artwork> getStock(){
        return this.stock;
    }

    // METHOD: ADD ARTWORK TO GALLERY
    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }

    // METHOD: GETTING/SETTING TILL
    public int getTill(){
        return this.till;
    }
    public void setTill(int till){
        this.till = till;
    }

    // SALE PROCEDURES
    public void sale(Gallery gallery) {
      if ((Customer.getWallet() >= Artwork.getPrice()) && (Artwork.getArtworkSold() == false)) {
            Artwork.setArtworkSold() == true;

            int WalletRemainder = Customer.getWallet() - Artwork.getPrice();
            Customer.setWallet(WalletRemainder);

            int galleryNewTill = Gallery.getTill() + Artwork.getPrice();
            Gallery.setTill(galleryNewTill);

        } else ;
    }
}


