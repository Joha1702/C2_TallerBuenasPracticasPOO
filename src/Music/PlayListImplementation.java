package Music;

import java.util.ArrayList;
import java.util.Calendar;

/**
* Esta clase se utiliza para implementar los métodos de la interfaz IPlayList (que son los comportamientos
* que se pueden utilizar en una lista de producción). 
*
* @version 1.0.0 2022-02-13
*
* @author Leidy Johana Moreno López - leidymoreno17@gmail.com.
*         Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
*
* @since versión 1
*/

public class PlayListImplementation implements IPlayList {

	@Override
	public void orderDuration(ArrayList<Song> song) {
		// TODO Auto-generated method stub

	}

	@Override
	public void orderDate(ArrayList<Song> song) {
		// TODO Auto-generated method stub

	}

	@Override
	public void filterGenre(String genre, ArrayList<Song> songs) {
		System.out.println("\nLas siguientes Canciones son del genero: "+genre+" \n");
		for(int i = 0; i < songs.size(); i++) {
			if(songs.get(i).getGenre().equalsIgnoreCase(genre)){
				
				System.out.println(i+1+ "-" +songs.get(i).getTitle()+ "-" +songs.get(i).getGenre());
			}
        }
	}
	
	
	@Override
	public void filterYear(int year, ArrayList<Song> songs) {
		System.out.println("Canciones del año: "+year+" \n");
		for(int i = 0; i < songs.size(); i++) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(songs.get(i).getDateSong());
			if(calendar.get(Calendar.YEAR) == year){
				System.out.println(i+1+ "-" +songs.get(i).getTitle()+ "-" +calendar.get(Calendar.YEAR));
			}
        }

	}

	@Override
	public void showPlayList(ArrayList<Song> playList) {
		for(int i = 0; i < playList.size(); i++) {
            System.out.println(i+1+ "-" +playList.get(i).getTitle());
            
        }

	}

}
