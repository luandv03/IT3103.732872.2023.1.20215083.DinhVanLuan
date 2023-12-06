package hust.soict.dsai.aims.disc;

import hust.soict.dsai.aims.Disc;
import hust.soict.dsai.aims.Playable;

/**
* @author Đinh Văn Luận - 20215083
*/

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(length, director);
    	DigitalVideoDisc.nbDigitalVideoDiscs++;
        this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // public DigitalVideoDisc(String title) {
    //     this.title = title;
    // }

    // public DigitalVideoDisc (String title, String category,float cost) {
    // 	DigitalVideoDisc.nbDigitalVideoDiscs++;
    //     this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
    //     this.category = category;
    //     this.title = title;
    //     this.cost = cost;
    // }

    // public DigitalVideoDisc(String director, String category, String title, float cost){
    // 	DigitalVideoDisc.nbDigitalVideoDiscs++;
    //     this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
    //     this.director = director;
    //     this.category = category;
    //     this.title = title;
    //     this.cost = cost;
    // }
    
    // overide equals method to compare dvd objects.
    // @Override
    // public boolean equals(Object disc) {
    //     if (disc == this) return true;

    //     if (!(disc instanceof DigitalVideoDisc)) return false;
        
    //     DigitalVideoDisc tmp = (DigitalVideoDisc)disc;

    //     return this.title == tmp.getTitle() && 
    //     this.category == tmp.getCategory() && this.director == tmp.getDirector() && 
    //     this.length == tmp.getLength() && this.cost == tmp.getCost();
    // }

    @Override
    public String toString() {
        return this.id + ".DVD - " + this.title + " - " + this.category + " - " + this.director  + " - " + this.length + " : " + this.cost + "$";
    }

    // Đinh Văn Luận - 20215083
    public boolean isMatch(String title) {
        return this.title.equals(title);
    }


    // Đinh Văn Luận - 20215083
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
	    System.out.println("DVD length: " + this.getLength());
    }

}