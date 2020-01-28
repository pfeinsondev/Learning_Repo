public class PuzzleJava {
    public static void main(String[] args) {
        int[] testVals = {3,5,1,2,7,9,8,13,25,32};
        int[] retVals = sumGreaterThanTen(testVals);
        printArray(retVals);
    }
    
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
    
    public static int[] valuesGreaterThanTen(int[] retInd, int[] origArr) {
        int[] retVals = new int[retInd.length];
        for (int i = 0; i < retInd.length; ++i) {
            retVals[i] = origArr[retInd[i]];
        }
        return retVals;
    }
    
    public static boolean tryParseInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    
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
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
