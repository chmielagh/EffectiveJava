package Controller;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by kchmiel on 04.02.2017.
 */
class ControllerTest {

   private Map<String, String> map;
   private Set<String> set;

   @org.junit.jupiter.api.BeforeEach
   void setUp() {
      map = new HashMap<>();
      map.put("a", "a");
      map.put("b", "b");
   }

   @org.junit.jupiter.api.AfterEach
   void tearDown() {

   }

   @Test
   void testIfKeySetReturnsImmutableSet() {
      set = map.keySet();
      assertEquals(set.size(), 2);
      map.put("c", "c");
      assertEquals(set.size(), 3);
   }

}