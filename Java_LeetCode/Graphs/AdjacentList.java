package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AdjacentList {
    public static void main(String[] args) {
        System.out.println(convertToAdj(4,
                new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {0, 2}}));
    }
    public static HashMap<Integer,List<Integer>> convertToAdj(int n,int[][] edges){
        HashMap<Integer,List<Integer>> adjaList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjaList.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
           adjaList.get(a).add(b);
           adjaList.get(b).add(a);
        }
        return adjaList;
    }
}
