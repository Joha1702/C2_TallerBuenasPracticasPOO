package Music;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainPlayList {
	

	public static ArrayList<Song> generateMainPlayList() throws ParseException {
		
		ArrayList<Song> songs = new ArrayList<Song>();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		//lista de canciones : Nombre,Artista,fecha,genero,caratula,nombre
		Song song1 = new Song("Perdon","David Bisbal y Greeicy", format.parse("13-04-2001"), 135, "Pop", "perdon.png", "Perdon");
		songs.add(song1);
		Song song2 = new Song("Mala mia","Maluma", format.parse("01-01-2015"), 135, "Regueton", "malamia.png", "mala mia");
		songs.add(song2);
		Song song3 = new Song("001","Maluma", format.parse("01-01-2016"), 135, "Regue", "malamia.png", "mala mia");
		songs.add(song3);
		
		return songs;
		
	}

}
