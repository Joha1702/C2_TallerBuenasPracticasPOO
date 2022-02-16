package Music;

import java.util.ArrayList;
/**
* Esta Interfaz se utiliza para declarar los métodos que se pueden utilizar en una lista de reproducción de canciones. 
*
* @version 1.0.0 2022-02-13
*
* @author Leidy Johana Moreno López - leidymoreno17@gmail.com.
*         Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
*
* @since versión 1
*/

public interface IPlayList {
	
	public void orderDuration(ArrayList<Song> song);
	public void orderDate(ArrayList<Song> song);
	public void filterGenre(String genre, ArrayList<Song> songs);
	public void filterYear(int year, ArrayList<Song> songs);
	void showPlayList(ArrayList<Song> playList);

}
