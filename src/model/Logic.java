package model;

import java.util.ArrayList;

import processing.core.PApplet;
import view.GameScreen;
import view.InstScreen;
import view.ResumeScreen;
import view.StartScreen;

public class Logic implements Runnable{

	private Charac c;
	private Plataform [] p;
	private ArrayList<Enemy> e;
	private ArrayList<BluePoint> b;
	private StartScreen ss;
	private ResumeScreen rs;
	private GameScreen gs;
	private InstScreen is;
	private PApplet app;
	public int screen;
	
	
	public Logic(PApplet app) {
		 screen=0;
		 this.app=app;
		 c = new Charac(0, app.height-86, 6,10, 54,60, app);
		 gs = new GameScreen(0, app);
		 	new Thread(gs).start();
		 ss = new StartScreen(app);
		 rs = new ResumeScreen(app);
		 is = new InstScreen(app);
	
		 b = new ArrayList<BluePoint>();
			//inicializar puntos aleatorios
			for(int i=0; i < 60; i++) {
				BluePoint po = new BluePoint((int) app.random(60,3500),(int) app.random(50,610), 3,app);
				b.add(po);
			}
			
		e = new ArrayList<Enemy>();
			//inicializar enemigos aleatorios
			for(int i=0; i < 60; i++) {
				Enemy en = new Enemy((int) app.random(60,3500),(int) app.random(50,610), 30 , 30,app);
				e.add(en);
				new Thread(en).start();
			}
			
		 p = new Plataform[88];
		 	//inicializado manual de las paltaformas
		 	p[0] = new Plataform(0,118,207,29,app);
			p[1] = new Plataform(-55,283,207,29,app);
			p[2] = new Plataform(-132,470,207,29,app);
			p[3] = new Plataform(330,118,207,29,app);
			p[4] = new Plataform(615,118,207,29,app);
			p[5] = new Plataform(967,118,207,29,app);
			p[6] = new Plataform(1413,118,207,29,app);
			p[7] = new Plataform(1815,118,207,29,app);
			p[8] = new Plataform(2022,118,207,29,app);
			p[9] = new Plataform(2724,118,207,29,app);
			p[10] = new Plataform(2931,118,207,29,app);
			p[11] = new Plataform(3138,118,207,29,app);
			p[12] = new Plataform(3536,118,103,29,app);
			p[13] = new Plataform(172,191,207,29,app);
			p[14] = new Plataform(379,191,207,29,app); 
			p[15] = new Plataform(586,191,207,29,app);
			p[16] = new Plataform(793,191,207,29,app);
			p[17] = new Plataform(1154,191,207,29,app);
			p[18] = new Plataform(1445,191,207,29,app);
			p[19] = new Plataform(1652,191,207,29,app);
			p[20] = new Plataform(2043,191,207,29,app);
			p[21] = new Plataform(2379,191,207,29,app);
			p[22] = new Plataform(2657,191,207,29,app);
			p[23] = new Plataform(3147,191,207,29,app);
			p[24] = new Plataform(3457,191,207,29,app);
			p[25] = new Plataform(223,283,207,29,app);
			p[26] = new Plataform(573,283,207,29,app);
			p[27] = new Plataform(780,283,207,29,app);
			p[28] = new Plataform(1120,283,207,29,app);
			p[29] = new Plataform(1442,283,207,29,app);
			p[30] = new Plataform(1649,283,207,29,app);
			p[31] = new Plataform(1917,283,207,29,app);
			p[32] = new Plataform(2186,283,207,29,app);
			p[33] = new Plataform(2393,283,207,29,app);
			p[34] = new Plataform(2872,283,207,29,app);
			p[35] = new Plataform(3079,283,207,29,app);
			p[36] = new Plataform(3286,283,207,29,app);
			p[37] = new Plataform(132,370,207,29,app);
			p[38] = new Plataform(463,370,207,29,app);
			p[39] = new Plataform(670,370,207,29,app);
			p[40] = new Plataform(877,370,207,29,app);
			p[41] = new Plataform(1084,370,207,29,app);
			p[42] = new Plataform(1533,370,207,29,app);
			p[43] = new Plataform(1740,370,207,29,app);
			p[44] = new Plataform(1947,370,207,29,app);
			p[45] = new Plataform(2413,370,207,29,app);
			p[46] = new Plataform(2620,370,207,29,app);
			p[47] = new Plataform(2884,370,207,29,app);
			p[48] = new Plataform(3166,370,207,29,app);
			p[49] = new Plataform(3373,370,207,29,app);
			p[50] = new Plataform(-110,467,207,29,app);
			p[51] = new Plataform(181,467,207,29,app);
			p[52] = new Plataform(426,467,207,29,app);
			p[53] = new Plataform(794,467,207,29,app);
			p[54] = new Plataform(1095,467,207,29,app);
			p[55] = new Plataform(1358,467,207,29,app);
			p[56] = new Plataform(1660,467,207,29,app);
			p[57] = new Plataform(2145,467,207,29,app);
			p[58] = new Plataform(2426,467,207,29,app);
			p[59] = new Plataform(2754,467,207,29,app);
			p[60] = new Plataform(3154,467,207,29,app);
			p[61] = new Plataform(3361,467,207,29,app);
			p[62] = new Plataform(3620,467,207,29,app);
			p[63] = new Plataform(608,561,207,29,app);
			p[64] = new Plataform(815,561,207,29,app);
			p[65] = new Plataform(1022,561,207,29,app);
			p[66] = new Plataform(1229,561,207,29,app);
			p[67] = new Plataform(1675,561,207,29,app);
			p[68] = new Plataform(1882,561,207,29,app);
			p[69] = new Plataform(2089,561,207,29,app);
			p[70] = new Plataform(2787,561,207,29,app);
			p[71] = new Plataform(2994,561,207,29,app);
			p[72] = new Plataform(3321,561,207,29,app);
			p[73] = new Plataform(0,651,207,29,app);
			p[74] = new Plataform(207,651,207,29,app);
			p[75] = new Plataform(414,651,207,29,app);
			p[76] = new Plataform(621,651,207,29,app);
			p[77] = new Plataform(828,651,207,29,app);
			p[78] = new Plataform(1046,651,207,29,app);
			p[79] = new Plataform(1284,651,207,29,app);
			p[80] = new Plataform(1491,651,207,29,app);
			p[81] = new Plataform(1698,651,207,29,app);
			p[82] = new Plataform(1905,651,207,29,app);
			p[83] = new Plataform(2112,651,207,29,app);
			p[84] = new Plataform(2634,651,207,29,app);
			p[85] = new Plataform(2841,651,207,29,app);
			p[86] = new Plataform(3048,651,207,29,app);
			p[87] = new Plataform(3255,651,207,29,app);
		 
	}
	
	
	public void paint() {
		
		for(int i=0; i < p.length; i++) {
			Plataform pl= p[i];
			pl.paint();
		}
		
		for(int i=0; i < b.size(); i++) {
			BluePoint bl =b.get(i);
			bl.paint();
		}
		
		for(int i=0; i < e.size(); i++) {
			Enemy en =e.get(i);
			en.paint();
			new Thread(en).start();
			//en.RandomMove();
		}
	}
	
	public int paintScreen() {
		ss.getCp5().hide();
		
		switch(screen) {
		case 0:
			
			ss.getCp5().show();
			ss.paint();
			break;
			
		case 1:
			
			gs.paint();
			c.paint();
			paint();
			break;
			
		case 2: 
			is.paint();
			break;
			
		case 3:
			rs.paint();
			break;
		}
		
		return screen;
	}
	
	
	@Override
	public void run() { //para los movimientos de todo
		
			for(int a =0; a < p.length; a++) {
				//if(x1 > x2+w2 || x1+w1 < x2 || y1 > y2+h2 || y1+h1 < y2) {
					
				//}
			}
		
		
		
	}
	
	public int  changeScreen() {
		
		switch(screen) {
		case 0:
			if(ss.changeScreen()==1) {
				screen=1;
			}
			
			if(ss.changeScreen()==2) {
				screen=2;	
			}
			
			break;
			
		case 2:
			if(is.changeScreen()==1) {
				screen=1;
			}
			
			break;
			
		case 3:
			if(rs.changeScreen()==0) {
				screen=0;
			}
			break;
		
		
		}
		return screen;
	}

}
