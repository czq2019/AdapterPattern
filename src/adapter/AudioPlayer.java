package adapter;

import adapter.inter.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String fileName) {
		// 播放mp3音乐文件
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: "+ fileName);
		}
		//MediaPlayer提供播放其他文件支持
		else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter=new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else {
			System.out.println("Invalid media. "+
		            audioType + " format not supported");
		}
	}
	

}
