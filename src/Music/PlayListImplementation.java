package Music;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
* Esta clase se utiliza para implementar los mï¿½todos de la interfaz IPlayList (que son los comportamientos
* que se pueden utilizar en una lista de producciï¿½n). 
*
* @version 1.0.0 2022-02-13
*
* @author Leidy Johana Moreno Lï¿½pez - leidymoreno17@gmail.com.
*         Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
*
* @since versiï¿½n 1
*/

public class PlayListImplementation implements IPlayList, Comparator<Song>{

	@Override
	public void orderDuration(int orderOption, ArrayList<Song> songs) {
		
				if (orderOption == 1) {
					
                System.out.println("\nLas siguientes Canciones estan ordenadas por Duracion Ascendente "+" \n");
                System.out.println("\n Duración -- Título "+" \n");
                
                Collections.sort(songs, new Comparator<Song>() {
                	@Override
                	public int compare(Song song1, Song song2) {
                		return new Integer(song1.getDuration()).compareTo(new Integer(song2.getDuration()));
                	}
                });
				}else if (orderOption == 2) {
					System.out.println("\nLas siguientes Canciones estan ordenadas por Duracion Descendente "+" \n");
					System.out.println("\n Duración -- Título "+" \n");
	                
	                
	                Collections.sort(songs, new Comparator<Song>() {
	                	@Override
	                	public int compare(Song song1, Song song2) {
	                		return new Integer(song2.getDuration()).compareTo(new Integer(song1.getDuration()));
	                	}
	                });
				}else {
					System.out.println("La opción elegida no es válida");
				}
				
                
                for(int i = 0; i < songs.size(); i++) {
        			System.out.println(i+1+ "-" +songs.get(i).getDuration()+ " - " +songs.get(i).getTitle());
        			} 
	}
	
    @Override
	public void orderDate(int optionOrder, ArrayList<Song> songs) {
		// TODO Auto-generated method stub
               System.out.println("\nLas siguientes Canciones estan ordenadas por Fecha "+" \n");
               for(int i = 0; i < songs.size(); i++) {
			System.out.println(i+1+ "-" +songs.get(i).getTitle()+ "-" +songs.get(i).getDateSong());
			}
               
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
		System.out.println("Canciones del aï¿½o: "+year+" \n");
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

	@Override
	public int compare(Song arg0, Song arg1) {
		return 0;
	}



}
