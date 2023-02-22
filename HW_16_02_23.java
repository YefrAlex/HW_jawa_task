package Tasks;

import java.util.Arrays;

public class HW_16_02_23 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 5, 5, 6, 11, 12, 5, 6, 18, 4, 0, 1, 12, 11, 4, };
        int nums[] = {1, 0, 2, 8, 6, 5, 3, 4, 7, 10, 9, 11, 12,13,14,16};
        int numers[] = {53, 61, 13, 341, 729, 128, 533, 226, 1222, 126};
        int[] numers1 = {1, 1, 5, 4, 1, 9, 2, 4, 6};
        int n1 = 11;
        String str = "CcccAAAAADDDDDDBQ";
        int arr1[] = {11, 0, 1, 5, 4, 8, 9, 3, 2, 6, 12, 19, 7, -6, 50, 18, 14, 65, -37};
        int n = 13;
        int[] numsN = {1,3,9,11,13,17,4,5,3,2,17,4,1};
        //Task_7.isDuplicated(numsN);
        //Task_6.getTwoNumbers(arr1, n);
        //Task_5.getMinSequence(numers1, n1);
        //Task_4.getCharNumber(str);
        //Task_1.findNumber(arr);
        // Task_2.getGap(nums);
         Task_3.getPerfectNumber(numers);

    }
}
class Task_1{
    //Описание занятия: 1. Дан массив чисел в котором все числа имеют повторения, кроме одного числа. Найти это число

    public static void findNumber (int[] arr) {
        for (int i = 0, j = 1; i < arr.length;){
            if (j== (arr.length -1))
            {
                System.out.println(arr[i] + "не имеет пары");
                break;
            }
            if (arr[i] != arr[j]) {  j++; }
            if (i == arr.length -1 && j== arr.length -1){
                System.out.println(arr[i] + "не имеет пары");
                break;
            }
            if (j == i){j++;}
            if (arr[i] == arr[j])
            {  i++;
                j = 0;}
        }
    }
}
class Task_2{
//    Дан массив чисел, в котором есть все числа от 0 до N . Все эти числа в единственном экземпляре.
//    Расположены в разнобой. Одно число в этом массиве пропущено ( Например {1 0 2 8 6 5 4 7} - это 3 ) . Найти пропущенное число

    public static void getGap (int[] nums) {
        int max = nums[0];
        int sum = 0;
        int sumN;
        int questNumber;
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            if( nums[i] > max) {max=nums[i];}
            if (i == nums.length-1) {
                sumN = max*max/2 + max/2;
                questNumber = sumN - sum;
                System.out.println("пропущено число " + questNumber);
            }

        }

    }

}
class Task_3 {
//    Дан массив чисел. Найти число состоящее из собственных делителей.
//    Например число 128 состоит из 1 2 и 8. 128 % 1 == 0 , 128 % 2 == 0 и 128 % 8 == 0. Вот такие числа надо найти.
    public static void getPerfectNumber (int[] numers){
        for (int i = 0; i<numers.length; i++){
            String nummer = String.valueOf(numers[i]);
            char[] chars = nummer.toCharArray();
            for (int j = 0; j < chars.length; j++ ){
                int a = Character.digit(chars[j],10);
                if (numers[i] % a != 0){ break;}
                if(j == chars.length -1){System.out.println(numers[i]); }
            }
        }
    }
}
class Task_4 {
    // неайти числа которые делятся на собственные состовляющие цифры

    public static void getCharNumber (String str) {

        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        char exampl = chars[0];
        int counter = 0;
        String result = "";


        for (int i = 0; i < chars.length; i++){

            if (exampl != chars[i]){
                result = result + exampl + Integer.toString(counter);
                exampl = chars[i];
                counter = 0;

            }
            if (exampl == chars[i]) {
                counter++;
            }

        }

        System.out.println(result);
    }
}
class Task_5 {
    //[1 1 5 4 1 9 2 4 6] n = 11
    //вернуть длину минимальной последовательности
    //которая в сумме дает n
    //в массиве все числа положительные
    public static void getMinSequence(int[] numers1, int n) {
        int minSeq = numers1.length;
        int minSeq1 = numers1.length;
        int seq = 0;
        int sum = 0;
        for (int i = 0, j = i; i < numers1.length - 1; ) {
            sum = sum + numers1[j];
            seq = seq + 1;
            if (j < numers1.length -1) {
                j = j + 1;
            } if (sum == n) {
                i = i + 1;
                j = i;
                sum = 0;
                minSeq1 = seq;
                seq = 0;
            } else if (sum > n ) {
                i = i + 1;
                j = i;
                sum = 0;
                seq = 0;
            }
            if (minSeq1 < minSeq) {
                minSeq = minSeq1;

            }

            System.out.println("minSeq=  " + minSeq);
        }
    }
}
class Task_6 {
    // вывести все числа из массива которые дают N
    public static void getTwoNumbers(int[] arr, int n) {
        int a = 0;
        int b = 0;
        for (int i = 0, j = i + 1; i < arr.length -1; j++) {
            a = arr[i];
            b = n - a;

            if (j == arr.length) {
                i = i + 1;
                j = i - 1; // если задать j = 0 - пары будут повторятся
            }
            if (b == arr[j]) {
                System.out.println("First number is: " + a);
                System.out.println("Second number is: " + b);
                i = i + 1;
                j = i - 1;// если задать j = 0 - пары будут повторятся
            }
        }
    }
}
class Task_7 {
    public static void isDuplicated(int[] numsN) {
        // есть или нет пары у числа

        for (int i = 0, j = 1; i < numsN.length -1;) {

            if (numsN[i] != numsN[j]) {
                j = j + 1;
            }
            if (j == numsN.length) {
                System.out.println(numsN[i] + " нет пары" );
                i = i +1;
                j = i +1;
            }
            else
            if (numsN[i] == numsN[j]) {
                System.out.println(numsN[i] + " = " + numsN[j]);
                i = i +1;
                j = i +1;
            }

        }
    }
}