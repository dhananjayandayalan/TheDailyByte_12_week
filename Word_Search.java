package TheDailyByte_12_week;

public class Word_Search {

    public static void main(String[] args) {

        char[][] board = {
                {'C', 'A', 'T', 'F'},
                {'B', 'G', 'E', 'S'},
                {'I', 'T', 'A', 'E'}
        };

        System.out.println(word_search(board, "CAT"));
        System.out.println(word_search(board, "TEA"));
        System.out.println(word_search(board, "SEAT"));
        System.out.println(word_search(board, "BAT"));

    }

    private static boolean word_search(char[][] board, String s) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(board[i][j] == s.charAt(0) && dfs(board, i, j, 0, s))
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, int i, int j, int count, String s) {
        if(count == s.length())
            return true;

        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != s.charAt(count))
            return false;

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean found = dfs(board, i + 1, j, count + 1, s)
                || dfs(board, i - 1, j, count + 1, s)
                || dfs(board, i , j + 1, count + 1, s)
                || dfs(board, i, j - 1, count + 1, s);

        board[i][j] = temp;
        return found;
    }

}
