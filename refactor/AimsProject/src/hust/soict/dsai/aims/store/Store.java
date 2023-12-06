package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

/**
* @author Đinh Văn Luận - 20215083
*/

public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("StatusCode: 400, Message: This media already exists");

            return;
        }

        itemsInStore.add(media);
        System.out.println("StatusCode: 200, Message: Add media successfull!");
    }

    public void removeMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            System.out.println("StatusCode: 404, Message: media not found!");

            return;
        }

        itemsInStore.remove(media);
        System.out.println("StatusCode: 200, Message: Remove media successfull!");
    }
} 