package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

/**
* @author Đinh Văn Luận - 20215083
*/

public class Cart {
    private List<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("StatusCode: 400, Message: This media already exists");

            return;
        }

        itemsOrdered.add(media);
        System.out.println("StatusCode: 200, Message: Add media successfull!");
    }

    public void removeMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            System.out.println("StatusCode: 404, Message: media not found!");

            return;
        }

        itemsOrdered.remove(media);
        System.out.println("StatusCode: 200, Message: Remove media successfull!");
    }

    public float totalCost() {
        float sum = 0;
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }

        return sum;
    }

    // // Đinh Văn Luận - 20215083
    // public void print() {
    //     System.out.println("***********************CART***********************");
    //     System.out.println("Ordered Items:");

    //     double totalCost = 0; 
    //     for (int i = 0; i < qtyOrdered; i++) {
    //         totalCost += itemsOrdered[i].getCost();
    //         System.out.println(itemsOrdered[i].toString());
    //     }

    //     System.out.println("Total cost: " + totalCost);
    // }

    // // Đinh Văn Luận - 20215083
    // public void searchDVDsById(int id) {
    //     boolean check = false; // biến check này để kiểm tra sau khi duyệt hết danh sách thì có tìm được DVD cần tìm không

    //     for (int i = 0; i < qtyOrdered; i++) {
    //         if (itemsOrdered[i].getId() == id) {
    //             check = true;

    //             System.out.println(itemsOrdered[i].toString());
    //             break;
    //         }
    //     }

    //     if (!check) {
    //         System.out.println("Not DVDs match for id = " + id);
    //     }
    // }

    // public void searchDVDsByTitle(String title) {
    //     boolean check = false; // biến check này để kiểm tra sau khi duyệt hết danh sách thì có tìm được DVD cần tìm không

    //     for (int i = 0; i < qtyOrdered; i++) {
    //         if (itemsOrdered[i].isMatch(title)) {
    //             check = true;

    //             System.out.println(itemsOrdered[i].toString());
    //             break;
    //         }
    //     }

    //     if (!check) {
    //         System.out.println("Not DVDs match! for title = " + title);
    //     }
    // }
}
