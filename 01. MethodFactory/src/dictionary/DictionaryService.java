package dictionary;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by Konrad on 20.01.2017.
 */
public class DictionaryService {
    private static DictionaryService service;
    private ServiceLoader<Dictionary> loader;

    private DictionaryService() {
        loader = ServiceLoader.load(Dictionary.class);
    }

    public static synchronized DictionaryService getInstance() {
        if (service == null)
            service = new DictionaryService();
        return service;
    }

    public String getDefinition(String word) {
        String def = null;
        Iterator<Dictionary> iter = loader.iterator();
        while (def == null && iter.hasNext()) {
            def = iter.next().getDefinition(word);
        }
        return def;
    }

}
