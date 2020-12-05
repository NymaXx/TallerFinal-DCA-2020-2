package view;


import processing.core.PApplet;
import processing.core.PImage;

	public class Main extends PApplet{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PApplet.main(Main.class.getName());
			
			
		}
		
		PImage fondo;
		
		public void settings() {
			size(1250,680);
			
			
		}
		
		
		public void setup() {
			
		
			
		}
		
		
		public void draw() {
			background(0);
			image(fondo,0,0,1250,680);
			
		}
		
		public void keyPressed() {
			
		}
	}
