package Music;

import java.util.Date;
import java.util.UUID;
// Lista de canciones del archivo MainPlayList.java
public class Song {
	//Atributos
	private String title;//Titulo de la cancion
	private String singer;//Cantante
	private UUID id;
	private Date dateSong;//Fecha de la cancion
	private int duration; //Duracion de la cancion en segundos
	private String genre;//Genero de la cancion
	private String coverPage;//Caratula de la cancion
	private String description;//Descripcion de la cancion
	
	//Metodo constructor de song
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
	// getters y setters para obtener lo valores
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
		this.dateSong = dateSong;// fecha para ordenar por fecha
	}
	public int getDuration() {
		return duration;
	}
	public void setMinutesDuration(int duration) {
		this.duration = duration;// Duracion para ordernar por tiempo pendiente
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
