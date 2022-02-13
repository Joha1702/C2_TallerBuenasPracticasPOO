package Music;

import java.util.ArrayList;
import java.util.UUID;
/*
 * Clase playList representa un listado de canciones con los siguiente atributos: 
 * nombre playlist
 * duración en segundos
 * identificador
 * listado de canciones de tipo Song
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
