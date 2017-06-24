
public class ReverseString {
    public String reverse(String input) {
        if (input == null || input.length() == 0) { return input; }
        char[] array = input.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            swap(array,left,right);
            left++;
            right--;
        }
        return new String(array);
    }
    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
