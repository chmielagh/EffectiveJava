package Model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by kchmiel on 04.02.2017.
 */
public class Match {

   // require

   private final String date; // yyyy/mm/dd
   private final String host;
   private final String guest;

   //optional

   private final String time; // hh:mm
   private final String referee;
   private final String score; // X:Y
   private final List<Event> events;
   private final List<String> scorers;

   public Match(MatchBuilder matchBuilder) {
      this.date = matchBuilder.date;
      this.host = matchBuilder.host;
      this.guest = matchBuilder.guest;
      this.time = matchBuilder.time;
      this.referee = matchBuilder.referee;
      this.score = matchBuilder.score;
      this.events = matchBuilder.events;
      this.scorers = matchBuilder.scorers;
   }

   @Override
   public String toString() {
      return String.format("%s %s %s %s %s\nReferee: %s\n%s", date, time, host, score, guest, referee, events);
   }

   public static class MatchBuilder implements Builder<Match> {

      private final String date;
      private final String host;
      private final String guest;
      private String time = "00:00";
      private String referee = "UNKNOWN";
      private String score = "0:0";
      private List<Event> events;
      private List<String> scorers;

      public MatchBuilder(String date, String host, String guest) {
         this.date = date;
         this.host = host;
         this.guest = guest;
         events = new LinkedList<>();
         scorers = new LinkedList<>();
      }

      public MatchBuilder time(String val) {
         this.time = val;
         return this;
      }

      public MatchBuilder referee(String val) {
         this.referee = val;
         return this;
      }

      public MatchBuilder score(String val) {
         this.score = val;
         return this;
      }

      public MatchBuilder events(Event... vals) {
         for (Event event : vals) {
            events.add(event);
         }
         return this;
      }

      public MatchBuilder scorers(String... vals) {
         for (String scorer : vals) {
            scorers.add(scorer);
         }
         return this;
      }

      public Match build() {
         return new Match(this);
      }
   }

}
