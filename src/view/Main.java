package view;
import model.Charac;
import model.Logic;
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
		 Charac c;
		 InstScreen in;
		 Logic l;
		
		public void settings() {
			size(1250,680);
		}
		
		
		public void setup() {
		img = loadImage("../images/PlantillaTOTALGAME.png");
		screen=0;
		l = new Logic(this);
		
		/* screen:
		 * 0 = Start-Login Screen
		 * 1 = Game screen
		 * 2 = instructions Screen
		 * 3 = Resume Screen
		 */
		st = new StartScreen(this);
		}
		
		
		public void draw() {
			background(0);
			
			if(screen != 0) {
				st.getCp5().hide();
				}
			
			l.paintScreen();
			
			

			textSize(20);
			fill(255);
			text("X"+ mouseX + "Y" + mouseY, mouseX, mouseY);
			
		}
		
		
		public void mousePressed() {

			switch(screen) {
			case 0:
				if(l.changeScreen()==1) {
					screen=1;
				}
				
				if(l.changeScreen()==2) {
					screen=2;	
				}
				break;
				
			case 2:
				if(l.changeScreen()==1) {
					screen=1;
				}
				break;
				
			case 3:
				if(l.changeScreen()==0) {
					screen=0;
				}
				break;
			}
		}
		
		
		
		public void keyPressed() {
			
			if(screen ==1) {
				new Thread(c).start();
			}
		}
	}
