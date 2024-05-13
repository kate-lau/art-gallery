import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;

    private ArrayList<Artwork> stock;

    public Gallery (String galleryName){
        this.name = galleryName;
        this.till = 0;
        this.stock = new ArrayList<>();
    }
}