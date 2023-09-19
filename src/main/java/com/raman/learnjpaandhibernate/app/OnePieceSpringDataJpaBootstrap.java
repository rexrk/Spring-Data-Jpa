package com.raman.learnjpaandhibernate.app;

import com.raman.learnjpaandhibernate.domain.Characters;
import com.raman.learnjpaandhibernate.repository.OnePieceSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OnePieceSpringDataJpaBootstrap implements CommandLineRunner {

    @Autowired
    private OnePieceSpringDataRepository repository;

    @Override
    public void run(String... args) throws Exception {
        //Insert into Database
        repository.save(new Characters(1, "Luffy", "Rubber Man", true));
        repository.save(new Characters(2, "Zoro", "3 Swords-Style Swordsman", false));
        repository.save(new Characters(3, "Nami", "Navigator", false));
        repository.save(new Characters(4, "Usopp", "Sniper", false));
        repository.save(new Characters(6, "Naruto", "Ninja", false));

        //Delete from Database
        repository.deleteById(6L);

        //Fetch from Database
        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
        System.out.println(repository.findAll() + "\n");

        //Additional Methods
        System.out.println("Repository count : " + repository.count());

        //Custom Method
        System.out.println(repository.findByName("Zoro"));
        System.out.println((repository.findByName("") == null ? "found" : "not found"));
    }
}