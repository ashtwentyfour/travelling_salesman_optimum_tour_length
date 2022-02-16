# Travelling Salesman Problem - Optimum Tour Length Package
========================


## Get Optimum Tour Length/Cost from the Input Graph/Network (completely connected)
---------------------------------


### INSTRUCTIONS

- Declare object of class TSP: TSP t = new TSP();
- Create your adjacency matrix C of size m * n (m = n)
- Invoke the optimum_tour_length function of class TSP: t.optimum_tour_length(m, n, start_point , C)
- Optimum tour length will be printed 
- Reference 'Driver.java' for an example of the invocation
- Build package using:

```
mvn package
```

- Execution example:

```
java -cp target/tsp-1.0-SNAPSHOT.jar com.ashtwentyfour.algos.Driver
```
