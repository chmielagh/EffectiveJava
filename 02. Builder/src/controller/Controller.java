package controller;

import Model.Event;
import Model.Match;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kchmiel on 04.02.2017.
 */
public class Controller {

   public static void main(String[] args) {

      List<Event> events = new LinkedList<Event>(
            Arrays.asList(new Event(0, "Start"), new Event(10, "GOAL! 1-0"), new Event(45, "End of 1. half"),
                  new Event(46, "Start of 2. half"), new Event(78, "Red card fo hosts"), new Event(82, "GOAL! 1-1"),
                  new Event(90, "End. Draw."))) {
      };

      List<String> scorers = new LinkedList<String>(Arrays.asList("Grosicki", "Lalana"));

      Match match1 = new Match.MatchBuilder("2017/02/04", "Hull City", "Liverpool").referee("Mark Clattenberg")
            .score("1-1").time("16:00")
            .events(events.get(0), events.get(1), events.get(2), events.get(3), events.get(4), events.get(5))
            .scorers(scorers.get(0), scorers.get(1)).build();

      System.out.println(match1);
   }
}
