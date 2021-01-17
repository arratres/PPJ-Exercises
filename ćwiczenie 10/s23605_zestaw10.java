public class s23605_zestaw10{

    public void cwiczenie_01(){
        Kwadrat square = new Kwadrat(123.45);
        square.show();
    }

    public void cwiczenie_02(){
        Walec cyl = new Walec(10, 5.2);
        cyl.show();
    }

    public void cwiczenie_03(){
        Prostopadloscian test = new Prostopadloscian(13, 2.3, 44);
        test.show();

        Graniastoslup test2 = new Graniastoslup(12,13,15);
        test2.show();
    }

    public void cwiczenie_04(){
        Drzewo tree = new Drzewo(true, 13, "???");
        System.out.println(tree.toString());
    }

    public void cwiczenie_05(){
        DrzewoOwocowe tree = new DrzewoOwocowe(true, 13, "???", 12, "Śliwka");
        System.out.println(tree.toString());
        
    }    

    class Kwadrat{
        private double bok;

        Kwadrat(double bok){
            this.bok = bok;
        }

        void show(){
            System.out.println("Pole kwadratu: " + Math.pow(this.bok, 2) + "\nObjętość sześcianu: " + Math.pow(this.bok, 3));
        }

    }

    class Walec{
        private double promien;
        private double wysokosc;

        Walec(double promien, double wysokosc){
            this.promien = promien;
            this.wysokosc = wysokosc;
        }

        void show(){
            double base = Math.PI*Math.pow(this.promien,2);
            System.out.println("Pole podstawy: " + base + "\nObjętość walca: " + base*this.wysokosc);
        }
    }

    class Prostokat{
        private double _a;
        private double _b;

        Prostokat(double _a, double _b){
            this._a = _a;
            this._b = _b;
        }

        void show(){
            System.out.println("Pole prostokąta: " + this._a*this._b);
        }

    }

    class Prostopadloscian extends Prostokat{
        private double height;

        Prostopadloscian(double _a, double _b, double height){
            super(_a, _b);
            this.height = height;
        }

        @Override
        void show(){
            double base = super._a*super._b;
            System.out.println("Pole prostopadłościanu: " + (base*2 + super._a*this.height*2 + super._b*this.height*2));
            System.out.println("Objętość prostopadłościanu: " + base*height);
        }
    }

    class Trojkat{
        private double height;
        private double base;

        Trojkat(double base, double height){
            this.height = height;
            this.base = base;
        }

        void show(){
            System.out.println("Pole trójkąta: " + 1/2*this.base*this.height);
        }
    }

    class Ostroslup extends Trojkat{
        private double ostrHeight;
        //zakładam, że ostrosłup ma kwadrat w podstawie

        Ostroslup(double base, double height, double ostrHeight){
            super(base, height);
            this.ostrHeight = ostrHeight;
        }

        @Override
        void show(){
            double area = Math.pow(super.base, 2) + 4*1/2*super.base*super.height;
            System.out.println("Pole ostrosłupa: " + area);
            double volume = 1/3 * Math.pow(super.base, 2) * this.ostrHeight;
            System.out.println("Objętość ostrosłupa: " + volume);
        }
    }

    class Graniastoslup extends Trojkat{
        private double granHeight;

        Graniastoslup(double base, double height, double granHeight){
            super(base, height);
            this.granHeight = granHeight;
        }

        @Override
        void show(){
            double area = super.base*super.height + super.base*this.granHeight*3; //zakładam, że trójkąt jest równoboczny
            System.out.println("Pole graniastosłupa: " + area);
            double volume = super.base*super.height*granHeight/2;
            System.out.println("Objętość graniastosłupa: " + volume);
        }
    }

    class Drzewo{
        private boolean wiecznieZielone;
        private int wysokosc;
        private String przekrojDrzewa;

        Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
            this.wiecznieZielone = wiecznieZielone;
            this.wysokosc = wysokosc;
            this.przekrojDrzewa = przekrojDrzewa;
        }

        @Override
        public String toString() {
            String result = "Drzewo" + (wiecznieZielone ? " jest " : " nie jest ") + "wiecznie zielone.";
            result += "\nJego wysokość to " + wysokosc;
            result += "\nPrzekrój drzewa: " + przekrojDrzewa;
            return result;
        }
    }

    class DrzewoIglaste extends Drzewo{
        private int iloscIgiel;
        private double dlugoscSzyszki;

        DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki){
            super(wiecznieZielone, wysokosc, przekrojDrzewa);
            this.iloscIgiel = iloscIgiel;
            this.dlugoscSzyszki = dlugoscSzyszki;
        }

        @Override
        public String toString(){
            String result = super.toString();
            result += "\nIlość igieł: " + iloscIgiel;
            result += "\nDługość szyszki: " + dlugoscSzyszki;
            return result;
        }
    }

    class DrzewoLisciaste extends Drzewo{
        private int ksztaltLiscia;

        DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia){
            super(wiecznieZielone, wysokosc, przekrojDrzewa);
            this.ksztaltLiscia = ksztaltLiscia;
        }

        @Override
        public String toString(){
            String result = super.toString();
            result += "\nKształt liścia: " + ksztaltLiscia;
            return result;
        }
    }

    class DrzewoOwocowe extends DrzewoLisciaste{
        private String nazwaOwoca;

        DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca){
            super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
            this.nazwaOwoca = nazwaOwoca;
        }

        @Override
        public String toString(){
            String result = super.toString();
            result += "\nNazwa owoca: " + nazwaOwoca;
            return result;
        }
    }

}
