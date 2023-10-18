import java.util.*;

public class FloodFillAlgorithm { //0(m*n)
    public int[][] helper (int [][],int sr,int color,boolean vis[][],int orgCol){
        if(sr<0 || sc<0 || sr>=image.length; || sc>=image[0].length ||
        vis[sr][sc] || image [sr] [sc]!=orgCol){
            return;
        }
        image[sr][sc]=color;
    
        //left 
        helper(image,sr,sc-1,color,vis,orgCol);
        //right
        helper(image,sr,sc+1,color,vis,orgCol);
        //up
        helper(image,sr,sc-1,color,vis,orgCol);
        //down
        helper(image,sr,sc+1,color,vis,orgCol);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

}
