package Music;

import java.util.ArrayList;
/*
 * Clase playList representa un listado de canciones con los siguiente atributos: 
 * nombre playlist
 * duración en segundos
 * identificador
 * listado de canciones de tipo Song
 */
public class PlayList implements IPlayList{

	private String name;
	private int duration;
	private Integer Identifier;
	private ArrayList<Song> songs;
	
	
	
	public PlayList(String name, int duration, Integer identifier) {
		this.name = name;
		this.duration = duration;
		Identifier = identifier;
		this.songs = new ArrayList<Song>();
	}



	@Override
	public void orderDuration(ArrayList<Song> song) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void orderDate(ArrayList<Song> song) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void filterGenre(String genre) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void filterYear(String year) {
		// TODO Auto-generated method stub
		
	}


}
