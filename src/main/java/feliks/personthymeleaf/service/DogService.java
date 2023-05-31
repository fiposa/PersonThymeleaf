package feliks.personthymeleaf.service;

import feliks.personthymeleaf.model.Dog;
import feliks.personthymeleaf.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    private final DogRepository dogRepository;

    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public List<Dog> findAll(){
        return dogRepository.findAll();
    }


}
