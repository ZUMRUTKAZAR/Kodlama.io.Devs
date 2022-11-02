package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.PortUnreachableException;
import java.util.List;

@RestController //anotasyon yani bilgilendirme ifadesi buranın erişim noktası olduğunu ifade ediyor.
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall") //listelemek
    public List<Language> getall() {
        return languageService.getall();
    }
    @PostMapping("/create") // eklemek
    public Language create(@RequestBody Language language) {
        return languageService.create(language);

    }
    @DeleteMapping("/delete/{id}") //silmek
    public void delete (@PathVariable int id) {
        languageService.delete(id);

    }

    @PutMapping("/update") //güncellemek
    public void update(@PathVariable int id, @RequestBody Language language) {
        languageService.update(id, language);
    }

    @GetMapping("/get/id") //id ile getirmek
    public Language getId(@PathVariable int id){
        return languageService.getid(id);
    }
}
