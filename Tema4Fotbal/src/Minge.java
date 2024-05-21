
public class Minge {
	private int x;
	private int y;
	private CoordinateGenerator generator = new CoordinateGenerator();
	
	public Minge(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void suteaza() throws Out,Gol,Corner {
		
		 x = generator.generateX();
	        y = generator.generateY();
	        
		if(y==0 || y==50) {
			throw new Out("Out at("+x+","+y+")");
		}else if((x==0 || x==100)&& y >=20 && y<=30) {
			throw new Gol("Gol at ("+x+","+y+")");
		}else if(x==0 || x==100) {
			throw new Corner("Corner at ("+x+","+y+")");
		}
		
	}
	
	

}
