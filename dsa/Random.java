package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Random {
    void getSum() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        int[][] arr3 = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == (arr[i].length - 1)) || (i == arr.length - 1 && j == (arr[i].length - 1))) {
                    arr3[i][j] = arr[i][j] + arr2[i][j];
//                    System.out.println("c");
                } else {
                    arr3[i][j] = arr[i][j];
                }

            }
        }
        for (int[] ar : arr3) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    void revar() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    void secLArgest() {
        int[] arr = {1, 2, 6, 4, 88, 5, 6, 7, 8};
        int largest = arr[0], secondl = 0;
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondl = largest;
                largest = arr[i];
            } else if (arr[i] > secondl && arr[i] != largest) {
                secondl = arr[i];  // Update only if it's smaller than largest
            }

        }
        System.out.println("second--" + secondl + "lar--" + largest);
    }

    void removeDuplicate() {
        int[] arr = {1, 2, 88, 4, 88, 5, 6, 7, 8, 4};
        for (int i = 0; i < arr.length; i++) {//selection sort(places element at right possion with each iteration )
            int minIndex = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    void findmissing() {
//        Limitations of This Code
//Only works for one missing number
//
//Requires the array to be sorted and continuous
        int[] arr = {1, 3, 4, 5, 6};
        //5️⃣ Find the Missing Number in an array of 1 to N
        int ij = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ij) {
                System.out.println(ij);
                return;
            }
            ij++;
        }
    }

    void rotate() {
        int[] arr = {1, 3, 4, 5, 6};
        int k = 2;
        while (k > 0) {
            int last = arr.length - 1;
            int temp = arr[last];
            while (last > 0) {
                arr[last] = arr[last - 1];
                last--;
            }
            arr[0] = temp;
            k--;
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }

//    strings

    void revstr() {
        String str = "akshit";
        String ss = "";
        int lastIndex = str.length() - 1;
        while (0 <= lastIndex) {
            char ch = str.charAt(lastIndex);
            ss = ss + ch;
            lastIndex--;
        }
        System.out.println(ss);
    }

    void removeDupl() {
        String str = "akkkkshkit";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            if (!seen[c]) {  // If the character is not seen before
                // char ch = 'A';  // ASCII value of 'A' is 65
                //   seen[ch] = true; // Equivalent to seen[65] = true
                seen[c] = true;
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }

    void strAnagram() {
        String str = "akshit";
        String str2 = "tihaks";
        // Convert strings to character arrays
        char[] arr1 = str.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Convert sorted arrays back to strings
        String sortedStr1 = new String(arr1);
        String sortedStr2 = new String(arr2);

        // Check if sorted strings are equal (Anagram check)
        System.out.println(sortedStr1.equals(sortedStr2)); // Output: true
    }

    void elecount() {
        String str = "akshaita";
        char toBeCount = 'a';
        char ch[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            char ele = ch[i];
            if (ele == toBeCount) {
                count++;
            }
        }
        System.out.println(count);
    }

    void fun20() {
        String str = "aks hai ta";
        String ss = "%20";
        String[] ch = str.split(" ");
        for (int i = 0; i < ch.length; i++) {
            ss += ch[i] + "20%"; // Add word + "20%"
        }
        System.out.println(ss);
    }

    void totitle() {
        String str = "What is youR NAME";
        str = str.toLowerCase();
        StringBuilder strbuil = new StringBuilder();
        boolean needToConvert = true;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (needToConvert) {
                strbuil.append((char) (ch - 32));
                needToConvert = false;
            } else {
                strbuil.append(ch);
            }
            if (ch == ' ') {
                needToConvert = true;
            }
        }
        System.out.println(strbuil);
    }

    void largestsubstr() {
        String str = "abbbcabcbb";
        String result = "";
        boolean[] seen = new boolean[256];
        result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                result = result + ch;
                seen[ch] = true;
            }
        }
        System.out.println(result);
    }

    void checkRotatedStrings() {
        String str = "abcde", s2 = "pdeab";
        if (str.length() != s2.length()) {
            System.out.println("false");
        }
        char[] chstr = str.toCharArray();
        char[] chstr2 = s2.toCharArray();
        Arrays.sort(chstr);
        Arrays.sort(chstr2);
        boolean notFound = true;
        for (int i = 0; i < chstr.length; i++) {
            if (chstr2[i] != chstr[i]) {
                notFound = false;
                break;
            }
        }
        System.out.println(notFound ? "true" : "false");

    }

    void strWordsRev() {
        String str = "Akshit chotu buski";
        StringBuilder resulr = new StringBuilder();
        String[] ss = str.split("\\s+");
        for (String sss : ss) {
            System.out.println(sss);
        }
        System.out.println(ss.length - 1);
        for (int i = ss.length - 1; i >= 0; i--) {
            resulr.append(ss[i] + " ");
        }
        System.out.println(resulr);
    }

    public static void main(String[] args) {
//        String str= "abcde",  s2= "pdeab";
//
//                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//                int[] arr2 = {1, 2, 4, 4, 5, 6, 7, 8};
//                ArrayList<Integer> arr3 = new ArrayList<>();
//                for (int i = arr.length - 1; i >= 0; i--) { // ✅ Start from arr.length - 1
//                    int sum = arr[i] + arr2[i];
//
//
//                    if (sum > 9) {
//                        String temp = String.valueOf(sum);
//                        String[] sumstr=temp.split("");
//                        arr3.add(Integer.parseInt(sumstr[1]));
//                        arr3.add(Integer.parseInt(sumstr[0]));
//
//                    }else{
//                        arr3.add(sum);
//                    }
//                }
//                Collections.reverse(arr3);
//                for(int i:arr3){
//                    System.out.print(i+" ");
//                }
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ar2 = {5, 6, 7, 8};
        int k = 0,greatest=42;
        int[] products = new int[ar.length];
        for (int i = 0; i < ar2.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                products[k] = ar[i] * ar[j];

                if(products[k]==greatest){
                    greatest=products[k];
                   continue;

                }
                k++;
            }
        }
        for (int w:products){
            System.out.println(w);
        }
        System.out.println(greatest);

    }
}

