package net.flicks;

public enum Genre {
    ACTION("Action"),
    COMEDY("Comedy"),
    MYSTERY("mystery"),
    ROMANCE("Romance"),
    SCI_FI("Science Fiction"),
    DRAMA("Drama"),
    HORROR("Horror"),
    WESTERN("Western"),
    FANTASY("Fantasy"),
    DOCUMENTARY("Documentary");


    private final String display;

    Genre(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return getDisplay();
    }
}