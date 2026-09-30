package LV5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class swea1248_공통조상 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int V = sc.nextInt();
			int E = sc.nextInt();
			
			int nodeA = sc.nextInt();
			int nodeB = sc.nextInt();
			
			int[] parent = new int[V+1]; // parent[i] 에는 i정점의 부모 번호 지정
			
			ArrayList<Integer>[] tree = new ArrayList[V+1];
			
			for(int i = 1; i <= V; i++) {
				tree[i] = new ArrayList<>();
			}
			
			for(int i = 0; i < E; i++) {
				int par = sc.nextInt();
				int child = sc.nextInt();
				
				parent[child] = par;
				tree[par].add(child);
			}
			
			boolean[] isOk = new boolean[V + 1];
			
			int curr = nodeA;
			
			while(curr != 0) {
				isOk[curr] = true;
				curr = parent[curr];
			}
			
			
			curr = nodeB;
			while(!isOk[curr]) {
				curr = parent[curr];
			}
			
			int result = curr;
			
			Queue<Integer> q = new ArrayDeque<>();
			q.offer(result);
			int count = 0;
			while(!q.isEmpty()) {
				int now = q.poll();
				count++;
				
				for(int child : tree[now]) {
					q.offer(child);
				}
			}
			
			System.out.println("#" + tc + " " + result + " " + count);
			
			
		}	// tc
	}		// main

}
