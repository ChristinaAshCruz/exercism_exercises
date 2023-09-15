import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        // if the language list is empty, return true
        if (this.languages.isEmpty()) {
            return true;
        }
        return false;
    }

    public void addLanguage(String language) {
        // add given language to list
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        // removes given languages from list
        this.languages.remove(language);
    }

    public String firstLanguage() {
        return this.languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        if (this.languages.contains(language)) {
            return true;
        }
        return false;
    }

    public boolean isExciting() {
        // return true if Karl's lists included Java or Koitlin
        // we have to use 'this.continsLanguage' since we are referring to a method
        // within our object and not maniulating our object values
        return this.containsLanguage("Java") || this.containsLanguage("Kotlin");
    }
}
