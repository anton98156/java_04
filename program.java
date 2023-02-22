
// SEMINAR 04

// import java.util.ArrayList;
// import java.util.LinkedList;
// public class program{
//     public static void main(String[] args){
 
//         var start = System.currentTimeMillis();
//         ArrayList<Integer> arr = new ArrayList<>(2000000);
//         for (int i = 0; i < 2000000; i++) {
//             arr.add(i);
//         }

//         var end = System.currentTimeMillis();
//         System.out.printf("ArrayList time: %d", end -start);
//         var linkStart = System.currentTimeMillis();
//         LinkedList<Integer> arrs = new LinkedList<>();
//         for (int i = 0; i < 2000000; i++) {
//             arrs.add(i);
//         }

//         var linkEnd = System.currentTimeMillis();

//         System.out.printf("\n" + "LinkedList time: %d", linkEnd - linkStart);

//     }
// }

/*

 Реализовать консольное приложение, которое:

 1. Принимает от пользователя и “запоминает” строки.
 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

// foo
// bar
// buzz
// print -> [buzz, bar, foo]
// revert
// print -> [bar, foo]

// import java.util.ArrayList;
// import java.util.Scanner;
// public class program{
//     public static void main(String[] args){
//         ArrayList<String> arr = new ArrayList<>();
//         Scanner iScanner = new Scanner(System.in);
//         String str = "";
//         while (!str.equals("exit")){
//             System.out.println("Write line: ");
//             str = iScanner.nextLine();
//             if (!str.equals("print") && !str.equals("revert")){
//                 arr.add(0, str);
//             }
//             else if (str.equals("print")){
//                 System.out.println(arr.toString());
//             }
//             else if (str.equals("revert") && arr.size() > 0){
//                 arr.remove(0);
//             }
//         }
//         iScanner.close();
//     }
// }


// HOME WORK 

// Реализовать консольное приложение, которое:

// Принимает от пользователя строку вида
// text~num

// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

     // text~num (например, word~4)
// print~num (распечатать текст)

// word~1
// foo~5
// qwerty~10
// bar~5
// print~10 -> qwerty
// print~1 -> word
// print~2 -> пустая строка или исключение NoSuchElementException
// print~5 -> bar

import java.util.ArrayList;
import java.util.Scanner;
public class program{
    public static void main(String[] args){
        String str = "";
        ArrayList<String> arr = new ArrayList<String>(10);
        for (int i = 0; i < 10; i++){
            arr.add(str);
        }
        Scanner iScanner = new Scanner(System.in);
        while (!str.equals("exit")){
            System.out.println("write line: ");
            str = iScanner.nextLine();
            String[] split = str.split("~");
            String word = split[0];
            String numberString = split[1];
            int number = Integer.parseInt(numberString);
            if(!word.equals("print")){
                arr.add(number, word);
            }
            else{
                if((!arr.get(number).equals(""))){
                    System.out.println(arr.get(number).toString());
                    arr.remove(number);
                }
                else{
                    System.out.println("the element does not exist");
                }
                
            }
        }
        iScanner.close();
    }
}