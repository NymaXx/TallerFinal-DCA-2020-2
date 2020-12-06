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
		ResumeScreen res;
		
		public void settings() {
			size(1250,680);
		}
		
		
		public void setup() {
		img = loadImage("../images/PlantillaTOTALGAME.png");
		screen=0;
		
		/* screen:
		 * 0 = Start-Login Screen
		 * 1 = Game screen
		 * 2 = instructions Screen
		 * 3 = Resume Screen
		 */
		
		game= new GameScreen(0, 0, this);
		new Thread(game).start();
		st = new StartScreen(this);
		res= new ResumeScreen(this);
		}
		
		
		public void draw() {
			background(0);
			st.getCp5().hide();
			// game.paint();
			
		switch(screen) {
			case 0:
				
				st.getCp5().show();
				st.paint();
				
				break;
				
			case 1:
				
				game.paint();
				
				
				break;
				
			case 2: 
				ellipse(50,50,50,50);
				break;
				
			case 3:
				
				res.paint();
				
				
				break;
			}
		
		
			
			textSize(20);
			fill(255);
			text("X"+ mouseX + "Y" + mouseY, mouseX, mouseY);
			
		}
		
		public void mousePressed() {
			switch(screen) {
			case 0:
				if(st.changeScreen()==1) {
					screen=1;
				}
				
				if(st.changeScreen()==2) {
					screen=2;	
				}
				
				break;
				
			case 2:
				break;
				
			case 3:
				if(res.changeScreen()==0) {
					screen=0;
				}
				break;
			
			
			}
		}
		
		public void keyPressed() {
			
		}
	}
