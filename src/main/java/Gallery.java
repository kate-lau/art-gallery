import java.util.ArrayList;

public class Gallery {

    private String galleryName;
    private int till;

    private ArrayList<Artwork> stock;

    public Gallery (String galleryName){
        this.galleryName = galleryName;
        this.till = 0;
        this.stock = new ArrayList<>();
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

}


