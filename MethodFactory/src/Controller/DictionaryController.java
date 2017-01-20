package Controller;

import dictionary.DictionaryService;

/**
 * Created by Konrad on 20.01.2017.
 */
public class DictionaryController {

    public static void main(String[] args) {
        DictionaryService instance = DictionaryService.getInstance();
        System.out.println(instance.getDefinition("noga"));
        System.out.println(instance.getDefinition("IBU"));
        System.out.println(instance.getDefinition("SD"));
    }
}
