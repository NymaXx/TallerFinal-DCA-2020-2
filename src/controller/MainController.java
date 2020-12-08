package controller;

import processing.core.PApplet;
import view.StartScreen;

public class MainController {
	
	private PApplet app;
	private StartScreen st;
	private String name;
	private String date;
	
	public MainController(PApplet app) {
		this.app=app;
		this.st = new StartScreen(app);
		this.name=name;
		this.date=date;
	}
	
	public void registerUser() {
		this.name=st.getName();
		this.date=st.getDate();
	}

	public StartScreen getSt() {
		return st;
	}

	public void setSt(StartScreen st) {
		this.st = st;
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
	
	

}
