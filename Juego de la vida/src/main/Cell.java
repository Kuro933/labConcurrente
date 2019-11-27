package main;

public class Cell {

	private boolean estado;
	private Cell[] vecinas;
	private String Eactual;
	
	
	
	public Cell(boolean est,Cell[] ady,String estActu){
		this.estado=est;
		this.vecinas=ady;
		this.Eactual=estActu;
		
	}
	
	
}
