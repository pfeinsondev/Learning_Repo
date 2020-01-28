import java.util.*;

public class PuzzleJava {
    public static void main(String[] args) {
        // Problem 1
        /*
        int[] testVals = {3,5,1,2,7,9,8,13,25,32};
        int[] retVals = sumGreaterThanTen(testVals);
        printArray(retVals); */
        // Problem 2
        /*
        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        printArray(shuffleAndQuery(names));
        */
        // Problem 3
        /*
        String[] letters = buildAlphabet();
        Collections.shuffle(Arrays.asList(letters));
        printFirstAndLast(letters);
        */
        // Problem 4
        /*
        int[] randomNumbers = generateRandomArray(100, 55);
        printArray(randomNumbers);
        */
        // Problem 5
        /* 
        int[] randomNumbers = generateRandomArray(100, 55);
        Arrays.sort(randomNumbers);
        printArray(randomNumbers);
        */
        // Problem 6
        // Ascii lowercase 97 to 122
        // Ascii uppercase 65 to 90
        /* 
        System.out.println(generateRandomString(5));
        */
        // Problem 7
        /*
        printArray(generateRandomStringArray(10));
        */
        
    }
    
//=================================
//          Problem 7
//=================================
    public static String[] generateRandomStringArray(int length) {
        String[] randomStrings = new String[length];
        for (int i = 0; i < length; ++i) {
            randomStrings[i] = generateRandomString(5);
        }
        return randomStrings;
    }
//=================================
//          Problem 6
//=================================
    public static String generateRandomString(int length) {
        Random ranGen = new Random();
        String ranString = "";
        for (int i = 0; i < 5; ++i) {
            ranString += (char)(ranGen.nextInt(123-97)+97);
        }
        return ranString;
    }
    
//=================================
//          Problem 4 + 5
//=================================
    public static int[] generateRandomArray(int max, int min) {
        int[] values = new int[10];
        Random ranGen = new Random();
        values[0] = ranGen.nextInt(max-min)+min;
        int minVal = values[0];
        int maxVal = min;
        for (int i = 1; i < 10; ++i) {
            values[i] = ranGen.nextInt(max-min)+min;
            if (values[i] < minVal) minVal = values[i];
            if (values[i] > maxVal) maxVal = values[i];
        }
        System.out.println("Min: " + minVal + " Max: " + maxVal);
        return values;
    }
    
    
//=================================
//          Problem 3
//=================================
    public static String[] buildAlphabet() {
        String[] letters = new String[26];
        char c;
        int index = 0;
        for (c = 'a'; c <= 'z'; ++c) {
            letters[index++] = c + "";
        }
        return letters;
    }
    
    public static void printFirstAndLast(String[] letters) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        List vowelsAsList = Arrays.asList(vowels);
        System.out.println(letters[0] + " " + letters[letters.length-1]);
        if (vowelsAsList.contains(letters[0]))
            System.out.println("First letter is a vowel");
        System.out.println();
    }
    
//=================================
//          Problem 2
//=================================
    public static String[] shuffleAndQuery(String[] names) {
        int numNamesLongerThanFive = 0; 
        Collections.shuffle(Arrays.asList(names));
        printArray(names);
        for (int i = 0; i < names.length; ++i) {
            if (names[i].length() > 5) {
                numNamesLongerThanFive++;
            }
        }
        String[] namesLongerThanFive = new String[numNamesLongerThanFive];
        int currentIndex = 0;
        for (int i = 0; i < names.length; ++i) {
            if (names[i].length() > 5) {
                namesLongerThanFive[currentIndex++] = names[i];
            }
        }
        return namesLongerThanFive;
    }
    
    public static void printArray(String[] input) {
        System.out.print("[" + input[0]);
        for (int i = 1; i < input.length; ++i) {
            System.out.print(", " + input[i]);
        }
        System.out.println("]");
    }
    
//=======================================    
//              Problem 1
//=======================================
    // Returns the values in a given array that are greater than 10
    // Prints the total of the array
    public static int[] sumGreaterThanTen(int[] input) {
        int total = 0;
        int newSize = 0;
        String valIndices = "";
        for (int i = 0; i < input.length; ++i) {
            total += input[i];
            if (input[i] > 10) {
                ++newSize;
                valIndices += (i + ":");
            }
        }
        System.out.println(total);
        int[] returnIndices = new int[newSize];
        for (int i = 0; i < newSize; ++i) {
            returnIndices[i] = (extractValue(valIndices));
            valIndices = valIndices.substring(2);
        }
        return valuesGreaterThanTen(returnIndices, input);
    }
    
    
    /* Helper Methods for Puzzle 1 */
    // Create Array of actual values stored in the original Array that correspond 
    // with the indices listed in retInd (the indices of numbers greater than 10)
    public static int[] valuesGreaterThanTen(int[] retInd, int[] origArr) {
        int[] retVals = new int[retInd.length];
        for (int i = 0; i < retInd.length; ++i) {
            retVals[i] = origArr[retInd[i]];
        }
        return retVals;
    }
    
    // Extracts (returns) a single int value from a Sting containing at least 1 in syntax "int:int:int:"
    public static int extractValue(String input) {
        String intValue = "";
        while (input.charAt(0) != ':') {
            intValue += input.substring(0,1);
            input = input.substring(1);
        }
        if (tryParseInt(intValue)) {
            return Integer.parseInt(intValue);
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    // Validates that a String can be convereted to an int
    public static boolean tryParseInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    // print contentse of array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
