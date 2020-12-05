package view;
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
		StartScreen st;
		
		public void settings() {
			size(1250,680);
		}
		
		
		public void setup() {
		img = loadImage("../images/PlantillaTOTALGAME.png");
		screen=0;
		game= new GameScreen(0, 0, this);
		new Thread(game).start();
		
		st = new StartScreen(this);
		}
		
		
		public void draw() {
			background(0);
			
			// game.paint();
		
			
			 
			
			textSize(20);
			fill(255);
			text("X"+ mouseX + "Y" + mouseY, mouseX, mouseY);
			
			
			
			
			switch(screen) {
			case 0:
				st.paint();
				
				break;
				
			case 1:
				game.paint();
				break;
				
			case 2:
				
				ellipse(50,50,50,50);
				break;
				
			
			
			}
			
		}
		
		public void mousePressed() {
			switch(screen) {
			case 0:
				if(st.changeScreen()==1) {
					screen=1;
					
					st.hide();
				}
				
				if(st.changeScreen()==2) {
					screen=2;
					
					st.hide();
				}
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
