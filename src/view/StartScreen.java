package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PImage;

public class StartScreen {

	private String name;
	private String date;
	private String[] inputs;
	private ControlP5 cp5;
	private PApplet app;
	private PImage start;
	
	
	public StartScreen(PApplet app){
		this.app=app;
		
		this.start= app.loadImage("../images/inicio-20.jpg");
		
		cp5 = new ControlP5(app);
		inputs = new String[2];
		
		initializeTextFields();
	}
	
	
	public void paint() {
		
		app.image(this.start,0,0);
	}
	
	private void initializeTextFields() {
		inputs[0] = "Name";
		inputs[1] = "Date";

		cp5.addTextfield(inputs[0]).setPosition(300,290).setSize(651, 49).setAutoClear(true).setColorValue(app.color(171,0,78))
		.setColorActive(app.color(255)).setColorBackground(app.color(171,0,78)).setColorForeground(app.color(0,0,0,1))
		.setColor(app.color(0)).setColorCursor(app.color(171,0,78));
		
		cp5.addTextfield(inputs[1]).setPosition(300,367).setSize(651, 49).setAutoClear(true).setColorValue(app.color(171,0,78))
		.setColorActive(app.color(255)).setColorBackground(app.color(171,0,78)).setColorForeground(app.color(0,0,0,1))
		.setColor(app.color(0)).setColorCursor(app.color(171,0,78));
	}
	
	public void hide() {
		cp5.hide();
		
	}
	
	
	public void registerUser() {
		name=cp5.get(Textfield.class, "Name").getText();
		date=cp5.get(Textfield.class, "Date").getText();
		
	}
	
	
	public void clearTextFields() {
		cp5.get(Textfield.class, "Name").setText("");
		cp5.get(Textfield.class, "Date").setText("");
	}
	
	
	public int changeScreen() {
		int screen=0;
		
		if(app.mouseX>508 && app.mouseX<741 &&app.mouseY>550 && app.mouseY<598) {
			screen=1;
			//registerUser();
			;
		}
		
		if(app.mouseX>447 && app.mouseX<803 &&app.mouseY>474 && app.mouseY<527) {
			screen=2;	
			//registerUser();
		}
		
		return screen;
	}
	
	
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String[] getInputs() {
		return inputs;
	}


	public void setInputs(String[] inputs) {
		this.inputs = inputs;
	}


	public ControlP5 getCp5() {
		return cp5;
	}


	public void setCp5(ControlP5 cp5) {
		this.cp5 = cp5;
	}


	
	

}
