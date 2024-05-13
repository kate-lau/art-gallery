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

    public String getGalleryName(){
        return this.galleryName;
    }

}


