package Graphs.MatrixRepsent;

public class DFS {
    public static void main(String[] args) {
//        matrixDFS(new int[][]{{0,0,0,0},{0,0,0,0},{0,0,1,0},{0,0,0,0}});
        matrixDFS(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
    }
    public static void matrixDFS(int[][] edges){

        for (int c = 0; c < edges[0].length; c++) {
            for (int r = 0; r < edges.length; r++) {
                System.out.print(edges[r][c]+" ");
            }System.out.println();
        }



    }
}
