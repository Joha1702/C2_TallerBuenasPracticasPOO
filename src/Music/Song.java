package Music;

import java.util.Date;
import java.util.UUID;

public class Song {
	
	private String title;
	private String singer;
	private UUID id;
	private Date dateSong;
	private int duration; //en segundos
	private String genre;
	private String coverPage;
	private String description;
	
	
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
