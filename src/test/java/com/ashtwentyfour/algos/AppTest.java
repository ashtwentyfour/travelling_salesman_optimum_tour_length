package com.ashtwentyfour.algos;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for TSP App
 */
public class AppTest 
{
    /**
     * TSP Algo Test
     */
    @Test
    public void shouldCalculateTourLength()
    {
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

        TSP optimum_tour = new TSP();

        assertTrue( optimum_tour.optimum_tour_length(4 , 4 , 1 , C) == 35.0 );
    }
}
