package adapter;

import adapter.inter.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("playing vlc file.Name"+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		//null
	}

}
