package model;

import processing.core.PApplet;

public class User {
	
	private String n;
	private String d;
	private String p;
	private String t;
	private PApplet app;
	
	
	public User(String n, String d, String p, String t, PApplet app) {
		this.n=n;
		this.d=d;
		this.p=p;
		this.t=t;
		this.app=app;
		
	}


	public String getN() {
		return n;
	}


	public void setN(String n) {
		this.n = n;
	}


	public String getD() {
		return d;
	}


	public void setD(String d) {
		this.d = d;
	}


	public String getP() {
		return p;
	}


	public void setP(String p) {
		this.p = p;
	}


	public String getT() {
		return t;
	}


	public void setT(String t) {
		this.t = t;
	}
	
	

}
