package com.github.methawinnikaji.models;

public class Doraemon extends Anime {

    public Doraemon() {
        super("Doraemon", "1-1-1995",Genre.COMEDY);
    }

    @Override
    public String[] details() {
        return new String[] {
                "Doraemon created by Fujiko F Fujio",
                "and bra bra bra",
                "then bra bra bra"
        };
    }
    @Override
    public Platform[] platforms() {
        return new Platform[]{
                Platform.BILIBILI,
                Platform.NETFLIX,
        };
    }
}


