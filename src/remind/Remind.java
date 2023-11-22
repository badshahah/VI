
package remind;


public class Remind {

      public static int findRemind(int A, int B, int expectedReminder) {
        int reminder = A % B;
        if (reminder == expectedReminder) {
            return reminder;
        } 
        else {
            return -1;
        }
    }
}
