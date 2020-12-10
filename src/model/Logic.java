package model;

import java.util.ArrayList;

import controller.MainController;
import exception.defeatException;
import exception.victoryException;
import processing.core.PApplet;
import processing.core.PImage;
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
	private MainController mc;
	private ArrayList<User> u;
	private PApplet app;
	public int screen;
	private int timeCounter;
	private int pointCounter;
	private boolean isCollide;
	private boolean isCollidePoint;
	private boolean isCollideEnem;
	private boolean isMove=false;
	
	
	public Logic(PApplet app) {
		this.isCollide=false;
		this.isCollidePoint=false;
		this.isCollideEnem=false;
		 screen=0;
		 this.timeCounter=30;
		 this.pointCounter=0;
		 this.app=app;
		 c = new Charac(0, 200, 14,14, 24,30, app);
		 gs = new GameScreen(0, app);
		 	  new Thread(gs).start();
		 ss = new StartScreen(app);
		 rs = new ResumeScreen(app);
		 is = new InstScreen(app);
		// mc = new MainController(app);
	
		 b = new ArrayList<BluePoint>();
			//inicializar puntos aleatorios
			for(int i=0; i < 50; i++) {
				BluePoint po = new BluePoint((int) app.random(60,3500),(int) app.random(50,610), 57,63,app);
				b.add(po);
			}
			
		e = new ArrayList<Enemy>();
			//inicializar enemigos aleatorios
			for(int i=0; i < 40; i++) {
				Enemy en = new Enemy((int) app.random(60,3500),(int) app.random(50,610), 30 , 30,app);
				e.add(en);
				//new Thread(e.get(i)).start();
			}	
			
		u = new ArrayList<User>();
			//arrayLisr de Usuarios
			for(int i=0; i < 7; i++ ) {
				User us= new User(ss.getName(), ss.getDate(),String.valueOf(this.pointCounter) , String.valueOf(this.timeCounter), app);
				u.add(us);
			}
		
			
		 p = new Plataform[88];
		 	//inicializado manual de las paltaformas
		 	p[0] = new Plataform(0,118,207,29,app);
			p[1] = new Plataform(-55,283,207,29,app);
			p[2] = new Plataform(-132,470,207,29,app);
			p[3] = new Plataform(330,120,207,29,app);
			p[4] = new Plataform(615,120,207,29,app);
			p[5] = new Plataform(967,120,207,29,app);
			p[6] = new Plataform(1413,120,207,29,app);
			p[7] = new Plataform(1815,120,207,29,app);
			p[8] = new Plataform(2022,120,207,29,app);
			p[9] = new Plataform(2724,120,207,29,app);
			p[10] = new Plataform(2931,120,207,29,app);
			p[11] = new Plataform(3138,120,207,29,app);
			p[12] = new Plataform(3536,120,103,29,app);
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
	
	
	public void paintElements() {
		
		for(int i=0; i < p.length; i++) {
			p[i].paint();
		}
		
		for(int i=0; i < b.size(); i++) {
			b.get(i).paint();
		}
		
		for(int i=0; i < e.size(); i++) {
			e.get(i).paint();
			new Thread(e.get(i)).start();
		}
	}
	
	
	public int paintScreen() {
		ss.getCp5().hide();
		
		switch(screen) {
		case 0:
			
			ss.getCp5().show();
			ss.paint();
			ss.registerUser();
			break;
			
		case 1:
			new Thread(gs).start();
			c.paint();
			new Thread(c).start();
			paintElements();
			
			app.text( this.pointCounter, 114,30);
			app.text(this.timeCounter, 279,30);
			
			
			app.text("X"+ c.getPosX() + "Y" + c.getPosY(), c.getPosX(), c.getPosY() );
			
			break;
			
		case 2: 
			is.paint();
			break;
			
		case 3:
			rs.paint();
			app.text(ss.getName(),152,298);
			app.text(ss.getDate(),897,298);
			app.text(this.pointCounter, 406,298);
			app.text(120-this.timeCounter, 658,298);
			break;
		}
		
		return screen;
	}
	
	
	@Override
	public void run() { //para las colisiones 
		
			for(int a =0; a < p.length; a++) {
				Plataform f = p[a];
				if(f.getPosX() > c.getPosX() + c.getW() || f.getPosX() + f.getW() < c.getPosX() 
						|| f.getPosY() > c.getPosY() + c.getH() || f.getPosY() + f.getH() < c.getPosY()) {
					this.isCollide=false;
				}else {
					this.isCollide=true;
				}
				
				if(this.isCollide==true) {
					c.setPosY(f.getPosY()-c.getH());
				}
			}
			
			
			for(int i = 0; i < b.size(); i++) {
				BluePoint u = b.get(i);
				if ( c.getPosX() > u.getPosX() + u.getW() || c.getPosX() + c.getW() < u.getPosX() 
						|| c.getPosY() > u.getPosY() + u.getH() || c.getPosY()+c.getH() < u.getPosY() ) {
				    this.isCollidePoint=false;
				    
				  }else{
					  this.isCollidePoint=true;
				  		}
				
				if(this.isCollidePoint==true) {
					b.remove(u);
					this.pointCounter++;
					}
				}
			
			for(int i = 0; i < e.size(); i++) {
				Enemy n = e.get(i);
				if ( c.getPosX() > n.getPosX() + n.getW() || c.getPosX() + c.getW() < n.getPosX() 
						|| c.getPosY() > n.getPosY() + n.getH() || c.getPosY()+c.getH() < n.getPosY() ) {
				    this.isCollideEnem=false;
				    
				  }else{
					  this.isCollideEnem=true;
				  		}
				
				if(this.isCollideEnem==true) {
					e.remove(n);
					this.pointCounter--;
					}
				}
			
			if(screen==1) {
			if(app.frameCount% 27 == 0) {
				this.timeCounter --;
				if(this.timeCounter <= 0 || b.size()==0) {
					screen = 3;
				}
			}
		}
			
			boolean isMove=false;
			//Movimiento del mapa
			if(app.keyCode == PApplet.RIGHT && app.keyPressed && c.getPosX() >= app.width*3/4) {
				for(int i=0; i < e.size(); i++) {
					for(int d=0; d < b.size(); d++) {
						for(int w=0; w < p.length; w++) {
							isMove=true;
							e.get(i).moveL();
							b.get(d).moveL();
							p[w].moveL();
							
							System.out.println(b.get(1).getPosX());
						}
						
					}
				}
			} else {
				isMove=false;
		}
			
			try {
				if(c.getPosY() >= app.height) {
					throw new defeatException("Has caido al vacio! PERDISTE");
				
					
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("entra");
				screen=3;
			}
			
			
			try {
				if(this.pointCounter == 50) {
					throw new victoryException("Has obtenido todos los puntos de calma!");
					
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				screen=3;
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
