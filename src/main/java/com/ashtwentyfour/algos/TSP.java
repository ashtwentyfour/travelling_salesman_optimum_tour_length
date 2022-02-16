package com.ashtwentyfour.algos;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Set;


/**
 * 
 * 
 * @author Ashwin Menon
 * @version 1.0
 * @since 2015-06-15
 * 
 *
 */


public class TSP {
	
	
	/**
	 * 
	 * 
	 * @param m matrix dimension
	 * @param n matrix dimension
	 * @param start starting point 
	 * @param C adjacency matrix 
	 * 
	 * 
	 */
	
	public void optimum_tour_length(int m , int n , int start , Double C[][]) {
		
		
		/* checking input parameters */
		if(m <= 0 || n <= 0 || m != n)
			throw new IllegalArgumentException("Incorrect matrix dimensions, m = n and m > 0, n > 0");
		
		if(start > m || start > n || start <= 0)
			throw new IllegalArgumentException("starting point outside range");
		
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				if(C[i][j] == null || (i == j && C[i][j] != 0))
					throw new InvalidParameterException("check matrix dimensions and C[i][j] = 0 for i = j");
		
		Set<Integer> S = new HashSet<Integer>();
		   
		for(int i = 1; i <= m; i++) {   // set S = Set_of_points - {start}
			if(i == start)
			  continue;
			S.add(i);
		}
		   
	    System.out.println("Optimum Tour Length: ");
	       
	    System.out.println(tsp(start , C , S , start) + " units");
		
	
	}
	
	
	
	
	/**
	 * 
	 * 
	 * @param start starting point (original start point)
	 * @param C adjacency matrix (graph/network - completely connected)
	 * @param S2 set of all points/nodes except the starting point
	 * @param I  current start point 
	 * @return optimum tour length
	 * 
	 * 
	 */
	
	private Double tsp(int start , Double[][] C, Set<Integer> S2 , int I) {
 
		
		if(S2.size() == 0) {  
		
		  return C[I-1][start - 1];
		
		}
			
		double d = 0;
		double min_dist = Double.POSITIVE_INFINITY;
			
		for(int j: S2) { 
			  
		   Set<Integer> S1 = new HashSet<Integer>(S2); 
		   S1.remove(j);  // a set with all the vertices except the current starting point
		  
		   /* Recursion -> min_dist = minimum (TSP(j , S - {j}) + C[start][j]) */
		  
           d = C[I-1][j-1] + tsp(start, C, S1, j); 
			
           if(d < min_dist) {  // select minimum/smallest distance 
        	  
			 min_dist = d;
			 
		   }					
		
	    }
			
		return min_dist;  // return optimum length of tour
		 
    }



}
