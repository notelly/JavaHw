package com.yedam.homework;

public class PortableNotbook implements Notebook, Tablet {
	//필드
	int MODE = NOTEBOOK_MODE;
	String writeDcm;
	String internetB;
	String videoType;
	String appType;
	
	//생성자
	public PortableNotbook() {
		
	}
	
	//메소드
	@Override
	public void watchVideo() {
		System.out.println(videoType +"를 시청");
	}

	@Override
	public void useApp() {
		if (MODE == TABLET_MODE) {
			System.out.println(appType +"을 실행");
		}else if(MODE == NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
			System.out.println(appType + "을 실행");
		}
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(writeDcm +"을 통해 문서를 작성.");

	}

	@Override
	public void searchInternet() {
		System.out.println(internetB+ "를 통해 인터넷을 검색");
		
	}

	public void changMode() {
		if (MODE == TABLET_MODE) {
			MODE = NOTEBOOK_MODE;
			System.out.println(MODE);
		}else if(MODE == NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
			System.out.println(MODE);
		}
		
	}
	
}
