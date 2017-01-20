package Controller;

import dictionary.DictionaryService;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Created by Konrad on 20.01.2017.
 */
public class DictionaryControllerTest {

    DictionaryService service;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        service = DictionaryService.getInstance();
    }

    @org.testng.annotations.Test
    public void testMain() throws Exception {
        assertEquals(service.getDefinition("noga"), "piłka nożna");
        assertEquals(service.getDefinition("IBU"), "goryczka");
        assertNull(service.getDefinition("unknown"));
    }


}