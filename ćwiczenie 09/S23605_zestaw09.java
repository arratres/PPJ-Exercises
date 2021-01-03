public
    class S23605_zestaw09{

    public void cwiczenie_01(){

        MethodCurrier mc = new MethodCurrier();

        mc.setValue(12);
        mc.setValue(12.0f);
        mc.setValue('c');
        mc.setValue((byte)12);

        //decyzja jest podejmowana na podstawie typu przekazanego parametru
        //jeśli parametr jest zmiennoprzecinkowy, trafia do metody float
        //jeśli parametr nie jest typu int lub float, wygląda na to, że następuje próba zmiany na inny typ nadrzędny
        //zarówno typ char jak i typ byte mogą być interpretowane jako typ int, więc wykonano metodę przyjmującą typ int jako typ wyższy

    }

    public void cwiczenie_02(){
        MethodCurrier mc = new MethodCurrier();
        Number num = new Number();
        num.setValue(15);

        mc.setValue(12);
        mc.setValue(12.0f);
        mc.setValue(num);

        //metody w 1 i w 2 przypadku zmieniły lokalnie dostarczoną wartość.
        //gdybym przekazał 12 jako zmienna, np int val = 12, to po wywołaniu metody setValue dalej miałaby ona wartość 12
        //jedynie w przypadku ostatnim, tj. użycia klasy Number na stałe zmieniłem wartość zmiennej przechowywanej w instancji klasy
    }

    public void cwiczenie_03(){
        Osoba os = new Osoba();
        os.imie = "Roman";
        os.nazwisko = "Iksiński";
        os.rokUrodzenia = 1987;
    }

    public void cwiczenie_04(){
        Osoba os = new Osoba("Krzysztof", "Igrekov", 1978);
        os.show();
    }

    public void cwiczenie_05(){
        Cplx cplx1 = new Cplx(12.5, -13.9);
        Cplx cplx2 = new Cplx(113.1, .9);
        Cplx cplx3 = new Cplx(1.333, 543.21);

        cplx1.add(cplx2);
        cplx2.sub(cplx3);
        cplx3.mul(cplx1);
        cplx2.inc();
        cplx1.inc();
        cplx3.inc();
        cplx1.add(cplx2);
        cplx2.sub(cplx3);
        cplx3.mul(cplx1);
    }

}

class MethodCurrier{
    void setValue(int param){
        System.out.println("Zmienna typu int: " + param);
        param *= 10;
        System.out.println("Zmienna typu int po modyfikacji: " + param);
    }

    void setValue(float param){
        System.out.println("Zmienna typu float: " + param);
        param *= 10;
        System.out.println("Zmienna typu float po modyfikacji: " + param);
    }

    void setValue(Number param){
        System.out.println("Zmienna typu Number.");
        param.showValue();
        param.setValue(param.val*10);
        System.out.println("Zmieniono wartość val w zmiennej typu Number");
        param.showValue();
    }
}

class Number{
    int val;

    void setValue(int val){
        this.val = val;
    }

    void showValue(){
        System.out.println("Value is: " + val);
    }
}

class Osoba{
    String imie;
    String nazwisko;
    int rokUrodzenia;

    Osoba(){
        this("NoName", "NoSurname", 1970);
    }

    Osoba(String imie, String nazwisko, int rokUrodzenia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    void show(){
        System.out.println(this.imie + " " + this.nazwisko + " was born in " + this.rokUrodzenia);
    }

}

class Cplx{
    private double imaginaryNumber;
    private double realNumber;

    Cplx(double imaginaryNumber, double realNumber){
        this.imaginaryNumber = imaginaryNumber;
        this.realNumber = realNumber;
    }

    double getImaginary(){
        return imaginaryNumber;
    }

    double getReal(){
        return realNumber;
    }

    void add(Cplx cplxExternal){
        Cplx result = new Cplx((this.imaginaryNumber + cplxExternal.getImaginary()), (this.realNumber + cplxExternal.getReal()));
        
        System.out.print("Adding ");
        this.show();
        System.out.print(" and ");
        cplxExternal.show();
        System.out.print(" gives a result of ");
        result.show();
        System.out.println();
    }

    void sub(Cplx cplxExternal){
        Cplx result = new Cplx((this.imaginaryNumber - cplxExternal.getImaginary()), (this.realNumber - cplxExternal.getReal()));
        
        System.out.print("Substracting ");
        this.show();
        System.out.print(" and ");
        cplxExternal.show();
        System.out.print(" gives a result of ");
        result.show();
        System.out.println();
    }

    void mul(Cplx cplxExternal){
        double resultImaginary = this.realNumber * cplxExternal.getImaginary() + this.imaginaryNumber * cplxExternal.getReal();
        double resultReal = this.realNumber * cplxExternal.getReal() - this.imaginaryNumber * cplxExternal.getImaginary();
        Cplx result = new Cplx(resultImaginary, resultReal);
        
        System.out.print("Multiplying ");
        this.show();
        System.out.print(" and ");
        cplxExternal.show();
        System.out.print(" gives a result of ");
        result.show();
        System.out.println();
    }

    void inc(){
        
        System.out.print("Increased real part of ");
        this.show();
        System.out.print(" by 1. Result is ");
        this.realNumber++;
        this.show();
        System.out.println();
    }

    void show(){
        System.out.print("complex number " + realNumber + " + " + imaginaryNumber + "i");
    }
}