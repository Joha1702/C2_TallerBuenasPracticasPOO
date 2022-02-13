package Music;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainPlayList {
	

	public static ArrayList<Song> generateMainPlayList() throws ParseException {
		
		ArrayList<Song> songs = new ArrayList<Song>();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		Song song1 = new Song("Perdón","David Bisbal y Greeicy", format.parse("13-04-2001"), 135, "Pop", "perdon.png", "Perdón");
		songs.add(song1);
		Song song2 = new Song("Mala mía","Maluma", format.parse("01-01-2015"), 135, "Regueton", "malamia.png", "mala mía");
		songs.add(song2);
		
		
		return songs;
		
	}

}
