package com.heckercode.controller;
import com.heckercode.utilities.*;
import java.util.*;
public class Driver {

        public static void main(String [] args)
        {

            Scanner scan = new Scanner(System.in);
            System.out.println("enter the graph");
            int n=5;
            int inf = 999;

            int [][]graph = new int[n][n];

            int []sptSet=new int[5];

            int [] visited = new int[5];



            for(int i =0;i<n;i++){
                sptSet[i]=0;
                visited[i]=0;

            }

            for(int i = 0;i<n;i++){
                for(int j=0;j<n;j++){
                    graph[i][j]= scan.nextInt();
                    if(graph[i][j]<=0){
                        graph[i][j]=inf;

                    }
                }
            }
            for(int i =0 ;i<n;i++){
                com.hackercode.utilities.Dijkstra.dij(visited,graph,inf,i);
                visited[i]=0;
            }
            for(int i =0;i<n;i++){
                for(int j= 0;j<n;j++){

                    System.out.print(graph[i][j] + " ");
                }
                System.out.println();

            }

        }

	/*0 3 0 1 0
	  3 0 2 0 0
	  0 2 0 2 4
	  1 2 0 0 3
	  0 0 4 3 0*/


    }