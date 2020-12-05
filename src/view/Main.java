package view;


import model.GameScreen;
import processing.core.PApplet;
import processing.core.PImage;

	public class Main extends PApplet{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PApplet.main(Main.class.getName());
			
			
		}
		
		GameScreen game;
		PImage img;
		int screen;
		PImage plantilla;
		
		public void settings() {
			size(1250,680);
		}
		
		
		public void setup() {
		img = loadImage("../images/PlantillaTOTALGAME.png");
		screen=0;
		game= new GameScreen(0, 0, this);
		new Thread(game).start();
		}
		
		
		public void draw() {
			background(0);
			//image(img,-2800,0);
			 game.paint();
			
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
