package com.yedam.homework;

public class NotebookTablet {

	public static void main(String[] args) {
		PortableNotbook notetablet = new PortableNotbook();
		
//		Tablet tb = notetablet;
//		Notebook nb = notetablet;
		
		notetablet.writeDcm = "한글2020";
		notetablet.internetB = "크롬";
		notetablet.videoType = "영화";
		notetablet.appType = "안드로이드앱";
		
		
		notetablet.writeDocumentaion();
		notetablet.watchVideo();
		notetablet.changMode();
		notetablet.useApp();
		notetablet.searchInternet();
		
		

	}

}
