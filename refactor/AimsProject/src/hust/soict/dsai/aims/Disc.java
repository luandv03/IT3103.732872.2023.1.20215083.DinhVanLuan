package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.Media;

public class Disc extends Media {
    protected int length;
    protected String director;

    public Disc(int length, String director) {
        this.length = length;
        this.director = director;
    }

    public String getDirector() {
        return this.director;
    }

    public int getLength() {
        return this.length;
    }    
}
