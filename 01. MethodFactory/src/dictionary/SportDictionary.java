package dictionary;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Konrad on 20.01.2017.
 */
public class SportDictionary implements Dictionary {

    private Map<String, String> dictionary;

    public SportDictionary() {
        dictionary = new TreeMap<>();
        dictionary.put("noga", "piłka nożna");
        dictionary.put("reka", "piłka ręczna");
    }

    @Override
    public String getDefinition(String word) {
        return dictionary.get(word);
    }
}
