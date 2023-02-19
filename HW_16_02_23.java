package Tasks;

public class HW_16_02_23 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 5, 6, 11, 12, 5, 6, 4, 0, 1, 12, 11, 4, 18};
        int nums[] = {1, 0, 2, 8, 6, 5, 3, 4, 7, 10, 9, 11, 12,13,14,16};
        int numers[] = {53, 61, 13, 341, 729, 128, 533, 226, 1222, 126};
       // Task_1.findNumber(arr);
       //  Task_2.getGap(nums);
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
