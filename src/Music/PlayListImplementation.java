package Music;

import java.util.ArrayList;

public class PlayListImplementation implements IPlayList {

	@Override
	public void orderDuration(ArrayList<Song> song) {
		// TODO Auto-generated method stub

	}

	@Override
	public void orderDate(ArrayList<Song> song) {
		// TODO Auto-generated method stub

	}

	@Override
	public void filterGenre(String genre) {
		// TODO Auto-generated method stub

	}

	@Override
	public void filterYear(String year) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showPlayList(ArrayList<Song> playList) {
		for(int i = 0; i < playList.size(); i++) {
            System.out.println(i+1+ "-" +playList.get(i).getTitle());
            
        }

	}

}
