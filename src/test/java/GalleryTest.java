import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void setUp(){

        gallery = new Gallery("dfvd");
        Artwork apple = new Artwork("apple", "rgsr", 200);

    }
    @Test
    public void galleryHasName(){
        assertThat(gallery.getGalleryName()).isEqualTo("dfvd");
    }
}
