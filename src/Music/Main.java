package Music;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
* Esta clase es la principal del proyecto y en ella se implementa la interacción con el usuario.
*
* @version 1.0.0 2022-02-13
*
* @author Leidy Johana Moreno Lï¿½pez - leidymoreno17@gmail.com.
*         Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
*
* @since versiï¿½n 1
*/


public class Main {

	/**
	* Método principal para implementar la interacción con el usuario donde se le muestra un listado principal de canciones y
	* el usuario puede creer playLists, filtrar u ordenar.
	* @throws ParseException
	*
	* @author Leidy Johana Moreno López - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*
	*/
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

			System.out.println("\nQue desea realizar: \n" + "1. Filtro por genero\n" + "2. Filtro por A\u00f1o\n"
					+ "3. Crear PlayList\n" + "4. Ordenar por Duracion\n" + "5. Ordenar por Fecha\n" + "6. Salir\n");
			int option = input.nextInt();

			switch (option) {
			case 1:
				System.out.println("Por favor elija un genero de la siguiente lista:\n"
						+ "Pop, Regueton, Jazz, Salsa, Bachata, Ranchera, Vallenato, Hip Hop\n");
				String genre = input.next();
				playListImp.filterGenre(genre, mainplayList);
				break;

			case 2:
				System.out.println("Por favor ingrese el a\u00f1o a filtrar:\n");
				int year = input.nextInt();
				playListImp.filterYear(year, mainplayList);
				break;

			case 3:
				System.out.println("Por favor ingrese el nombre de la PlayList: ");
				String name = input.next();

				System.out.println(
						"Por favor ingrese los n\u00fameros de las canciones para la playList separados por ',' :\n");
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
					playlist.addSong(mainplayList.get(index - 1));
				}
				playLists.add(playlist);
				System.out.println("Playlist " + name + " \n" + "Duraci\u00f3n " + playlist.getDurationMinutes() + " \n"
						+ "canciones:");

				playListImp.showPlayList(playlist.getSongs());
				playListImp.showPlayLists(playLists);
				break;

			case 4:
				System.out.println("Elija una opción para ordenar: \n" + "1. Ascendente \n" + "2. Descendente");
				int orderOption = input.nextInt();

				System.out.println(
						"Ingrese e nombre de la playList que desea ordenar o mainPlayList para ordenar biblioteca principal:");
				playListImp.showPlayLists(playLists);
				String namePlaylist = input.next();
				if (namePlaylist.equalsIgnoreCase("mainPlayList")) {
					playListImp.orderDuration(orderOption, mainplayList);
				}
				for (int i = 0; i< playLists.size();i++) {
					if(playLists.get(i).getName().equalsIgnoreCase(namePlaylist)) {
						playListImp.orderDuration(orderOption, playLists.get(i).getSongs());
					}else {
						System.out.println("el nombre de la PlayList ingresada no existe");
					}
				}
				
				break;

			case 5:
				System.out.println("Elija una opción para ordenar: \n" + "1. Ascendente \n" + "2. Descendente");
				int orderOptionDate = input.nextInt();

				System.out.println(
						"Ingrese e nombre de la playList que desea ordenar o mainPlayList para ordenar biblioteca principal:");
				playListImp.showPlayLists(playLists);
				String nameplaylist = input.next();
				if (nameplaylist.equalsIgnoreCase("mainPlayList")) {
					playListImp.orderDuration(orderOptionDate, mainplayList);
				}
				for (int i = 0; i< playLists.size();i++) {
					if(playLists.get(i).getName().equalsIgnoreCase(nameplaylist)) {
						playListImp.orderDuration(orderOptionDate, playLists.get(i).getSongs());
					}else {
						System.out.println("el nombre de la PlayList ingresada no existe");
					}
				}
				break;

			default:
				flat = false;
				break;
			}

		} while (flat);

	}

}
