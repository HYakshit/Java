import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[] ararray1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = new int[5];
        String str1 = "", str2 = "";
        Scanner in = new Scanner(System.in);
// Array --------------------------------------------------------------------------------------------
insert
//        System.out.println("Enter second array(5 elements)");
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = in.nextInt();
//        }
//        interset(ararray1, array2);
//        union(ararray1, array2);
//        strings---------------------------------------------------------------------------------------------
//           System.out.println("enter two strings");
//    str1 = in.nextLine();
//    str2 = in.nextLine();
//        interset(str1, str2);
    }

//    static void interset(String str1, String str2) {
//        int[] ar1 =int()
//        System.out.println("interset");
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if (array1[i] == array2[j]) {
//                    System.out.print(array1[i] + " ");
//                    break; // Move to the next element in array1
//                }
//            }
//        }
//    }

    static void interset(int[] array1, int[] array2) {
        System.out.println("interset");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break; // Move to the next element in array1
                }
            }
        }
    }

    static void union(int[] array1, int[] array2) {
        System.out.println("Union:");

        // Print elements from array2 that are not in array1
        for (int i = 0; i < array2.length; i++) {
            boolean foundInArray1 = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    foundInArray1 = true;
                    break;
                }
            }
            if (!foundInArray1) {
                System.out.print(array2[i] + " ");
            }
        }

        // Print elements from array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println(); // Move to the next line
    }

}

