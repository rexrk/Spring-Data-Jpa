package com.raman.learnjpaandhibernate.repository;

import com.raman.learnjpaandhibernate.domain.Characters;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OnePieceSpringDataRepository extends JpaRepository<Characters, Long> {
    //Custom Method to find by Name
    List<Characters>findByName(String name);


}