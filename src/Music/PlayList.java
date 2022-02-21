package Music;

import java.util.ArrayList;
import java.util.UUID;

/**
* Esta clase representa una lista de reproduccion de canciones, con sus atributos y metodos principales.
* 
* Ejemplo:
* PlayList clase = new PlayList("PlayList Pop");
*   clase.setname(name);
*   ValorDeRespuesta valor = clase.addSong(Song);
* 
*
* @version 1.0.0 2022-02-13
*
* @author Leidy Johana Moreno Lopez - leidymoreno17@gmail.com.
*         Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
*
* @since versi�n 1
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
		this.songs = new ArrayList<>();
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

	public void addSong(Song song) {
		songs.add(song);
		duration = duration + song.getDuration();
	}
	
	public String getDurationMinutes() {
		
		double time = this.duration / 60;
		double seg = time % 1;
		double minutes = time - seg;
		return minutes+" minutos "+seg+" segundos";
	}
	
	public void showPlayLists(ArrayList<PlayList> playLists){
		System.out.println("Listado de PlayLists creadas: ");
		for (int i=0; i<playLists.size(); i++) {
			System.out.println(i+1+" - "+playLists.get(i).getName());
		}

	}
	
	
}
