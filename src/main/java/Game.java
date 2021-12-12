import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        char array[][] = new char[3][3];
        boolean isX = false;
        int a, b;
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                array[i][j]='.';
            }
        }

        for(int k = 0; k < 9; k++) {
            if(checkIsWin(array))
                break;
            isX = !isX;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }

            do {
                System.out.println("Введите координаты: ");
                a = in.nextInt();
                b = in.nextInt();
            } while (!checkIsCorrectIn(array, a, b));

            if(isX){
                array[a][b] = 'x';
            }
            else{
                array[a][b] = 'o';
            }
        }
        if(checkIsWin(array)) {
            if (isX) {
                System.out.println("Победа X!");
            } else {
                System.out.println("Победа O!");
            }
        }
        else{
            System.out.println("Ничья!");
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

    public static boolean checkIsCorrectIn(char array[][], int a, int b){
        if(a < 0 || a > 2 || b < 0 || b > 2)
            return false;
        if(array[a][b] != '.')
            return false;
        return true;
    }
}
