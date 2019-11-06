package ejercicio1;

import java.awt.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		
		int[] numeros = new int[50000];
		int indiceInferior,indiceSuperior,cantTareas,cantHilos;
		Scanner sc = new Scanner(System.in);
		int longitud=numeros.length;
		LinkedList listaTask = new LinkedList(); 
		
		System.out.println("¿cuantas tareas?");
		cantTareas = sc.nextInt();
		System.out.println("¿cuantas hilos?");
		cantHilos = sc.nextInt();
		
		indiceInferior = 0;
		indiceSuperior = longitud/cantTareas-1;
		
		for(int i=0;i<cantTareas;i++){
			Task task = new Task(indiceInferior,indiceSuperior,numeros);
			listaTask.add(task);
			indiceInferior = indiceSuperior;
			indiceSuperior += indiceSuperior;
		}
		
		
		try{
		ExecutorService serv = Executors.newFixedThreadPool(cantHilos);
		
		
		List future = new List();
		
		future =(List) serv.invokeAll(listaTask);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}


}
