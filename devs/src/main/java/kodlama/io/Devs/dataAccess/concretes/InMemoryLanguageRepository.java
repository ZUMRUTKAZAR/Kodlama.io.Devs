package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"C#"));
        languages.add(new Language(2,"Java"));
        languages.add(new Language(3,"Python"));
        languages.add(new Language(4,"Matlab"));
    }



    @Override
    public List<Language> getall() {
        return languages;
    }

    @Override
    public Language create(Language language) {
       languages.add(language);
        return language;
    }

    @Override
    public Language getId(int id) {
        languages.get(id);
        return null;
    }

    @Override
    public void delete(int id) {
       Language language = getId(id);
       languages.remove(language);
    }

}
