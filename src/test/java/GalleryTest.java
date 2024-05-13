import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void setUp(){

        gallery = new Gallery("Gallery Name Example");
        Artwork apple = new Artwork("Apple", "Apple Painter", 100, false);
        gallery.addArtwork(apple);
    }

    @Test
    public void galleryHasName(){
        assertThat(gallery.getGalleryName()).isEqualTo("Gallery Name Example");
    }

    @Test
    public void canAddArtworkToGallery(){
        Artwork boat = new Artwork("Boat", "Boat Painter", 200, false);
        gallery.addArtwork(boat);
        assertThat(gallery.getStockCount()).isEqualTo(2);
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }
    @Test
    public void canSetTill(){
        gallery.setTill(999);
        assertThat(gallery.getTill()).isEqualTo(999);
    }

    @Test
    public void canGetStock(){
        assertThat(gallery.getStock().size()).isEqualTo(gallery.getStockCount());
    }

}
