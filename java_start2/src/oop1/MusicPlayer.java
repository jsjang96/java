package oop1;

public class MusicPlayer {
	int volume = 0;
	boolean isOn = false;
	
	
	void on() {
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}
	
	void off() {
		isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");
	}
	
	void volumeUp() {
		volume++;
		System.out.println("볼륨을 높입니다. 현재 볼륨: " + volume);
	}
	
	void volumeDown() {
		volume--;
		System.out.println("볼륨을 낮춥니다. 현재 볼륨: " + volume);
	}
	
	void showStatus() {
		if(isOn = true) {
			System.out.println("현재 음악플레이어가 실행 중입니다. 음량은 " + volume + "입니다.");
		}
		else {
			System.out.println("현재 음악플레이어가 실행 중이 아닙니다.");
			}
	 	}
	}
