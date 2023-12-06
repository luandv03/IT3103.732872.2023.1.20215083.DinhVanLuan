package hust.soict.dsai.aims.compact;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.Playable;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.track.Track;

public class CompactDisc extends Media implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String artist, String title, String category, float cost) {
        this.artist = artist;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public String getArtist() {
        return this.artist;
    }

    public void addTrack(Track track) {
        if (tracks.indexOf(track) >= 0) {
            System.out.println("StatusCode: 400, Message: This track already exists");

            return;
        }

        tracks.add(track);
        System.out.println("StatusCode: 200, Message: Add track successfull!");
    }

    public void removeTrack(Track track) {
        if (tracks.indexOf(track) < 0) {
            System.out.println("StatusCode: 404, Message: Track not found!");

            return;
        }

        tracks.remove(track);
        System.out.println("StatusCode: 200, Message: Remove track successfull!");
    }

    public int getLength() {
        int sumLengthListTrack = 0;
        for (Track track : tracks) {
            sumLengthListTrack += track.getLength();
        }

        return sumLengthListTrack;
    }

    // Đinh Văn Luận - 20215083
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD id: " + this.getId());
	    System.out.println("DVD category: " + this.getCategory());
        System.out.println("DVD cost: " + this.getCost());
        System.out.println("DVD asrtist: " + this.getArtist());
        System.out.println("List tracks: ");
        int count = 1;
        for (Track track : tracks) {
            System.out.println("-----Infomation track " + count + "-----");
            track.play();
            count++;
        }
    }

}
