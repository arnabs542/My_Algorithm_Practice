
public class DeDuplicationI {
    public String deDup(String input) {
        //null check
        if (input == null || input.length() == 0) {
            return input;
        }
        char[] array = input.toCharArray();
        int slow = 0;
        int fast = 0;
        while (fast < array.length) {
            if (array[slow] != array[fast]) {
                slow++;
                array[slow] = array[fast];
                fast++;
            } else {
                fast++;
            }
        }
        return new String(array,0,slow+1);
    }
}
