import java.util.Scanner;

public
    class S23605_zestaw04 {

    public void cwiczenie_01() {
        int i = 10 ; //inicjacja i przypisanie 10
        i = i++; //brak inkrementacji, zachodzi po przypisaniu do zmiennej i
        i = ++i ; //inkrementacja do 11
        i = i++ + ++i ; //suma 12 i 12, inkrementacja "drugiego" i zmienia wartość tej zmiennej do 12 (również dla "pierwszego" i)

        /*
        Rezultatem powyższego programu będzie moim zdaniem liczba 24, wyżej komentarze
        */
    }

    public void cwiczenie_02() {
        double a = 1023134.231; //inicjacja i przypisanie dowolnej liczby rzeczywistej, placeholder do kompilacji
        double x; //inicjacja bez przypisania
        if (a >= 0) x = 1.701; //
        if (a < 0) x = 2D *3.14f;
        else x = -1; //placeholder do kompilacji
        System.out.println(x);

        /*
        Rezultat powyższego programu zależny będzie od wartości zmiennej a.
        Jeśli będzie ona większa lub równa 0, zmiennej x zostanie przypisana wartość 1.701
        Jeśli będzie ona mniejsza od 0, będzie to 6.28 (2 * 3.14).
        Deklaracja literałów jako double lub float nie powinny mieć znaczenia - zmienna x jest typu double, typ większy od float
        */
    }

    public void cwiczenie_03() {
        int zmInt = 4;
        double zmDouble = -1.0;
        if(zmInt > 0)
            if (zmDouble > 0)
                System.out.println("Here I am! Rock you like a hurricane!");
            else
                System.out.println("No, I am here!");
        else
            System.out.println("No, actually , I am here!");

        /*
        Rezultatem działania błednęgo kodu będzie wyświetlenie napisu obu napisów: "No, I am here!" i "No, actually , I am here!"
        Stanie się tak dlatego, że pominięto wcięcie pierwszego else i zapomniano o drugim.
        w przypadku niespełenia warunków if, wykonana zostanie instrukcja else, a po niej instrukcja wydruku
         */
    }

    public void cwiczenie_04() {
        boolean doesSignificantWork = true;
        boolean makesBreakThrough = false;
        boolean noblePrizeCandidate;

        //prostszy zapis if
        if(doesSignificantWork && makesBreakThrough)
            noblePrizeCandidate = true;
        else
            noblePrizeCandidate = false;

        //pojedyńcze przypisanie
        noblePrizeCandidate = doesSignificantWork && makesBreakThrough ? true : false;
    }

    public void cwiczenie_05() {
        int a = 1, b = 2;
        boolean odp = a==b;
        /*
        zapis w wersji pierwotnej to a nie jest mniejsze od b oraz a nie jest większe od b
        innymi słowy a jest równe b
         */
    }

    public void cwiczenie_06() {
        int a = 1, b = 1, c = 2;
        System.out.println(a==b && b==c ? "są takie same" : "nie są takie same");
    }

    public void cwiczenie_07() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj miesiąc: ");
        int m = scan.nextInt();
        System.out.print("Podaj dzień: ");
        int d = scan.nextInt();

        switch(m){
            case 1, 2:
                System.out.println("Zima");
                break;
            case 3:
                switch(d){
                    case 21,22,23,24,25,26,27,28,29,30,31:
                        System.out.printf("Wiosna");
                        break;
                    case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20:
                        System.out.println("Zima");
                        break;
                    default:
                        System.out.println("Podano nieprawidłowy dzień.");
                        break;
                }
                break;
            case 4,5:
                System.out.println("Wiosna");
                break;
            case 6:
                switch(d){
                    case 21,22,23,24,25,26,27,28,29,30:
                        System.out.printf("Lato");
                        break;
                    case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20:
                        System.out.println("Wiosna");
                        break;
                    default:
                        System.out.println("Podano nieprawidłowy dzień.");
                        break;
                }
                break;
            case 7,8:
                System.out.printf("Lato");
                break;
            case 9:
                switch(d){
                    case 23,24,25,26,27,28,29,30:
                        System.out.printf("Jesień");
                        break;
                    case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22:
                        System.out.println("Lato");
                        break;
                    default:
                        System.out.println("Podano nieprawidłowy dzień.");
                        break;
                }
                break;
            case 10, 11:
                System.out.println("Jesień");
                break;
            case 12:
                switch(d){
                    case 22,23,24,25,26,27,28,29,30,31:
                        System.out.printf("Zima");
                        break;
                    case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21:
                        System.out.println("Jesień");
                        break;
                    default:
                        System.out.println("Podano nieprawidłowy dzień.");
                        break;
                }
                break;
            default:
                System.out.println("Podano nieprawidłowy miesiąc");
                break;
        }

    }

    public void cwiczenie_08() {
        double p = 2.371;
        if(p>1)
            System.out.println("Zmienna należy do zbioru A");
        else if(p<0)
            System.out.println("Zmienna należy do zbioru B");
        else
            System.out.println("Zmienna należy do zbioru ABC");
    }

    public void cwiczenie_09(){
        //część wspólna tych trzech zbiorów to <-4;-3>
        int wrt = -3;
        System.out.println((wrt>=-4 && wrt<=-3 ? "Wartość należy " : "Wartość nie należy ") + "do części wspólnej zbiorów A, B i C");
    }

    public void cwiczenie_10(){
        int wrt = -15;

        if(wrt <= -15)
            System.out.println("Wartość nalezy tylko do zbioru B");
        else if(wrt < -13) ;
//            System.out.printf("Wartość należy do obu zbiorów, A i B");
        else if(wrt < -10)
            System.out.printf("Wartość należy tylo do zbioru A");
        else ;
//            System.out.printf("Wartość nie należy ani do zbioru A, ani do zbioru B");
    }

}