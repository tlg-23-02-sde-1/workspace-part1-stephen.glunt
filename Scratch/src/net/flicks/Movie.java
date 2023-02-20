package net.flicks;

public class Movie {
    // fields or instance varialbes
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;


    public Movie(String title){
        setTitle(title);
    }

    public Movie(String title, Genre genre){
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Genre genre, Integer releaseYear) {
        this(title,genre);
        setReleaseYear(releaseYear);
    }

    public Movie(String title, Genre genre, Integer releaseYear, Rating rating){
        this(title, genre, releaseYear);
        setRating(rating);
    }

    public Movie(String title, Genre genre, Integer releaseYear, Rating rating, Double revenue){
        this(title, genre, releaseYear, rating);
        setRevenue(revenue);
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(Integer releaseYear) {
        if(releaseYear < 1888) {
            throw new IllegalArgumentException("The first \"movie\" ever made was Roundhay Garden Scene in 1888. " +
                    "There are no movies older than this.");
        } else {
            this.releaseYear = releaseYear;
        }
    }

    public void setRevenue(Double revenue) {
        if(revenue < 0){
            throw new IllegalArgumentException("Gross Revenue cannot be below zero.");
        } else {
            this.revenue = revenue;
        }
    }

    public String getTitle() {
        return title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {

        String revenueString = getRevenue() == null ? "null" : String.format("$%,.2f", getRevenue());
        return String.format("Movie: title = %s, releaseYear = %s, revenue = %s, rating = %s, genre = %s.",
                getTitle(), getReleaseYear(), revenueString, getRating(), getGenre());
    }
}