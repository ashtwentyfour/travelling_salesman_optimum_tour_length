package com.ashtwentyfour.algos;

public class Driver {
	
	public static void main(String args[]) {
		
       /* test graph below in adjacency matrix format with 4 'cities' */
	
	   Double [][] C = new Double[4][4];
	 
	   C[0][0] = 0.0;
	   C[0][1] = 10.0;
	   C[0][2] = 15.0;
	   C[0][3] = 20.0;
	   C[1][0] = 5.0;
	   C[1][1] = 0.0;
	   C[1][2] = 9.0;
	   C[1][3] = 10.0;
	   C[2][0] = 6.0;
	   C[2][1] = 13.0;
	   C[2][2] = 0.0;
	   C[2][3] = 12.0;
	   C[3][0] = 8.0;
	   C[3][1] = 8.0;
	   C[3][2] = 9.0;
	   C[3][3] = 0.0;
	   
	   /* declare a new object of class TSP*/
	   TSP optimum_tour = new TSP();
	   
	   /* print out the optimum tour length for this graph (default starting point = 1) */
	   Double opt_length = optimum_tour.optimum_tour_length(4 , 4 , 1 , C);
	   System.out.println("Optimum Tour Length: " + opt_length + " units");
	
	}
	   
}
