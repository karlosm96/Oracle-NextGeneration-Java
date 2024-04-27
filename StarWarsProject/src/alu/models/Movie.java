package alu.models;

public class Movie extends Title {
    private String director;
    private int filmNumber;

    public Movie(TitleSWAP movie){
        try{
            this.filmNumber = Integer.parseInt(movie.episode_id());
            this.director = movie.director();
            super.setYear(Integer.parseInt(movie.release_date().substring(0,4)));
            super.setTitle(movie.title());
        } catch (NumberFormatException e){
            System.out.println(e);
        }

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getFilmNumber() {
        return filmNumber;
    }

    public void setFilmNumber(int filmNumber) {
        this.filmNumber = filmNumber;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title=" + super.getTitle() +
                ", director=" + director +
                ", filmNumber=" + filmNumber +
                ", year=" + super.getYear() +
                '}';
    }
}
