import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        // if the language list is empty, return true
        if (this.languages.isEmpty()) {
            return true;
        }
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
        String result = this.languages.get(0);
        return result;
    }

    public int count() {
        int total = this.languages.length();
        return total;
    }

    public boolean containsLanguage(String language) {
        if (this.languages.contains(language)) {
            return true;
        }
        return false;
    }

    public boolean isExciting() {
        if (!isExciting()) {
            this.languages.set(false);
        }
        this.languages.set(true);
    }
}
