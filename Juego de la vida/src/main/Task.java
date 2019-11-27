package main;


public class Task implements Runnable{
	private int inicio,fin;
	private Cell[][] world;
	
	public Task(int fila,int columna,Cell[][] mund){
		this.inicio=fila;
		this.fin=columna;
		this.world = mund;
	}
	
	@Override
	public void run(){
		
		
	}
	


}
