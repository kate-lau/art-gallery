import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork apple;

    @BeforeEach
    public void setUp(){
        apple = new Artwork("Apple", "Apple Painter", 100, false);
    }

    // GETTER & SETTER TESTS
    @Test
    public void canGetTitle(){
        assertThat(apple.getTitle()).isEqualTo("Apple");
    }
    @Test
    public void canSetTitle(){
        apple.setTitle("Boat");
        assertThat(apple.getTitle()).isEqualTo("Boat");
    }

    @Test
    public void canGetArtist(){
        assertThat(apple.getArtist()).isEqualTo("Apple Painter");
    }
    @Test
    public void canSetArtist(){
        apple.setArtist("Boat Painter");
        assertThat(apple.getArtist()).isEqualTo("Boat Painter");
    }

    @Test
    public void canGetPrice(){
        assertThat(apple.getPrice()).isEqualTo(100);
    }
    @Test
    public void canSetPrice(){
        apple.setPrice(200);
        assertThat(apple.getPrice()).isEqualTo(200);
    }

    @Test
    public void canGetArtworkSold(){
        assertThat(apple.getArtworkSold()).isEqualTo(false);
    }
    @Test
    public void canSetArtworkSold(){
        apple.setArtworkSold(true);
        assertThat(apple.getArtworkSold()).isEqualTo(true);
    }

}
