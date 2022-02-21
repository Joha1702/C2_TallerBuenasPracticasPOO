package Music;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Esta clase representa una lista de reproduccion de canciones, con sus
 * atributos y metodos principales.
 * 
 * Ejemplo: PlayList clase = new PlayList("PlayList Pop"); clase.setname(name);
 * ValorDeRespuesta valor = clase.addSong(Song);
 * 
 *
 * @version 1.0.0 2022-02-13
 *
 * @author Leidy Johana Moreno Lopez - leidymoreno17@gmail.com. 
 *        Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
 *
 * @since versi�n 1
 *
 */

public class PlayList {

	private String name;
	private int duration;
	private UUID id;
	private ArrayList<Song> songs;

	/**
	* M�todo constructor vacio para crear una nueva playlist
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*/
	public PlayList() {

	}

	/**
	* M�todo constructor para crear una nueva playlist, que recibe el nombre de la playlist a crear e inicializa los dem�s 
	* atributos.
	* 
	* @param name: nombre de la playList
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*/
	public PlayList(String name) {
		this.name = name;
		this.duration = 0;
		this.id = UUID.randomUUID();
		this.songs = new ArrayList<>();
	}

	/**
	* M�todo get para obtener el nombre de la canci�n
	* 
	* @return nombre de la canci�n.
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*/
	public String getName() {
		return name;
	}

	/**
	* M�todo set para asignar el nombre de la canci�n
	* 
	* @param name: nombre de la canci�n.
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* M�todo get para obtener el nombre de la canci�n
	* 
	* @return nombre de la canci�n.
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*/
	public int getDuration() {
		return duration;
	}

	/**
	* M�todo get para obtener identificador de la canci�n
	* 
	* @return identificador �nico de la canci�n.
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*/
	public UUID getId() {
		return id;
	}

	/**
	* M�todo get para obtener el listado de canciones de la playList
	* 
	* @return listado de canciones de la playList
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*/
	public ArrayList<Song> getSongs() {
		return songs;
	}

	/**
	* M�todo para a�adir una nueva canci�n a la playList y aumenta la duraci�n de la misma.
	* 
	* @return no retorna.
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*/
	public void addSong(Song song) {
		songs.add(song);
		duration = duration + song.getDuration();
	}

	/**
	* M�todo para obtener la duraci�n en minutos y segundos.
	* 
	* @return un string con los minutos y segundos de la canci�n.
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*/
	public String getDurationMinutes() {

		double time = this.duration / 60;
		double seg = time % 1;
		double minutes = time - seg;
		return minutes + " minutos " + seg + " segundos";
	}

	

}
