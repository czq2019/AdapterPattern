package adapter;

import adapter.inter.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		//ʲôҲ����
	}
	@Override
	public void playMp4(String fileName) {
		System.out.println("playing Mp4 file.Name"+fileName);
	}

}
