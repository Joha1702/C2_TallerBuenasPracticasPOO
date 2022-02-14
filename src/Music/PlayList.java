package Music;

import java.util.ArrayList;
import java.util.UUID;

/**
* Esta clase representa una lista de reproducción de canciones, con sus atributos y métodos principales.
* 
* Ejemplo:
* PlayList clase = new PlayList("PlayList Pop");
*   clase.setname(name);
*   ValorDeRespuesta valor = clase.addSong(Song);
* 
*
* @version 1.0.0 2022-02-13
*
* @author Leidy Johana Moreno López - leidymoreno17@gmail.com.
*         Yeiner Hidalgo - 
*
* @since versión 1
*
*/

public class PlayList{

	private String name;
	private int duration;
	private UUID id;
	private ArrayList<Song> songs;
	
	
	
	public PlayList(String name) {
		this.name = name;
		this.duration = 0;
		this.id = UUID.randomUUID();
		this.songs = new ArrayList<Song>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getDuration() {
		return duration;
	}

	public UUID getId() {
		return id;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	
	public void addSong(Song song) {
		songs.add(song);
		duration = duration + song.getDuration();
	}
	
	
}
