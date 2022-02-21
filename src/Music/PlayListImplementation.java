package Music;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

/**
* Esta clase se utiliza para implementar los m�todos de la interfaz IPlayList (que son los comportamientos
* que se pueden utilizar en una lista de producci�n). 
*
* @version 1.0.0 2022-02-13
*
* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com.
*         Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
*
* @since versi�n 1
*/

public class PlayListImplementation implements IPlayList, Comparator<Song>{

	/**
	* M�todo para ordenar un listado de canciones por duraci�n, en orden ascendente o descendente.
	* utilizando la sobreescritura del metodo compare de la interfaz Comparator
	*
	* @param orderOption: 1 para orden ascendente � 2 para orden descendente.
	* @param songs: listado de canciones a ordenar.
	* @return no retorna nada.
	* @throws Exception
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*
	*/
	
	@Override
	public void orderDuration(int orderOption, ArrayList<Song> songs) {
		
				if (orderOption == 1) {
					
                System.out.println("\nLas siguientes Canciones estan ordenadas por Duracion Ascendente "+" \n");
                System.out.println("\n Duraci�n -- T�tulo "+" \n");
                
                Collections.sort(songs, new Comparator<Song>() {
                	@Override
                	public int compare(Song song1, Song song2) {
                		return new Integer(song1.getDuration()).compareTo(new Integer(song2.getDuration()));
                	}
                });
				}else if (orderOption == 2) {
					System.out.println("\nLas siguientes Canciones estan ordenadas por Duracion Descendente "+" \n");
					System.out.println("\n Duraci�n -- T�tulo "+" \n");
	                
	                
	                Collections.sort(songs, new Comparator<Song>() {
	                	@Override
	                	public int compare(Song song1, Song song2) {
	                		return new Integer(song2.getDuration()).compareTo(new Integer(song1.getDuration()));
	                	}
	                });
				}else {
					System.out.println("La opci�n elegida no es v�lida");
				}
				
                
                for(int i = 0; i < songs.size(); i++) {
        			System.out.println(i+1+ "-" +songs.get(i).getDuration()+ " - " +songs.get(i).getTitle());
        			} 
	}
	
	/**
	* M�todo para ordenar un listado de canciones por fecha, en orden ascendente o descendente.
	*
	* @param orderOption: 1 para orden ascendente � 2 para orden descendente.
	* @param songs: listado de canciones a ordenar.
	* @return no retorna nada.
	* @throws Exception
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*
	*/
    @Override
	public void orderDate(int optionOrder, ArrayList<Song> songs) {
	       Song aux = new Song();
               System.out.println("\nLas siguientes Canciones estan ordenadas por Fecha "+" \n");
               for(int i = 0; i < songs.size()-1; i++) {
                   for(int j = 0; j < songs.size()-1; j++) {
                       Calendar calendar = Calendar.getInstance();
                       calendar.setTime(songs.get(i).getDateSong());
                       Calendar calendar2 = Calendar.getInstance();
                       calendar2.setTime(songs.get(j+1).getDateSong());
                   //    if ({
                           
                           
                       }
                   }
			System.out.println(i+1+ "-" +songs.get(i).getTitle()+ "-" +songs.get(i).getDateSong());
			}
               
	}
    
	/**
	* M�todo para filtrar por un genero indicado por el usuario dentro de un listado de canciones.
	*
	* @param genre: genero musical a ordenar de tipo String.
	* @param songs: listado de canciones a ordenar.
	* @return no retorna nada.
	* @throws Exception
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*
	*/

	@Override
	public void filterGenre(String genre, ArrayList<Song> songs) {
		System.out.println("\nLas siguientes Canciones son del genero: "+genre+" \n");
		for(int i = 0; i < songs.size(); i++) {
			if(songs.get(i).getGenre().equalsIgnoreCase(genre)){
				
				System.out.println(i+1+ "-" +songs.get(i).getTitle()+ "-" +songs.get(i).getGenre());
			}
        }
	}
	
	
	/**
	* M�todo para filtrar por Anyo indicado por el usuario en un listado de canciones.
	*
	* @param year: a�o a filtrar de tipo entero.
	* @param songs: listado de canciones a ordenar.
	* @return no retorna nada.
	* @throws Exception
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*
	*/
	
	@Override
	public void filterYear(int year, ArrayList<Song> songs) {
		System.out.println("Canciones del a�o: "+year+" \n");
		for(int i = 0; i < songs.size(); i++) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(songs.get(i).getDateSong());
			if(calendar.get(Calendar.YEAR) == year){
				System.out.println(i+1+ "-" +songs.get(i).getTitle()+ "-" +calendar.get(Calendar.YEAR));
			}
        }

	}
	
	/**
	* M�todo para mostrar las canciones de un PlayList
	*
	* @param songs: listado de canciones a ordenar.
	* @return no retorna nada.
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*
	*/

	@Override
	public void showPlayList(ArrayList<Song> playList) {
		for(int i = 0; i < playList.size(); i++) {
            System.out.println(i+1+ "-" +playList.get(i).getTitle());
            
        }

	}

	/**
	* M�todo para comprar canciones y realizar el ordenamiento por duraci�n y Fecha.
	*
	* @param arg0: argmento 1 de tipo canci�n.
	* @param arg1: argmento 2 de tipo canci�n.
	* @return no retorna nada.
	*
	* @author viene de la interfaz Comparator
	*
	* @since version 1
	*
	*/
	@Override
	public int compare(Song arg0, Song arg1) {
		return 0;
	}
	
	
	/**
	* M�todo para mostrar las playLists creadas
	*
	* @param songs: listado de canciones a ordenar.
	* @return no retorna nada.
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*
	*/
	public void showPlayLists(ArrayList<PlayList> playLists) {
		System.out.println("Listado de PlayLists creadas: ");
		if (playLists.isEmpty()) {
			System.out.println("No se ha creado ninguna PlayList");
		} else {

			for (int i = 0; i < playLists.size(); i++) {
				System.out.println(i + 1 + " - " + playLists.get(i).getName());
			}
		}

	}



}
