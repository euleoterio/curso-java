package desafio;

import java.util.Objects;

public class Ponto {

	private int x;
	private int y;

	//A)
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto() {
		this.x = 0;
		this.y = 0;
	}
	
	//B)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ponto other = (Ponto) obj;
		return x == other.x && y == other.y;
	}
	
	public Double calculateDistance(Ponto p) {
		Double result = Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2);
		return Math.sqrt(result);
	}
	
	
	

//	  // A)
//	  public Ponto(int x, int y) {
//	  	this.x = x;
//	    this.y = y;
//	  }
//	  public Ponto() {
//	 	this.x = 0;
//	    this.y = 0;
//	  }
//	  
//	  // B)
//	  // implícito????
//	  public Boolean checkEquals (int x1, int y1) {
//	  	if(this.x == x && this.y == y) {
//	    	return true;
//	    }
//	    
//	    return false;
//	  }
//	  
//	  public Double calculateDistance (int x1, int y1) {
//	  
//	  	Double result = Math.sqrt(Math.pow(x1 - x,2) + Math.pow(y1 - y,2) );
//	    
//	  	return result;
//	  }
}
