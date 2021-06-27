package ru.netology.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;


class MovieManagerTest {
    MovieManager manager = new MovieManager();

    Films first = new Films(1, "BloodShot - URL", "Blood shot", "Action movie");
    Films second = new Films(2, "Forward - URL", "Forward", "Cartoon");
    Films third = new Films(3, "Hotel Belgrade - URL ", "Hotel Belgrade", "Comedy");
    Films fourth = new Films();


    @Test
    public void CheckNoAgsConstructor() {
        manager.add(fourth);
        assertArrayEquals(new Films[]{fourth}, manager.getLastFilms());
    }

    @Test
    public void addingEmptyElement() {
        manager.add(first);
        assertArrayEquals(new Films[]{first}, manager.getLastFilms());
    }

    @Test
    public void addingTwoElements() {
        manager.add(first);
        manager.add(second);

        assertArrayEquals(new Films[]{second, first}, manager.getLastFilms());
    }

    @Test
    public void addingThreeElements() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        assertArrayEquals(new Films[]{third, second, first}, manager.getLastFilms());
    }

    // Tests another manager//

    @Test
    public void getChosenFilmUnderLimit() {
        MovieManager difmanager = new MovieManager(1);
        difmanager.add(first);
        difmanager.add(second);
        difmanager.add(third);

        assertArrayEquals(new Films[]{third}, difmanager.getLastFilms());

    }

    @Test
    public void getChosenFilmAboveLimit() {
        MovieManager difmanager = new MovieManager(5);

        difmanager.add(first);
        difmanager.add(second);
        difmanager.add(third);

        assertArrayEquals(new Films[]{third, second, first}, difmanager.getLastFilms());
    }

}