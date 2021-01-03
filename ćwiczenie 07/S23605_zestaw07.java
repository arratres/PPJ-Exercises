import java.util.Random;
import java.lang.Character;

public
    class S23605_zestaw07 {

    public static void main(String[] args){
        cwiczenie_04();
    }

    public void cwiczenie_01(){

        Random rand = new Random();

        int[] arr1 = new int[rand.nextInt(10)];
        int[] arr2 = new int[rand.nextInt(10)];
        int[] arr3 = new int[rand.nextInt(10)];

        int[][] all_arrs = {arr1, arr2, arr3};

        for(int i=0; i<all_arrs.length; i++){
            for(int j=0; j<all_arrs[i].length; j++){
                all_arrs[i][j] = rand.nextInt(100);
                System.out.print(all_arrs[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void cwiczenie_02(){

        Random rand = new Random();
        int[][] arr88 = new int[8][8];

        for(int i=0; i<arr88.length; i++)
            for(int j=0; j<arr88[i].length; j++)
                arr88[i][j] = rand.nextInt(11);


        byte counter1, counter2;
        int num1, num2;
        boolean atLeast3 = false;

        for(int i=0; i<arr88.length; i++){

            //sprawdzamy z obu krańców zaczynając licznik od 1 (uwzględniając początek iteracji)
            counter1 = counter2 = 1;
            num1 = arr88[i][i];
            num2 = arr88[arr88.length-i-1][i];

            for(int j = i+1; j<arr88.length; j++){
                //sprawdzamy wszystkie 4 opcje (ponieważ liczymy łącznie obie przekątne)

                //gdy środek liczymy tylko raz
                if(j == arr88.length-j-1){
                    if(num1 == arr88[j][j]) counter1++;
                    if(num2 == arr88[j][j]) counter2++;
                    continue;
                }

                if(num1 == arr88[j][j]) counter1++;
                if(num2 == arr88[j][j]) counter2++;
                if(num1 == arr88[arr88.length-j-1][j]) counter1++;
                if(num2 == arr88[arr88.length-j-1][j]) counter2++;
            }

            //po wykonanych iteracjach sprawdzamy 'stan liczników', przerywamy jeśli mamy oczekiwanyrezultat
            if(counter1>=3 || counter2>=3){
                System.out.println("Na przekątnych tej tablicy występują co najmniej 3 takie same liczby");
                atLeast3 = true;
                break;
            }
        }
        if(!atLeast3) System.out.println("Na przekątnych tej tablicy nie występują co najmniej 3 takie same liczby");
    }

    public void cwiczenie_03(){

        char [][] tab = {
            {'S', 'a' , 'm' , 's' , 'u' , 'n' , 'g' },
            { 'N' , 'o' , 'k' , 'i' , 'a' },
            { 'A' , 'p' , 'p' , 'l' , 'e' },
            { 'B' , 'l' , 'a' , 'c' , 'k' , 'B' , 'e' , 'r' , 'r' , 'y' },
            { 'A' , 'l' , 'c' , 'a' , 't' , 'e' , 'l' },
            { 'S' , 'o' , 'n' , 'y' },
            { 'J' , 'o' , 'l' , 'l' , 'a'}
        };


        for(int i=0; i<tab.length; i++){

            byte fulfilled = 0;

            //sprawdzamy 2 takie same litery
            for(int j=0; j<tab[i].length; j++){
                char letter = Character.toLowerCase(tab[i][j]);

                for(int k=j+1; k<tab[i].length-1; k++){
                    if(Character.toLowerCase(tab[i][k]) == letter){
                        fulfilled++;
                        break;
                    }
                }
            }

            //sprawdzamy sumę w słowie
            short sum = 0;
            for(int j=0; j<tab[i].length; j++)
                sum += tab[i][j];
            if(sum>255) fulfilled++;

            //sprawdzamy literę i
            for(int j=0; j<tab[i].length; j++)
                if(Character.toLowerCase(tab[i][j]) == 'i'){
                    fulfilled++;
                    break;
                }

            //sprawdzamy dwa takie same znaki
            for(int j=0; j<tab[i].length; j++){
                char curr_char = tab[i][j];

                for(int k=j+1; k<tab[i].length-1; k++){
                    if(tab[i][k] == curr_char){
                        fulfilled++;
                        break;
                    }
                }
            }

            //drukujemy jeśli spełnia
            if(fulfilled>=3){
                for(int j=0; j<tab[i].length; j++)
                    System.out.print(tab[i][j]);
                System.out.println();
            }
        }
    }

    public static void cwiczenie_04(){

        int[][] arr1010 = new int[10][10];
        Random rand = new Random();

        for(int i=0; i<arr1010.length; i++){
            for(int j=0; j<arr1010[i].length; j++)
                arr1010[i][j] = rand.nextInt(20);
            //po każdym wierszu sortowanie

            //komentuję drogę na skróty, bo zgaduję, że nie taki był cel ćwiczenia
//            Arrays.sort(arr1010[i]);

            boolean didChange = false;
            while(true){
                for(int k=0; k<arr1010[i].length-1; k++){
                    if(arr1010[i][k] > arr1010[i][k+1]){
                        int tempVal = arr1010[i][k];
                        arr1010[i][k] = arr1010[i][k+1];
                        arr1010[i][k+1] = tempVal;
                        didChange = true;
                    }
                }
                if(didChange) didChange = false;
                else break;
            }
        }

        for(int i=0; i<arr1010.length; i++){
            for(int j=0; j<arr1010[i].length; j++)
                System.out.print(arr1010[i][j]+" ");
            System.out.println();
        }
    }
}
