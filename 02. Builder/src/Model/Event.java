package Model;

/**
 * Created by kchmiel on 04.02.2017.
 */
public class Event {

   private final int minute;
   private final String msg;

   public Event(int minute, String msg) {
      this.minute = minute;
      this.msg = msg;
   }

   public int getMinute() {
      return minute;
   }

   public String getMsg() {
      return msg;
   }

   @Override
   public String toString() {
      return String.format("\n%d' %s", minute, msg);
   }
}
