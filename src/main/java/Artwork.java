import java.util.ArrayList;

public class Artwork {

    private String title;
    private ArrayList<Artwork> artist;
    private double price;
    private boolean sold;

    public Artwork(String title, double price, boolean sold) {
        this.title = title;
        this.artist = new ArrayList<Artwork>();
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
    public static int getPrice(){
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

}