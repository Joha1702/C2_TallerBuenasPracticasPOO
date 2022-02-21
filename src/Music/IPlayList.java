package Music;

import java.util.ArrayList;
import java.util.Date;
/**
* Esta Interfaz se utiliza para declarar los metodos que se pueden utilizar en una lista de reproducci�n de canciones. 
*
* @version 1.0.0 2022-02-13
*
* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com.
*         Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
*
* @since versi�n 1
*/

public interface IPlayList {
	
	public void orderDuration(int optionOrder,ArrayList<Song> song);
	public void orderDate(int optionOrder, ArrayList<Song> song);
	public void filterGenre(String genre, ArrayList<Song> songs);
	public void filterYear(int year, ArrayList<Song> songs);
	void showPlayList(ArrayList<Song> playList);

}
