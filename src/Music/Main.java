package Music;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);

		ArrayList<Song> mainplayList = MainPlayList.generateMainPlayList();
		PlayListImplementation playListImp = new PlayListImplementation();
		ArrayList<PlayList> playLists = new ArrayList<PlayList>();
		
		System.out.println("Bliblioteca principal de musica: \n");

		playListImp.showPlayList(mainplayList);

		boolean flat = true;
		do {

			System.out.println("\nQue desea realizar: \n" + "1. Filtro por genero\n" + "2. Filtro por Año\n"
					+ "3. Crear PlayList\n" + "4. Salir");
			int option = input.nextInt();

			switch (option) {
			case 1:
				System.out.println("Por favor elija un genero de la siguiente lista:\n"
						+ "Pop, Regueton, Jazz, Salsa, Bachata, Ranchera, Vallenato, Hip Hop");
				String genre = input.next();
				playListImp.filterGenre(genre, mainplayList);
				break;
			case 2:
				System.out.println("Por favor ingrese el año a filtrar:\n");
				int year = input.nextInt();
				playListImp.filterYear(year, mainplayList);
				break;
			case 3:
				System.out.println("Por favor ingrese el nombre de la PlayList: ");
				String name = input.next();			
				
				System.out.println("Por favor ingrese los números de las canciones para la playList separados por ',' :\n");
				String listSongs = input.next();
				
				PlayList playlist = new PlayList(name);
				
				String[] listSongsSeparated = listSongs.replaceAll(" ", "").split(",");
				int[] intList = new int[listSongsSeparated.length];
				try {
					intList = Arrays.stream(listSongsSeparated).mapToInt(Integer::parseInt).toArray();
				} catch (Exception e) {
					System.out.println("Unable to parse string to int: " + e.getMessage());
				}
				
				for (int index : intList) {
					playlist.addSong(mainplayList.get(index-1));
				}
				System.out.println("Playlist "+name+" \n"
						+ "Duración "+playlist.getDurationMinutes()+ " \n"
						+ "canciones:");
				playListImp.showPlayList(playlist.getSongs());
				break;

			default:
				flat = false;
				break;
			}

		} while (flat);

	}

}
