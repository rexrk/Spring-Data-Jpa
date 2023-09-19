package com.raman.learnjpaandhibernate.repository;

import com.raman.learnjpaandhibernate.domain.Characters;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class OnePieceJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public void insert(Characters chr) {
        em.merge(chr);
    }

    public void delete(long id) {
        Characters obj = em.find(Characters.class, id);
        em.remove(obj);
    }

    public Characters findById(long id) {
        return em.find(Characters.class, id);
    }

}
