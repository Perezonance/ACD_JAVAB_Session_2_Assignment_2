package com.malex.session_2;

public class Assignment_2 {
	public static void main(String[] args){

		int lines = 7;
		int sp = lines/2;
		int lt = 1;
		char[] list = {'z', 'a', 'b', 'c', 'd'};
		
		
		
		for(int i = 1; i <= lines; i++){
			
			//Print the spaces first
			for(int j = 1; j <= sp; j++)
				System.out.print(" ");
			
			//Print the letters
			int count =  1;
			for(int k = 1; k <= lt; k++){
				System.out.print(list[count]);
				if(k <= lt / 2){
					count++;
				}else{
					count--;
				}
			}
			
			//Next Line
			System.out.println();
			
			//Determine if halfway point is reached
			if(i <= lines / 2){
				//First Half
				sp -= 1;
				lt += 2;
			}else{
				//Last half
				sp += 1;
				lt -= 2;
			}
		}
		
		
		
	}
}
