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

    // Đinh Văn Luận - 20215083
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (!(o instanceof Track)) return false;
        
        Track tmp = (Track) o;

        return this.getTitle().equals(tmp.getTitle()) && this.getLength() == tmp.getLength();

    }
}
