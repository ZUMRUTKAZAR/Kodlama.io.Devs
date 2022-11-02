package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {

    List<Language> getall();

    Language create(Language language);

    Language getid(int id);

    void update(int id, Language language);

    void delete(int id);
}
