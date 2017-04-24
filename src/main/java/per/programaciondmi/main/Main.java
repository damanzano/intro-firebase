package per.programaciondmi.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("per.programaciondmi.main.Main");
	}
	
	public void settings(){
		size(500,500);
	}
	
	public void setup(){
		FirebaseOptions options;
		try {
			options = new FirebaseOptions.Builder()
					  .setServiceAccount(new FileInputStream("src/main/resources/intro-redes-20171-7e9debe31945.json"))
					  .setDatabaseUrl("https://intro-redes-20171.firebaseio.com/")
					  .build();
			FirebaseApp.initializeApp(options);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public void draw(){
		background(255);
		fill(255,0,0);
		ellipse(width/2,height/2, 50,50);
	}

}
