import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Michelangelo");
    }

    // ARTIST NAME GET & SET TESTS
    @Test
    public void canGetArtistName(){
        assertThat(artist.getArtistName()).isEqualTo("Michelangelo");
    }
    @Test
    public void canSetArtistName(){
        artist.setArtistName("Rembrandt");
        assertThat(artist.getArtistName()).isEqualTo("Rembrandt");
    }
}
