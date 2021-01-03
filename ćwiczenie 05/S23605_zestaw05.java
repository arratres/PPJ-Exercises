public
    class S23605_zestaw05 {

    public void cwiczenie_01() {

        int k = 987654321;
        String s = "";
        while (k != 0) {
            int cyfra = k%10; //cyfra = reszta z dzielenia przez 10, czyli ostatni rząd wielkości
            s = s+cyfra; //przypisanie ostatniego rzędu wielkości do łańcucha znaków
            k = k/10; //'usunięcie' ostatnieog rzędu wielkości
        }

        /*
        Program przypisze do zmiennej s tekstową reprezentację odwrotności liczby k, czyli 123456789
         */
    }

    public void cwiczenie_02() {

        int s = 0, i = 1;
        while (i <= 10){
            s = s+i;
            i++;
        }
    }

    public void cwiczenie_03() {

        /*
        Różnica polega na tym, że pętla do while przypomni o parasolu nawet jak nie pada (instrukcja wykona się przed sprawdzeniem warunku)
        Pętla while najpierw sprawdzi warunek logiczny, dopiero potem, jeśli pada, przypomni o parasolu
        Przykład pozbawiony jest modyfikacji wartości zmiennej czy_pada, dla deklaracji true pętla będzie wykonywać się w nieskończoność - to tylko demonstracja
         */

        boolean czy_pada = false;

        do {
            System.out.println("Weź parasol!");
        } while (!czy_pada);

        while (!czy_pada){
            System.out.println("Weż parasol!");
        }
    }

    public void cwiczenie_04() {

        double value = 1, sum = 0;

        for (int i=0; i<10; i++){
            sum += value;
            value = value/2;
            System.out.println(sum);
        }
    }

    public void cwiczenie_05() {

        int wrt = 1070;
        double value = 1, sum = 0;

        for (int i=0; i<10; i++){
            sum += value;
            value = value/2;
            System.out.println(sum*wrt);
        }
    }

    public void cwiczenie_06() {

        /* liczby podzielne bez reszty przez 2 i 3 są podzielne przez 6
        for (int i = -1500; i<=1500; i++){
            if(i%6 == 0)
                System.out.println(i);
        }
         */
        /*
        rozwiązanie alternatywne, szybsze
        -1500 jest podzielne przez 6. Każda kolejna liczba podzielna przez 6 będzie jej wielokrotnością.
        Zamiast wykonywać instrukcję pętli dla każdej liczby, można inkrementować i o 6 i wyświetlać wartość
        warunek logiczny można by usunąć, aby dodatkowo przyspieszyć wykonanie pętli
         */
        for (int i = -1500; i<=1500; i+=6){
            if(i%6 == 0)
                System.out.println(i);
        }
    }

    public void cwiczenie_07() {

        for (int i=1; i<=5; i++){
            for (int j=i; j!=0; j--){
                if (j==1)
                    System.out.println("*");
                else
                    System.out.print("*");
            }
        }
    }
}