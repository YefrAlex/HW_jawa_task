package Tasks;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class HW_05_03_23 {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        int listSize = 10;
        int maxNumber = 10;
        char coincidence = 'L';
        List <Integer> listInt1 = getRandom(listSize, maxNumber); // заполняют лист рандомными цифрами
        System.out.println("заполняют лист рандомными цифрами");
        System.out.println(listInt1);

        getEven(listInt1); // перебирают Итератором и выводят на экран все четные
        getOdd(listInt1);  //перебирают итератором и выводят на экран все нечетные

        String strR = getRandomString();// генерируют рандомную стрингу длиной 5
        System.out.println(strR);
        getCoincidence(coincidence,strR);

    }
    // заполняют лист рандомными цифрами
    public static List getRandom (int listSize, int maxNumber ) {
        List<Integer> listInt = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            listInt.add(random.nextInt(maxNumber));
        }
        return listInt;

    }
    // перебирают Итератором и выводят на экран все четные
    public static void getEven (List<Integer> listInt1) {
        ListIterator<Integer> iterator = listInt1.listIterator();
        System.out.println("перебирают итератором и выводят на экран все четные");
        while (iterator.hasNext()){
            int a = iterator.next();
                if ( a % 2 == 0) {
                System.out.print(a + ", ");
            }
        }
        System.out.println();
    }
    //перебирают итератором и выводят на экран все нечетные
    public static void getOdd (List<Integer> listInt1) {
        ListIterator<Integer> iterator = listInt1.listIterator();
        System.out.println("перебирают итератором и выводят на экран все нечетные");
        while (iterator.hasNext()){
            int a = iterator.next();
            if ( a % 2 == 1) {
                System.out.print(a + ", ");
            }
        }
        System.out.println();
    }
    // генерируют рандомную стрингу длиной 5
   public static String getRandomString () {
       System.out.println("генерируем случайную строку");
        Random random = new Random();
       String str = "";

       int langth = 5;
       for (int i = 0; i < langth ; i++) {
         char c =  (char)(random.nextInt(26) + 'A');
           str = str + c;

       }

       return str;
   }
   public static void  getCoincidence (char coincidence, String strR){
       System.out.println("ищем символ с конца");

        boolean flag = false;

       CharacterIterator integrator = new StringCharacterIterator(strR);
       char c = integrator.last();
        while (c != CharacterIterator.DONE) {
            System.out.println(c); // это проверка, что ищем с конца
           if (integrator.current() == coincidence) {
               System.out.println("Ура!!! " + coincidence + " найден" );
               flag = true;
               //break;  // если нужен 1 результат
               c = integrator.previous(); // если нужны все
           }else
           {c = integrator.previous();}

        }
    if (flag == false) {System.out.println("Печаль!!! " + coincidence + " не найден" );}
   }
}
