public class FrequencyCounter {

    // Function to find the first occurrence of a key
    public static int firstOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                result = mid;
                right = mid - 1; // Keep searching on the left side
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Function to find the last occurrence of a key
    public static int lastOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                result = mid;
                left = mid + 1; // Keep searching on the right side
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Function to count frequency using binary search
    public static int countFrequency(int[] arr, int key) {
        int first = firstOccurrence(arr, key);
        if (first == -1) {
            return 0; // Key not found
        }
        int last = lastOccurrence(arr, key);
        return last - first + 1;
    }

    // Main method to test
    public static void main(St
