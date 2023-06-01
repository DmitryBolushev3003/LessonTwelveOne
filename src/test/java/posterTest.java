import org.example.posterManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class posterTest {

    @Test
    public void testAllNullPosters() {

        posterManager manager = new posterManager();

        String[] expected = {};
        String[] actual = manager.showAllPoster();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAllPosters() {
        posterManager manager = new posterManager();
        manager.addPosters("Блатшот (боевик)");
        manager.addPosters("Вперед (мультфильм)");
        manager.addPosters("отель Белград (комедия)");
        manager.addPosters("Джентельмены (боевик)");
        manager.addPosters("Человек невидимка (ужасы)");
        manager.addPosters("Тролли. Мировой штурм (мультфильм)");
        manager.addPosters("Номер один (комедия)");

        String[] expected = {"Блатшот (боевик)", "Вперед (мультфильм)", "отель Белград (комедия)", "Джентельмены (боевик)", "Человек невидимка (ужасы)", "Тролли. Мировой штурм (мультфильм)", "Номер один (комедия)"};
        String[] actual = manager.showAllPoster();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowLastPoster() {
        posterManager manager = new posterManager();
        manager.addPosters("PosterOne");
        manager.addPosters("PosterTwo");
        manager.addPosters("PosterThree");
        manager.addPosters("PosterFour");
        manager.addPosters("PosterFive");
        manager.addPosters("PosterSix");
        manager.addPosters("PosterSeven");
        String[] expected = {"PosterSeven", "PosterSix", "PosterFive", "PosterFour", "PosterThree"};
        String[] actual = manager.showLastPoster();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowThreeLastPoster() {
        posterManager manager = new posterManager(3);
        manager.addPosters("PosterOne");
        manager.addPosters("PosterTwo");
        manager.addPosters("PosterThree");
        manager.addPosters("PosterFour");
        manager.addPosters("PosterFive");
        manager.addPosters("PosterSix");
        manager.addPosters("PosterSeven");
        String[] expected = {"PosterSeven", "PosterSix", "PosterFive"};
        String[] actual = manager.showLastPoster();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowMaxLastPoster() {
        posterManager manager = new posterManager(8);
        manager.addPosters("PosterOne");
        manager.addPosters("PosterTwo");
        manager.addPosters("PosterThree");
        manager.addPosters("PosterFour");
        manager.addPosters("PosterFive");
        manager.addPosters("PosterSix");
        manager.addPosters("PosterSeven");
        String[] expected = {"PosterSeven", "PosterSix", "PosterFive", "PosterFour", "PosterThree", "PosterTwo", "PosterOne"};
        String[] actual = manager.showLastPoster();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowMinLastPoster() {
        posterManager manager = new posterManager(1);
        manager.addPosters("PosterOne");
        manager.addPosters("PosterTwo");
        manager.addPosters("PosterThree");
        manager.addPosters("PosterFour");
        manager.addPosters("PosterFive");
        manager.addPosters("PosterSix");
        manager.addPosters("PosterSeven");
        String[] expected = {"PosterSeven"};
        String[] actual = manager.showLastPoster();
        Assertions.assertArrayEquals(expected, actual);
    }

}
