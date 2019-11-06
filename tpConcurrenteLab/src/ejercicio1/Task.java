package ejercicio1;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer>{
	private int inferior,superior;
	private int[] arr;
	
	public Task(int menor,int tope,int[]numeros){
		this.inferior=menor;
		this.superior=tope;
		this.arr = numeros;
	}
	
	
	
	@Override
	public Integer call() throws Exception {
		Integer suma=0;
		
		
		for(int i=inferior;i<superior;i++){
			suma+=arr[i];
		}
		
		
		return suma;
	}
	
	
	
	
	

}
