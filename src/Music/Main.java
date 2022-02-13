package Music;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws ParseException {
		ArrayList<Song> mainplayList = MainPlayList.generateMainPlayList();
		PlayListImplementation playListImp = new PlayListImplementation();
		System.out.println("Bliblioteca principal de música: \n");
		
		playListImp.showPlayList(mainplayList);

	}

}
