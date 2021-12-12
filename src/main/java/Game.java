import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        char array[][] = new char[3][3];
        boolean isX = true;
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                array[i][j]='.';
            }
        }

        while(checkIsWin(array)) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }


        }
    }

    public static boolean checkIsWin(char array[][]){
        for(int i = 0; i < 3; i++){
            if(array[0][i] == array[1][i] && array[0][i] == array[2][i] && array[0][i]!='.'){
                return true;
            }
            if(array[i][0] == array[i][1] && array[i][0] == array[i][2] && array[i][0]!='.'){
                return true;
            }
        }
        if(array[0][0] == array[1][1] && array[0][0] == array[2][2] && array[0][0] != '.') {
            return true;
        }
        if(array[0][2] == array[1][1] && array[0][2] == array[2][0] && array[0][2] != '.') {
            return true;
        }
        return false;
    }
}
