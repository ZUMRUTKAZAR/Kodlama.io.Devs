package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {
    private final LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public boolean isName(Language language){
        List<Language> languages =this.languageRepository.getall();
        boolean result = false;
        for (Language lang : languages){
            if(lang.getName().equalsIgnoreCase(language.getName())) {
                result =true;
            }
        }
    return result;
    }


    @Override
    public List<Language> getall() {
       return languageRepository.getall();
    }

    @Override
    public Language create(Language language) {
        return languageRepository.create(language);
    }


    @Override
    public Language getid(int id) {
        return languageRepository.getId(id);
    }

    @Override
    public void delete(int id) {
    languageRepository.delete(id);
    }

    @Override
    public void update(int id, Language language) {
    }


}
