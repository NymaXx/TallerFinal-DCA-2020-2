package view;

import java.util.ArrayList;

import model.BluePoint;
import model.Plataform;
import processing.core.PApplet;
import processing.core.PImage;

public class GameScreen implements Runnable {

	private PImage gameS, t;
	private PApplet app;
	private int posX;
	private int speed;
	private Plataform [] plat;
	private ArrayList<BluePoint> point;

	
	
	public GameScreen(int posX, PApplet app){
	
		this.posX=posX;
		this.app=app;
		this.speed=3;
		this.gameS = app.loadImage("../images/PlantillaTOTALGAME.png"); 
		this.t= app.loadImage("../images/TEXTS.png");
		this.plat = new Plataform[88];
		
		/*iniciar plataformas porque no se como iniciarlas de otra manera */
		plat[0] = new Plataform(0,118,207,29,app);
		plat[1] = new Plataform(-55,283,207,29,app);
		plat[2] = new Plataform(-132,470,207,29,app);
		plat[3] = new Plataform(330,118,207,29,app);
		plat[4] = new Plataform(615,118,207,29,app);
		plat[5] = new Plataform(967,118,207,29,app);
		plat[6] = new Plataform(1413,118,207,29,app);
		plat[7] = new Plataform(1815,118,207,29,app);
		plat[8] = new Plataform(2022,118,207,29,app);
		plat[9] = new Plataform(2724,118,207,29,app);
		plat[10] = new Plataform(2931,118,207,29,app);
		plat[11] = new Plataform(3138,118,207,29,app);
		plat[12] = new Plataform(3536,118,103,29,app);
		plat[13] = new Plataform(172,191,207,29,app);
		plat[14] = new Plataform(379,191,207,29,app); 
		plat[15] = new Plataform(586,191,207,29,app);
		plat[16] = new Plataform(793,191,207,29,app);
		plat[17] = new Plataform(1154,191,207,29,app);
		plat[18] = new Plataform(1445,191,207,29,app);
		plat[19] = new Plataform(1652,191,207,29,app);
		plat[20] = new Plataform(2043,191,207,29,app);
		plat[21] = new Plataform(2379,191,207,29,app);
		plat[22] = new Plataform(2657,191,207,29,app);
		plat[23] = new Plataform(3147,191,207,29,app);
		plat[24] = new Plataform(3457,191,207,29,app);
		plat[25] = new Plataform(223,283,207,29,app);
		plat[26] = new Plataform(573,283,207,29,app);
		plat[27] = new Plataform(780,283,207,29,app);
		plat[28] = new Plataform(1120,283,207,29,app);
		plat[29] = new Plataform(1442,283,207,29,app);
		plat[30] = new Plataform(1649,283,207,29,app);
		plat[31] = new Plataform(1917,283,207,29,app);
		plat[32] = new Plataform(2186,283,207,29,app);
		plat[33] = new Plataform(2393,283,207,29,app);
		plat[34] = new Plataform(2872,283,207,29,app);
		plat[35] = new Plataform(3079,283,207,29,app);
		plat[36] = new Plataform(3286,283,207,29,app);
		plat[37] = new Plataform(132,370,207,29,app);
		plat[38] = new Plataform(463,370,207,29,app);
		plat[39] = new Plataform(670,370,207,29,app);
		plat[40] = new Plataform(877,370,207,29,app);
		plat[41] = new Plataform(1084,370,207,29,app);
		plat[42] = new Plataform(1533,370,207,29,app);
		plat[43] = new Plataform(1740,370,207,29,app);
		plat[44] = new Plataform(1947,370,207,29,app);
		plat[45] = new Plataform(2413,370,207,29,app);
		plat[46] = new Plataform(2620,370,207,29,app);
		plat[47] = new Plataform(2884,370,207,29,app);
		plat[48] = new Plataform(3166,370,207,29,app);
		plat[49] = new Plataform(3373,370,207,29,app);
		plat[50] = new Plataform(-110,467,207,29,app);
		plat[51] = new Plataform(181,467,207,29,app);
		plat[52] = new Plataform(426,467,207,29,app);
		plat[53] = new Plataform(794,467,207,29,app);
		plat[54] = new Plataform(1095,467,207,29,app);
		plat[55] = new Plataform(1358,467,207,29,app);
		plat[56] = new Plataform(1660,467,207,29,app);
		plat[57] = new Plataform(2145,467,207,29,app);
		plat[58] = new Plataform(2426,467,207,29,app);
		plat[59] = new Plataform(2754,467,207,29,app);
		plat[60] = new Plataform(3154,467,207,29,app);
		plat[61] = new Plataform(3361,467,207,29,app);
		plat[62] = new Plataform(3620,467,207,29,app);
		plat[63] = new Plataform(608,561,207,29,app);
		plat[64] = new Plataform(815,561,207,29,app);
		plat[65] = new Plataform(1022,561,207,29,app);
		plat[66] = new Plataform(1229,561,207,29,app);
		plat[67] = new Plataform(1675,561,207,29,app);
		plat[68] = new Plataform(1882,561,207,29,app);
		plat[69] = new Plataform(2089,561,207,29,app);
		plat[70] = new Plataform(2787,561,207,29,app);
		plat[71] = new Plataform(2994,561,207,29,app);
		plat[72] = new Plataform(3321,561,207,29,app);
		plat[73] = new Plataform(0,651,207,29,app);
		plat[74] = new Plataform(207,651,207,29,app);
		plat[75] = new Plataform(414,651,207,29,app);
		plat[76] = new Plataform(621,651,207,29,app);
		plat[77] = new Plataform(828,651,207,29,app);
		plat[78] = new Plataform(1046,651,207,29,app);
		plat[79] = new Plataform(1284,651,207,29,app);
		plat[80] = new Plataform(1491,651,207,29,app);
		plat[81] = new Plataform(1698,651,207,29,app);
		plat[82] = new Plataform(1905,651,207,29,app);
		plat[83] = new Plataform(2112,651,207,29,app);
		plat[84] = new Plataform(2634,651,207,29,app);
		plat[85] = new Plataform(2841,651,207,29,app);
		plat[86] = new Plataform(3048,651,207,29,app);
		plat[87] = new Plataform(3255,651,207,29,app);
		
		
		this.point = new ArrayList<BluePoint>();
		
		for(int i=0; i < 60; i++) {
			BluePoint po = new BluePoint((int) app.random(0,3500),(int) app.random(0,650), 3,app);
			point.add(po);
		}
	}
	
	
	public void paint() {
		app.image(this.t, 0,0);
		//app.image(this.gameS,this.posX,0);
		for(int i=0; i < plat.length; i++) {
			Plataform p=plat[i];
			p.paint();
		}
		
		for(int i=0; i < point.size(); i++) {
			BluePoint po =point.get(i);
			po.paint();
		}
		
	}
		
		
		
	
	
	@Override
	public void run() {
		this.posX+=this.speed;
	}
	
	public void moveToleft() {
		this.posX-=this.speed;
	}


	public PImage getGameS() {
		return gameS;
	}


	public void setGameS(PImage gameS) {
		this.gameS = gameS;
	}


	public PImage getT() {
		return t;
	}


	public void setT(PImage t) {
		this.t = t;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public Plataform[] getPlat() {
		return plat;
	}


	public void setPlat(Plataform[] plat) {
		this.plat = plat;
	}


	public ArrayList<BluePoint> getPoint() {
		return point;
	}


	public void setPoint(ArrayList<BluePoint> point) {
		this.point = point;
	}
	
	
	

}
