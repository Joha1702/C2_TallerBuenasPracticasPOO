package Music;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainPlayList {
	

	public static ArrayList<Song> generateMainPlayList() throws ParseException {
		
		ArrayList<Song> songs = new ArrayList<Song>();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		Song song1 = new Song("Perd�n","David Bisbal y Greeicy", format.parse("13-04-2001"), 135, "Pop", "perdon.png", "Perd�n");
		songs.add(song1);
		Song song2 = new Song("Mala m�a","Maluma", format.parse("01-01-2015"), 135, "Regueton", "malamia.png", "mala m�a");
		songs.add(song2);
		
		
		return songs;
		
	}

}
