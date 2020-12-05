package view;


import processing.core.PApplet;
import processing.core.PImage;

	public class Main extends PApplet{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PApplet.main(Main.class.getName());
			
			
		}
		
		PImage img;
		
		public void settings() {
			size(1250,680);
		}
		
		
		public void setup() {
		img = loadImage("../images/Recurso 2-20.jpg");
		}
		
		
		public void draw() {
			background(0);
			image(img,0,0);
			
		}
		
		public void keyPressed() {
			
		}
	}
