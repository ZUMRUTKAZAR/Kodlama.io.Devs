package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.List;

//Repository genellikle veri tabanı işleri yapacak sınıflara verdiğimiz isimlerdir bunlar dao olarakta isimlendirilebilir.
//@Repository
public interface LanguageRepository {
    //markaları listeleyeceğiz birden fazla olduğu için array bazlı yapıcaz.

    List<Language> getall();
    Language create(Language language);
    Language getId(int id);
    void delete(int id);

}
