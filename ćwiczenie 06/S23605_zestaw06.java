import java.util.Random;

public
    class S23605_zestaw06 {

    public void cwiczenie_01() {

        int[] arr = new int[10];

    }

    public void cwiczenie_02() {

        int[] arr = new int[10];
        Random generator = new Random();

        for(int i=0; i<arr.length; i++)
            arr[i] = generator.nextInt(2);

    }

    public void cwiczenie_03() {

        int[] arr = new int[10];
        Random generator = new Random();

        for(int i=0; i<arr.length; i++)
            arr[i] = generator.nextInt(2);

        int ile_0 = 0;
        int ile_1 = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0)
                ile_0++;
            else
                ile_1++;
        }

        System.out.println("Ilość zer: "+ile_0+"\nIlość jedynek: "+ile_1);

    }

    public void cwiczenie_04() {

        double[] arr = new double[10];
        Random generator = new Random();

        for(int i=0; i<arr.length; i++)
            arr[i] = generator.nextDouble()*100;

        System.out.println("\nElementy tablicy:");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+", ");

        System.out.println("\nElementy o parzystych indeksach w tablicy:");
        for(int i=0; i<arr.length; i=i+2)
            System.out.print(arr[i]+", ");

        System.out.println("\nElementy podzielne przez 2 po castowaniu do int:");
        for(int i=0; i<arr.length; i++){
            if((int)arr[i]%2==0)
                System.out.print(arr[i]+", ");
        }



    }

    public void cwiczenie_05() {

        //komenda nie wypisze żadnej wartości, ponieważ tablica nie została zainicjowana
        //gdyby została zainicjowana, komenda wypisałaby sam obiekt tablicy, nie jej wartości

//        int tab[];
//        System.out.println(tab);

    }

    public void cwiczenie_06() {

        int tab[] = {789, 678, 567};

        //pętla wyświetli różnicę między danym wyrazem a każdym występującym po nim, włączając jego samego (czyli zacznie od 0)
        for(int i=0; i<tab.length; i++)
            for(int j=i; j<tab.length; j++)
                System.out.println(tab[i]-tab[j]);

    }

    public void cwiczenie_07() {

        String[] slowa = {"Ala" , "kota" , "ma" , "ma" , "a" , "kot" , "Ale"};

        String joined_slowa = String.join(" ", slowa[0], slowa[2], slowa[1], slowa[4], slowa[5], slowa[3], slowa[6]);
        System.out.println(joined_slowa);

    }

    public void cwiczenie_08(){

        char[] dana_tablica_char = {'A', 'G', 'J', 'H', 'S', 'Z'};

        char[] nowa_tablica_char = new char[dana_tablica_char.length];

        for(int i=0; i<nowa_tablica_char.length; i++)
            nowa_tablica_char[i] = dana_tablica_char[dana_tablica_char.length-(i+1)];

    }

}