//🔹 Array Programs
//1️⃣ Reverse an Array (without using built-in methods)
//2️⃣ Find the Second Largest Element in an array
//3️⃣ Remove Duplicates from an Array
//4️⃣ Merge Two Sorted Arrays into a single sorted array
//5️⃣ Find the Missing Number in an array of 1 to N
//6️⃣ Rotate an Array by K positions (left/right)
//7️⃣ Find the Majority Element (element that appears more than N/2 times)
//8️⃣ Find Pair of Numbers That Sum to a Target
//9️⃣ Sort an Array Using QuickSort / MergeSort
//🔟 Find the Intersection of Two Arrays (common elements)
//
//🔹 String Programs
//1️⃣ Reverse a String (without using built-in functions)
//2️⃣ Check if a String is a Palindrome
//3️⃣ Count Vowels and Consonants in a string
//4️⃣ Remove Duplicate Characters from a string
//5️⃣ Find the First Non-Repeating Character
//6️⃣ Check if Two Strings Are Anagrams
//🔹 Definition: Two strings are anagrams if they contain the same characters in the same frequency but in different order.
//
//📌 Example:
//Input:  "listen", "silent"
//Output: true
//
//Input:  "hello", "world"
//Output: false
//
//        --------------------------------------------------
//
//        7️⃣ Count Occurrences of a Character in a String
//🔹 Definition: Find how many times a specific character appears in a given string.
//
//        📌 Example:
//Input:  "banana", 'a'
//Output: 3
//
//Input:  "Mississippi", 's'
//Output: 4
//
//        --------------------------------------------------
//
//        8️⃣ Convert a String to Title Case (First Letter Capitalized)
//🔹 Definition: Convert the first letter of each word in a sentence to uppercase and the rest to lowercase.
//
//📌 Example:
//Input:  "hello world, java is fun"
//Output: "Hello World, Java Is Fun"
//
//Input:  "tHIS is A teSt"
//Output: "This Is A Test"
//
//        --------------------------------------------------
//
//        9️⃣ Find the Longest Substring Without Repeating Characters
//🔹 Definition: Find the longest substring in a given string where no character repeats.
//

//        📌 Example:
//Input:  "abcabcbb"
//Output: "abc" (length: 3)
//
//Input:  "bbbbb"
//Output: "b" (length: 1)
//
//Input:  "pwwkew"
//Output: "wke" (length: 3)
//
//        --------------------------------------------------
//
//        🔟 Check if a String is a Rotation of Another String
//🔹 Definition: A string is a rotation of another if we can shift characters in a circular manner to match the other.
//
//        📌 Example:
//Input:  "abcde", "cdeab"
//Output: true
//
//Input:  "hello", "llohe"
//Output: true
//
//Input:  "hello", "world"
//Output: false
//
