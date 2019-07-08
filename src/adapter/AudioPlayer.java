package adapter;

import adapter.inter.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String fileName) {
		// ����mp3�����ļ�
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: "+ fileName);
		}
		//MediaPlayer�ṩ���������ļ�֧��
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
