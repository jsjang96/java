package oop1;

public class MusicPlayerMain3 {
//절차 지향 프로그래밍
	public static void main(String[] args) {
		MusicPlayer musicplayer = new MusicPlayer();
		musicplayer.showStatus();
		
		//음악 플레이어 켜기
		musicplayer.on();
		//볼륨 증가
		musicplayer.volumeUp();
		//볼륨 증가
		musicplayer.volumeUp();
		//볼륨 증가
		musicplayer.volumeUp();
		//볼륨 감소
		musicplayer.volumeDown();
		//음악 플레이어 상태
		musicplayer.showStatus();
		//음악 플레이어 종료
		musicplayer.off();
	}
}
