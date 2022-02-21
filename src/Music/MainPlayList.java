package Music;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Esta clase representa la biblioteca principal de canciones que se le presenta al usuario para crear nuevas playLists.
 *
 * @version 1.0.0 2022-02-13
 *
 * @author Leidy Johana Moreno Lopez - leidymoreno17@gmail.com. 
 *        Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
 *
 * @since versi�n 1
 *
 */
public class MainPlayList {
	
	/**
	* M�todo para generar (en este caso de forma manual) la biblioteca principal de canciones.
	*
	* @return listado principal de canciones
	* @throws Exception
	*
	* @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	*  			Yeiner Hidalgo - yeinerhidalgomolina@gmail.com
	*
	* @since version 1
	*
	*/
	public static ArrayList<Song> generateMainPlayList() throws ParseException {
		
		ArrayList<Song> songs = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Song song1 = new Song("Perdon","David Bisbal y Greeicy", format.parse("13-04-2001"), 237, "Pop", "perdon.png", "Perdon");
		songs.add(song1);
		Song song2 = new Song("Mala mia","Maluma", format.parse("01-01-2015"), 325, "Regueton", "malamia.png", "mala mia");
		songs.add(song2);
		Song song3 = new Song("Dios te hizo tan bien ft.","Mauricio Alen", format.parse("9-02-2017"), 292, "Salsa", "Diostehizotanbienft.png", "Dios te hizo tan bien ft.");
		songs.add(song3);
		Song song4 = new Song("Someone Like You","Adele", format.parse("29-09-2011"), 294, "Jazz", "SomeoneLikeYou.png", "Someone Like You");
		songs.add(song4);
		Song song5 = new Song("Rolling in the Deep","Adele ", format.parse("30-11-2010"), 300, "Jazz", "RollingintheDeep.png", "Rolling in the Deep");
		songs.add(song5);
		Song song6 = new Song("Te Dejo En Libertad","HA-ASH", format.parse("20-07-2011"), 151, "Salsa", "TeDejoEnLibertad.png", "Te Dejo En Libertad");
		songs.add(song6);
		Song song7 = new Song("Eres Mía","Romeo Santos", format.parse("16-07-2014"), 151, "Bachata", "EresMía.png", "Eres Mía");
		songs.add(song7);
		Song song8 = new Song("Nota de Amor","Wisin, Carlos Vives", format.parse("17-04-2015"), 318, "Pop", "NotadeAmor.png", "Nota de Amor");
		songs.add(song8);
		Song song9 = new Song("Sígueme y Te Sigo","Daddy Yankee ", format.parse("8-05-2015"), 308, "Pop", "SíguemeyTeSigo.png", "Sígueme y Te Sigo");
		songs.add(song9);
		Song song10 = new Song("Solamente Tú","Pablo Alborán", format.parse("21-09-2010"), 331, "Pop", "SolamenteTú.png", "Solamente Tú");
		songs.add(song10);
		Song song11 = new Song("Flor Pálida","Marc Anthony", format.parse("17-10-2014"), 196, "Bachata", "FlorPálida.png", "Flor Pálida");
		songs.add(song11);
		Song song12 = new Song("Rockabye","Clean Bandit", format.parse("21-10-2016"), 226, "Jazz", "Rockabye.png", "Rockabye");
		songs.add(song12);
		Song song13 = new Song("Creo en Ti","Reik", format.parse("13-04-2012"), 229, "Bachata", "Creo en Ti.png", "Creo en Ti");
		songs.add(song13);
		Song song14 = new Song("Hoy Tengo Ganas De Ti ft.","Alejandro Fernández", format.parse("19-07-2013"), 252, "Pop", "HoyTengoGanasDeTift.png", "Hoy Tengo Ganas De Ti ft");
		songs.add(song14);
		Song song15 = new Song("Te Fuiste de Aquí","Reik", format.parse("17-09-2012"), 298, "Bachata", "TeFuistedeAquí.png", "Te Fuiste de Aquí");
		songs.add(song15);
		Song song16 = new Song("Me Dedique A Perderte","Alejandro Fernández", format.parse("8-03-2010"), 263, "Ranchera", "MeDediqueAPerderte.png", "mala mia");
		songs.add(song16);
		Song song17 = new Song("Niégame Tres Veces","Silvestre Dangond", format.parse("22-04-2015"), 328, "Vallenato", "NiégameTresVeces.png", "Niégame Tres Veces");
		songs.add(song17);
		Song song18 = new Song("La Gloria de Dios","Ricardo Montaner", format.parse("19-11-2012"), 282, "Bachata", "LaGloriadeDios.png", "La Gloria de Dios");
		songs.add(song18);
		Song song19 = new Song("Mi Verdad","Maná", format.parse("9-02-2015"), 330, "Pop", "MiVerdad.png", "Mi Verdad");
		songs.add(song19);
		Song song20 = new Song("Fabricando Fantasias","Tito Nieves", format.parse("9-02-2012"), 267, "Salsa", "FabricandoFantasias.png", "Fabricando Fantasias");
		songs.add(song20);
		Song song21 = new Song("Una y Otra Vez","Manuel Medrano", format.parse("1-04-2016"), 184, "Salsa", "UnayOtraVez.png", "Una y Otra Vez");
		songs.add(song21);
		Song song22 = new Song("Que Me Alcance La Vida","Sin Bandera", format.parse("3-10-2009"), 150, "Pop", "QueMeAlcanceLaVida.png", "Que Me Alcance La Vida");
		songs.add(song22);
		Song song23 = new Song("Materialista","Silvestre Dangond & Nicky Jam", format.parse("24-09-2015"), 191, "Vallenato", "Materialista.png", "Materialista");
		songs.add(song23);
		Song song24 = new Song("Tan Natural","Felipe Peláez", format.parse("8-06-2013"), 218, "Vallento", "TanNatural.png", "Tan Natural");
		songs.add(song24);
		Song song25 = new Song("Tal Para Cual","Joe Arroyo", format.parse("2-07-1995"), 302, "Salsa", "TalParaCual.png", "Tal Para Cual");
		songs.add(song25);
		Song song26 = new Song("En Fukuoka","Juan Luis Guerra", format.parse("16-04-2010"), 301, "Salsa", "EnFukuoka.png", "En Fukuoka");
		songs.add(song26);
		Song song27 = new Song("El Amor Más Grande Del Planeta","Felipe Peláez", format.parse("21-04-2009"), 257, "Vallenato", "ElAmorMásGrandeDelPlaneta.png", "El Amor Más Grande Del Planeta");
		songs.add(song27);
		Song song28 = new Song("Ecos de amor","Jesse y Joy", format.parse("10-09-2015"), 246, "Jazz", "Ecos de amor.png", "Ecos de amor");
		songs.add(song28);
		Song song29 = new Song("No Quererte","Maía", format.parse("17-04-2012"), 307, "Pop", "NoQuererte.png", "No Quererte");
		songs.add(song29);
		Song song30 = new Song("De la Mano","Lucas Arnau", format.parse("19-06-2012"), 180, "Hip Hop", "DelaMano.png", "De la Mano");
		songs.add(song30);
		Song song31 = new Song("La Espeluca","Twister El Rey Ft. Mr Steve", format.parse("1-10-2014"), 178, "Hip Hop", "LaEspeluca.png", "La Espeluca");
		songs.add(song31);
		Song song32 = new Song("Vente Negra","La Nova Tradicional", format.parse("17-06-2010"), 218, "Salsa", "VenteNegra.png", "Vente Negra");
		songs.add(song32);
		Song song33 = new Song("La Leyenda","Yandel", format.parse("2-10-2015"), 222, "Pop", "LaLeyenda.png", "La Leyenda");
		songs.add(song33);
		Song song34 = new Song("No pude quitarte las espinas","Erick Escobar", format.parse("22-08-2018"), 258, "Ranchera", "Nopudequitartelasespinas.png", "No pude quitarte las espinas");
		songs.add(song34);
		Song song35 = new Song("para que se quiere tanto","julio jaramillo", format.parse("31-03-2012"), 246, "Salsa", "paraquesequieretanto.png", "para que se quiere tanto");
		songs.add(song35);
		Song song36 = new Song("Aquel Viejo Motel","Eddie Santiago", format.parse("8-12-2016"), 307, "Salsa", "AquelViejoMotel.png", "Aquel Viejo Motel");
		songs.add(song36);
		Song song37 = new Song("Me Resbala","Integración Casanova", format.parse("24-12-2016"), 180, "Salsa", "MeResbala.png", "Me Resbala");
		songs.add(song37);
		Song song38 = new Song("Matemos Las Ganas","Jessi Uribe", format.parse("6-10-2016"), 178, "Ranchera", "MatemosLasGanas.png", "Matemos Las Ganas");
		songs.add(song38);
		Song song39 = new Song("Justicia","Silvestre Dangond, Natti Natasha", format.parse("13-07-2018"), 218, "Vallenato", "Justicia.png", "Justicia");
		songs.add(song39);
		Song song40 = new Song("Llévame","Espinoza Paz", format.parse("19-05-2017"), 220, "Jazz", "Llévame.png", "Llévame");
		songs.add(song40);
		Song song41 = new Song("Repitela","Jessi Uribe", format.parse("23-02-2017"), 190, "Ranchera", "Repitela.png", "Repitela");
		songs.add(song41);
		Song song42 = new Song("Dulce Pecado","Jessi Uribe", format.parse("11-08-2017"), 208, "Ranchera", "DulcePecado.png", "Dulce Pecado");
		songs.add(song42);
		Song song43 = new Song("Amor Verdadero","ALZATE", format.parse("20-01-2014"), 193, "Ranchera", "AmorVerdadero.png", "Amor Verdadero");
		songs.add(song43);
                
		return songs;

		
	}

}
