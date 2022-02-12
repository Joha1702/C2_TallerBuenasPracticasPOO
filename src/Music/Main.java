package Music;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws ParseException {
		List<Song> mainplayList = new ArrayList<Song>();
		
		mainplayList = generateMainPlayList();
		
		JOptionPane.showMessageDialog(null, "Biblioteca Principal de Música\n"
				);
		
		for(int i = 0; i < mainplayList.size(); i++) {
            System.out.println(mainplayList.get(i).getIdentifier()+ "-" +mainplayList.get(i).getTitle());
            
        }

	}
	
	public static List<Song> generateMainPlayList() throws ParseException {
		
		List<Song> songs = new ArrayList<Song>();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		Song song1 = new Song("Perdón","David Bisbal y Greeicy", 1, format.parse("13-04-2001"), 135, "Pop", "perdon.png", "Perdón");
		songs.add(song1);
		Song song2 = new Song("Mala mía","Maluma", 2, format.parse("01-01-2015"), 135, "Regueton", "malamia.png", "mala mía");
		songs.add(song2);
		
		
		return songs;
		
	}

}
