package Practice;

public class Song {
	String title,artist,country,year;
	
	Song(){}
	
	Song(String title,String artist,String year,String country){
		this.title = title; this.artist = artist; this.year = year; this.country = country;
	}
	
	void show(){
		System.out.printf("%s년 %s국적의 %s가 부른 %s",year,country,artist,title);
	}

}
