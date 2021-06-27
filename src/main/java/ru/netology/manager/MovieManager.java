package ru.netology.manager;

import ru.netology.domain.Films;


public class MovieManager {

  private int numberOfMovies = 10;

  public MovieManager() {
  }

  public MovieManager(int numberOfMovies) {
    this.numberOfMovies = numberOfMovies;
  }

  private Films[] movie = new Films[0];

  public void add(Films film) {

    Films[] tmp = new Films[movie.length + 1];
    System.arraycopy(movie, 0, tmp, 0, movie.length);
    tmp[tmp.length - 1] = film;
    movie = tmp;
  }

  public Films[] getLastFilms() {
    int resultLength;
    if (movie.length < numberOfMovies) {
      resultLength = movie.length;
    } else {
      resultLength = numberOfMovies;
    }
    Films[] result = new Films[resultLength];

    for (int i = 0; i < resultLength; i++) {
      result[i] = movie[movie.length - 1 - i];
    }
    return result;
  }
}