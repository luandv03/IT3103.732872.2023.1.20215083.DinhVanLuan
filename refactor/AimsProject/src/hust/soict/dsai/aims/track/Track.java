package hust.soict.dsai.aims.track;

import hust.soict.dsai.aims.Playable;

public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return this.length;
    }

    // Đinh Văn Luận - 20215083
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
	    System.out.println("DVD length: " + this.getLength());
    }
}
