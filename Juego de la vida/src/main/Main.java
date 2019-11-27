package main;

import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
		int dx,dy,a=1;
		int t = 0;
		String s="";
		int[][] array= new int[3][3];
		
	for(int i=0;i<array.length;i++){
		for(int j=0;j<array.length;j++){
			array[i][j] = a;
			a++;
		}
		
	}
	
	for(int i=0;i<array.length;i++){
		for(int j=0;j<array.length;j++){
			s += " " + array[i][j] + " ";
		}
		
	}
	
	System.out.println(s);
	
	}

}
