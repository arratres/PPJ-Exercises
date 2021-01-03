public
    class S23605_zestaw03 {

    public void cwiczenie_01(){

        byte zmiennaByte;
        //maksymalna wartość
        zmiennaByte = 0b1111111;
        //minimalna wartość
        zmiennaByte++;

        short zmiennaShort;
        //maksymalna wartość
        zmiennaShort = 0b111111111111111;
        //minimalna wartość
        zmiennaShort++;

        int zmiennaInt;
        //maksymalna wartość
        zmiennaInt = 0b1111111111111111111111111111111;
        //minimalna wartość
        zmiennaInt++;

        long zmiennaLong;
        //maksymalna wartość
        zmiennaLong = 0b111111111111111111111111111111111111111111111111111111111111111L;
        //minimalna wartość
        zmiennaLong++;

        float zmiennaFloat;
        //maksymalna wartość
        zmiennaFloat = 0b1111111111111111111111111111111;
        //minimalna wartość
        zmiennaFloat++;

        double zmiennaDouble;
        //maksymalna wartość
        zmiennaDouble = 0b111111111111111111111111111111111111111111111111111111111111111L;
        //minimalna wartość
        zmiennaDouble++;

        boolean zmiennaBoolean;
        //maksymalna wartość
        zmiennaBoolean = true;
        //minimalna wartość
        zmiennaBoolean = false;

    }

    public void cwiczenie_02(){
        boolean logiczny = true;
        int calkowity = 3248;
        double rzeczywisty = 32.48;
        char znakowy = 0b11011101;

//        System.out.println(logiczny == calkowity);
//        System.out.println(logiczny == rzeczywisty);
//        System.out.println(logiczny == znakowy);
        System.out.println(calkowity == rzeczywisty);
        System.out.println(calkowity == znakowy);
        System.out.println(rzeczywisty == znakowy);

    }

    public void cwiczenie_03(){
        int l123 = 1;
//        int 1abc = 1;
//        int @abc = 1;
//        int public = 1;
        int nienull = 1;
    }

    public void cwiczenie_04(){
        int zmienna = 3248;
        System.out.println(zmienna);
    }

    public void cwiczenie_05(){

        char charvalue = 'a';
        char charValue = 'b';

        /*
         Myślę, że program sie skompiluje. Nazwy zmiennych zaczynają się od słowa kluczowego, ale nie są słowem kluczowym.
         Sama nomenklatura nazewnictwa zmiennej jeśli chodzi o case sensivity nie wpływa w javie na kompilowalność programu
         */

    }

    public void cwiczenie_06(){
        int a = 3248;
        double b = 1111.11;
        a = (int) b;
        b = (double) a;

        /*
        a będzie wynosić 1111 (zaokrąglenie, rzutowanie do typu int), a b zmieni wartość na 1111.00
         */
    }

    public void cwiczenie_07(){
        byte myByte = 12;
        char myChar = 0b110101;
        int myInt = 121334;
        float myFloat = 12.34f;
        double myDouble = 1321421.14;

//        char newChar = myChar + myInt;
        /*
        operacja nie zadziałała, ponieważ dodawane były typy różnego rodzaju - znakowy i całkowity
        w rezultacie otrzymywany wynik był typu int. należy rzutować do typu char całą operację
         */
        char newChar = (char)(myChar + myInt);

        int newInt = myInt + myChar;

//        float newFloat = myFloat + myDouble;
        /*
        operacja nie zadziałała, ponieważ wynik operacji był typu zmiennej o większym obszarze w pamięci (tj. double)
         */
        float newFloat = (float)(myFloat + myDouble);

//        byte newByte = myByte + myInt;
        /*
        operacja nie zadziałała, ponieważ wynik operacji był typu zmiennej o większym obszarze w pamięci (tj. int)
         */
        byte newByte = (byte)(myByte + myInt);

    }

}