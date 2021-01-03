import java.util.*;

public
    class S23605_zestaw08 {

    public void cwiczenie_01(){
        int myInt = 10;
        show(myInt);
    }

    public void cwiczenie_02(){
        int wrt = 5;
        System.out.println(wrt); 
        modifyValue(wrt);
        /*
        wyświetlona wartość przed i po wykonaniu metody wynosić będzie tyle samo.
        Powód: modyfikowana jest zmienna lokalna w obrębie metody, czyli lokalna kopia wrt 
        */
        System.out.println(wrt);
    }

    public void cwiczenie_03(){
        char[] charArr = "Ala ma kota".toCharArray();
        countChars(charArr);
    }

    public void cwiczenie_04(){
        Random rand = new Random();

        int[] tab1 = new int[rand.nextInt(10)];
        int[] tab2 = new int[rand.nextInt(10)];

        for(int i=0; i<tab1.length; i++)
            tab1[i] = rand.nextInt(10);
        for(int i=0; i<tab2.length; i++)
            tab2[i] = rand.nextInt(10);

        int[] result1 = checkTwoArrs(tab1, tab2, -1);
        int[] result2 = checkTwoArrs(tab1, tab2, 1);
    }

    public void cwiczenie_05(){
        draw_square(5, 'x');
        draw_square(7, 'o');
    }

    public void show(int param){
        System.out.println(param);
    }

    public void modifyValue(int wrt){
        System.out.println(wrt);
        wrt *= 5;
        System.out.println(wrt);
    }

    public void countChars(char[] charArr){
        
        String uniquechars = "";

        for(int i=0; i<charArr.length; i++){
            char[] tempCurrChars = uniquechars.toCharArray();
            boolean uniqueCheck = true;

            for(int j=0; j<tempCurrChars.length; j++)
                if(tempCurrChars[j] == charArr[i]){
                    uniqueCheck = false;
                    break;
                }
                               
            //wartość unikalna
            if(uniqueCheck)
                uniquechars += charArr[i];
        }

        char[] uniquecharsArr = uniquechars.toCharArray();
        int[] charCounts = new int[uniquecharsArr.length];


        for(int i=0; i<charArr.length; i++){
            for(int j=0; j<uniquecharsArr.length; j++)
                if(charArr[i] == uniquecharsArr[j]){
                    charCounts[j]++;
                    break;
                }
        }

        for(int i=0; i<uniquecharsArr.length; i++){
            System.out.println("Znak '" + uniquecharsArr[i] + 
            "' występuje " + charCounts[i] + "x w zdaniu '" + String.valueOf(charArr)+"'");
        }

    }

    public int[] checkTwoArrs(int[] intArr1, int[] intArr2, int arg){
        
        int[] retArr;
        int shorterLen;

        if(intArr1.length > intArr2.length)
            shorterLen = intArr2.length;
        else if(intArr1.length < intArr2.length)
            shorterLen = intArr1.length;
        else
            return null;

        if(arg < 0){
            retArr = new int[shorterLen];            
            for(int i=0; i<shorterLen; i++){
                retArr[i] = intArr1[i] + intArr2[i];
            }           
        } else if(arg > 0) {
            if(intArr1.length == shorterLen){
                retArr = new int[intArr2.length - intArr1.length];
                for(int i = 0; i<retArr.length; i++)
                    retArr[i] = intArr2[shorterLen+i];                
            } else {
                retArr = new int[intArr1.length - intArr2.length];
                for(int i = 0; i<retArr.length; i++)
                    retArr[i] = intArr1[shorterLen+i];     
            }
        } else {
            return null;
        }
        
        return retArr;
    }

    public void draw_square(int sideLen, char sign){
        if(sign == 'x' || sign == 'o'){
            for(int i=0; i<sideLen; i++){
                for(int j=0; j<sideLen; j++){
                    System.out.print(sign + " ");
                    sign = (sign == 'x') ? 'o' : 'x';
                }
                System.out.println();
            }
        }
    }
    
}