package pl.csanecki.webflux.club;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ClubApi {

    private ClubRepo clubRepo;

    @Autowired
    public ClubApi(ClubRepo clubRepo) {
        this.clubRepo = clubRepo;
    }

    @GetMapping
    public Flux<Club> getAllClubs() {
        return clubRepo.findAll();
    }
}
