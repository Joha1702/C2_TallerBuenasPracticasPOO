package Music;

import java.util.Date;
import java.util.UUID;

/**
* Esta clase se utiliza para representar los atributos principales de una canci�n musical y los m�todos get and set para
* acceder a los atributos y para dar valor a los atributos. 
*
* @version 1.0.0 2022-02-13
*
* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com.
*         Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
*
* @since versi�n 1
*/

public class Song {

	/*
	 * Representa el titulo de la canci�n de tipo String
	 */
	private String title;
	/*
	 * Representa el nombre del cancante o cantantes de la canci�n de tipo String.
	 */
	private String singer;
	/*
	 * Representa el id de la canci�n, se genera de forma automatica.
	 */
	private UUID id;
	/*
	 * Representa la fecha de la canci�n de tipo Date.
	 */
	private Date dateSong;
	/*
	 * Representa la duraci�n de la canci�n en segundos.
	 */
	private int duration;
	/*
	 * Representa el genero musical de la canci�n de tipo String
	 */
	private String genre;
	/*
	 * Representa el nombre de caratula de la canci�n de tipo String.
	 */
	private String coverPage;
	/*
	 * Representa la descripci�n de la canci�n de tipo String.
	 */
	private String description;

    public Song() {
    }
	
	/**
	* M�todo constructor de la clase Cancion
	*
	* @param title: titulo de la canci�n
	* @param singer: cantante
	* @param dateSong: Fecha de la canci�n
	* @param duration: duracion de la cancion en segundos.
	* @param genre: genero musical de la canci�n de tipo String
	* @param coverPage: caratula de la canci�n.
	* @param description: descripci�n de la canci�n.
	* @return no retorna nada.
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*
	*/
	public Song(String title, String singer, Date dateSong, int duration, String genre, String coverPage,
			String description) {
		this.title = title;
		this.singer = singer;
		this.id = UUID.randomUUID();
		this.dateSong = dateSong;
		this.duration = duration;
		this.genre = genre;
		this.coverPage = coverPage;
		this.description = description;
	}
	
	/**
	* M�todos get y Set para obtener e ingresar el valor de cada una de los atributos a excepci�n del Id que se genera de 
	* forma automatica.
	* @param: para los m�todos set es el valor del atributo.
	* @return para los m�todos get es el valor del atributo.
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*
	*/
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public UUID getId() {
		return id;
	}
	public Date getDateSong() {
		return dateSong;
	}
	public void setDateSong(Date dateSong) {
		this.dateSong = dateSong;
	}
	public int getDuration() {
		return duration;
	}
	public void setMinutesDuration(int duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCoverPage() {
		return coverPage;
	}
	public void setCoverPage(String coverPage) {
		this.coverPage = coverPage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
