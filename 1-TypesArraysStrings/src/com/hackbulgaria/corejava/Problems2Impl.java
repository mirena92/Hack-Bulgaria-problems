package com.hackbulgaria.corejava;

import java.util.Arrays;

public class Problems2Impl implements Problems2 {

    public boolean isOdd(int number) {
        if (number == 0)
            return false;
        else {
            if (number % 2 == 0)
                return false;
        }
        return true;
    }

    public boolean isPrime(int number) {
        if (number < 2)
            return false;
        else {
            for (int i = 2; i < number; i++)
                if (number % i == 0)
                    return false;
        }
        return true;
    }

    public int min(int... array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public int kthMin(int k, int[] array) {

        Arrays.sort(array);
        return array[k - 1];
    }

    public float getAverage(int[] array) {
        float sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    public long getSmallestMultiple(int upperBound) {
        // TODO Auto-generated method stub
        return 0;
    }

    public long getLargestPalindrome(long N) {
        while (!isPalindrome((int) N)) {
            N--;
        }
        return (long) N;
    }

    public int[] histogram(short[][] image) {
        // TODO Auto-generated method stub
        return null;
    }

    public long doubleFac(int n) {

        for (int i = n - 1; i > 1; i--)
            n *= i;
        for (int i = n - 1; i > 1; i--)
            n *= i;
        return n;
    }

    public long kthFac(int k, int n) {

        for (int j = 0; j < k; j++) {
            for (int i = n - 1; i > 1; i--)
                n *= i;
        }
        return n;
    }

    public int getOddOccurrence(int[] array) {
        // TODO
        return 0;
    }

    public long pow(int a, int b) {

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    public long maximalScalarSum(int[] a, int[] b) {
        //TODO
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

    public int maxSpan(int[] array) {
        return array.length - 1;
    }

    @Override
    public boolean canBalance(int[] array) {
        int sum = 0;
        int halfSum = 0;

        for (int x : array) {
            sum += x;
        }

        if (sum % 2 == 0) {
            for (int x : array) {
                halfSum += x;
                if (halfSum == sum / 2)
                    return true;
            }
        }
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public String reverseMe(String argument) {
        int size = argument.length();

        StringBuilder reverseArgument = new StringBuilder();
        for (int i = size - 1; i >= 0; i--)
            reverseArgument.append(argument.charAt(i));
        String result = reverseArgument.toString();

        return result;
    }

    @Override
    public String copyEveryChar(String input, int k) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < k; j++) {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }

    @Override
    public String reverseEveryWord(String arg) {
        StringBuilder sb = new StringBuilder();
        String[] array = arg.split("[ ]+");
        for(String s : array) {
            sb.append(reverseMe(s));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override
    public boolean isPalindrome(String argument) {
        int substringSize = argument.length() / 2;
        String str1 = argument.substring(0, substringSize);
        String str2 = new StringBuilder(argument.substring(argument.length() - substringSize)).reverse().toString();

        return str1.equals(str2);
    }

    @Override
    public boolean isPalindrome(int number) {
        String argument = ((Integer) number).toString();
        return isPalindrome(argument);
    }

    @Override
    public int getPalindromeLength(String input) {
        String[] str = input.split("[*]");
        String str0 = new StringBuilder(str[0]).reverse().toString();
        int length = 0;

        for (int i = 0; i < str[0].length(); i++) {
            if (str[1].charAt(i) == str0.charAt(i)) {
                length++;
            } else {
                break;
            }
        }
        return length;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        String[] s = haystack.split(needle);

        return s.length - 1;
    }

    @Override
    public String decodeURL(String input) {
        String output = input.replace("%20", " ").replace("%3A", ":").replace("%3D", "?").replace("%2F", "/");
        return output;
    }

    @Override
    public int sumOfNumbers(String input) {
        int sum = 0;
        String[] output = input.replaceAll("[^-(0-9)]", " ").split("[ ]+");
        for (String s : output) {
            if (!s.isEmpty()) {
                int x = Integer.parseInt(s);
                sum += x;
            }
        }
        return sum;
    }

    @Override
    public boolean areAnagrams(String A, String B) {       
        StringBuilder sb = new StringBuilder(B);
        for(Character c : A.toCharArray()) {
            if((sb.indexOf(c.toString())) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}
