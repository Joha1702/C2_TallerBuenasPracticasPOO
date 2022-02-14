package Music;
/*
 * Interfaz que representan los métodos que se deben implementar en una lista de canciones
 */
import java.util.ArrayList;

public interface IPlayList {
	
	public void orderDuration(ArrayList<Song> song);
	public void orderDate(ArrayList<Song> song);
	public void filterGenre(String genre, ArrayList<Song> songs);
	public void filterYear(String year, ArrayList<Song> songs);
	void showPlayList(ArrayList<Song> playList);

}
