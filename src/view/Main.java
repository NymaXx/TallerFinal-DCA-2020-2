package view;


import processing.core.PApplet;
import processing.core.PImage;

	public class Main extends PApplet{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PApplet.main(Main.class.getName());
			
			
		}
		
		int screen;
		
		public void settings() {
			size(1250,680);
		}
		
		
		public void setup() {
		screen=0;
		}
		
		
		public void draw() {
			background(0);
			
			
			textSize(20);
			fill(255);
			text("X"+ mouseX + "Y" + mouseY, mouseX, mouseY);
			
			
			
			
			switch(screen) {
			case 0:
				
				break;
				
			case 1:
				break;
				
			case 2:
				break;
				
			
			
			}
			
		}
		
		public void keyPressed() {
			
		}
	}
