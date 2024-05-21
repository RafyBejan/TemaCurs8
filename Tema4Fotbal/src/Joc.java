
public class Joc {
     private String echipa1;
     private String echipa2;
     private int goluriEchipa1;
     private int goluriEchipa2;
     private int numarOuturi;
     private int numarCornere;
     
	public Joc(String echipa1, String echipa2)
	 {
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
		this.goluriEchipa1 = 0;
		this.goluriEchipa2 = 0;
		this.numarOuturi = 0;
		this.numarCornere = 0;
	}
	public void simulare() {
		Minge minge =new Minge(50,25);
		for(int i=0;i<100;i++) {
			System.out.println(echipa1+"-"+echipa2+":Mingea se afla la coordonatele("+minge.getX()+","+minge.getY()+")");
			try {
				minge.suteaza();
			}catch(Out e) {
				numarOuturi++;
				System.out.println("Out!"+e.getMessage());
			}catch(Gol e) {
				if(minge.getX()==0) {
					goluriEchipa2++;
				}else {
					goluriEchipa1++;
				}
				System.out.println("Gol!"+e.getMessage());
				minge=new Minge(50,25); //Minge revine la mijlocul terenului
			}catch(Corner e) {
				numarCornere++;
				System.out.println("Corner!"+e.getMessage());
				if(minge.getX()==0) {
					minge= new Minge(0,minge.getY()==50 ? 50:0);
				}else {
					minge=new Minge(100,minge.getY()== 50? 50:0);
				}
			}
		}
	}
	@Override
	public String toString() {
		return echipa1+" vs " + echipa2 +"\n"+ 
	          "Scor: "+ goluriEchipa1 + " - "+ goluriEchipa2+"\n"+
			   "Out-uri: " + numarOuturi+ "\n" +
	          "Cornere: "+ numarCornere;
	}
	
     
     
}
