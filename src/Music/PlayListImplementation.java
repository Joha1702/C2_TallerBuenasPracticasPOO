package Music;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
* Esta clase se utiliza para implementar los m�todos de la interfaz IPlayList (que son los comportamientos
* que se pueden utilizar en una lista de producci�n). 
*
* @version 1.0.0 2022-02-13
*
* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com.
*         Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
*
* @since versi�n 1
*/

public class PlayListImplementation implements IPlayList {

	@Override
	public void orderDuration(int duration,ArrayList<Song> songs) {
		// TODO Auto-generated method stub
                System.out.println("\nLas siguientes Canciones estan ordenadas por Duracion "+" \n");
                for(int i = 0; i < songs.size(); i++) {
			
                            System.out.println(i+1+ "-" +songs.get(i).getDuration()+"-"+songs.get(i).getTitle());
                        
			}

	}
       @Override
	public void orderDate(Date dateSong, ArrayList<Song> songs) {
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
		System.out.println("Canciones del a�o: "+year+" \n");
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

    void orderDate(int dateSong, ArrayList<Song> mainplayList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
