package Music;
//001
import java.text.ParseException;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws ParseException {
		ArrayList<Song> mainplayList = MainPlayList.generateMainPlayList();
		PlayListImplementation playListImp = new PlayListImplementation();
		System.out.println("Bliblioteca principal de musica: \n");
		
		playListImp.showPlayList(mainplayList);

	}

}
