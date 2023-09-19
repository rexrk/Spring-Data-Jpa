package com.raman.learnjpaandhibernate.app;

import com.raman.learnjpaandhibernate.repository.OnePieceJdbcRepository;
import com.raman.learnjpaandhibernate.domain.Characters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class OnePieceJdbcBootstrap implements CommandLineRunner {

//    @Autowired
//    private OnePieceJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Characters(1, "Luffy", "Gum-Gum", true));
//        repository.insert(new Characters(2, "Zoro", "3 Swords-Style", false));
//        repository.insert(new Characters(3, "Nami", "Navigator", false));
//        repository.insert(new Characters(4, "Usopp", "Sniper", false));
//        repository.insert(new Characters(6, "Naruto", "Ninja", false));
//
//        repository.delete(6);
//
//        System.out.println(repository.findById(1));
//        System.out.println(repository.findById(4));
    }
}
