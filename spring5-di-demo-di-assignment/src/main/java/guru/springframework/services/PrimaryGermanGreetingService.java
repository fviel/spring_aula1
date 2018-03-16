package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    //FERNANDO - falta adicionar o bean... posso fazer por setter, contructor e property, fiz por constructor, então nem preciso da @Autowired
    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    
    
    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
