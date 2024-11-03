import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String>playlist=new ArrayList<>();
        playlist.add("Hitman");
        playlist.add("Batman");
        playlist.add("Spiderman");
        playlist.add("I beleive ");
        playlist.add("Codey");
        playlist.remove(2);

        
        //for each loop
        for (String play:playlist) System.out.println(play);

        //for loop to print much time to the array size
        for(int i = 0; i<playlist.size();i++){
            System.out.println(playlist.get(i));
        }


    }
}
