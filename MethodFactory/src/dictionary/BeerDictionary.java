package dictionary;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Konrad on 20.01.2017.
 */
public class BeerDictionary implements Dictionary {

    Map<String, String> dictionary;

    public BeerDictionary() {
        dictionary = new TreeMap<>();
        dictionary.put("plato", "ekstrakt");
        dictionary.put("IBU", "goryczka");
        dictionary.put("voltage", "siła");
    }

    @Override
    public String getDefinition(String word) {
        return dictionary.get(word);
    }
}
