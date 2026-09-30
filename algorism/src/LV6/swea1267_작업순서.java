package LV6;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class swea1267_작업순서 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
        for(int test_case = 1; test_case <= 10; test_case++)
        {
        	StringBuilder sb = new StringBuilder();
        	int V = sc.nextInt();
        	int E = sc.nextInt();
        	
        	int[][] adj = new int[V+1][V+1];
        	int[] inDegree = new int[V+1];
        	
        	for(int i = 0; i < E; i++) {
        		int from = sc.nextInt();
        		int to = sc.nextInt();
        		adj[from][to] = 1;
        		inDegree[to]++;
        		
        	}
        	Queue<Integer> q = new ArrayDeque<>();
        	for(int i = 1; i < V+1; i++) {
        		if(inDegree[i] == 0) {
        			q.add(i);
        		}
        	}
        	
        	while(!q.isEmpty()) {
        		int curr = q.poll();
        		sb.append(curr).append(" ");
        		
        		for(int i = 1; i < V+1; i++) {
        			if(adj[curr][i] == 1) {
        				adj[curr][i] = 0;
        				inDegree[i]--;
        				if(inDegree[i] == 0) {
        					q.add(i);
        				}
        			}
        		}
        		
        	}
             
             System.out.println("#" + test_case + " " + sb);
        }

	}

}
