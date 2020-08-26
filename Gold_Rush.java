package TheDailyByte_12_week;

public class Gold_Rush {

    public static void main(String[] args) {

        int[][] gold_mine = {
                {0, 2, 0},
                {8, 6, 3},
                {0, 9, 0}
        };

        System.out.println(gold_rush(gold_mine));
    }

    private static int gold_rush(int[][] mine) {
        int m = mine.length;
        int n = mine[0].length;

        int result = 0; //Intialize the result. we will be updating it accordingly
        // Loop over all the valid points i.e. non zero places
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mine[i][j] != 0){
                    result = Math.max(result, dfs(mine, i, j)); // Call the magical function that gives you the max gold if you start from this point and update res accordingly
                }
            }
        }
        return result;
    }

    public static int dfs(int[][] mine, int i, int j){

        if(i<0 || i>= mine.length || j<0 || j>= mine[0].length || mine[i][j] == 0) return 0; // return 0 if invalid location or the place has 0 gold or if the place is already visited

        int val = mine[i][j]; // save the value of this location into a temp var

        mine[i][j] = 0; // set the value of current location as 0 to mark it as visited

        int left = dfs(mine, i, j-1); // traverse left
        int right = dfs(mine, i, j+1); // traverse right
        int up = dfs(mine, i-1, j); // traverse up
        int down = dfs(mine, i+1, j); // traverse down

        mine[i][j] = val; // reset the value from temp var

        return mine[i][j] + Math.max(Math.max(Math.max(left,right),up),down); // get the max of all the four directions and add current value and return

    }

}
