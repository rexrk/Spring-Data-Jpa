package com.raman.learnjpaandhibernate.repository;

import com.raman.learnjpaandhibernate.domain.Characters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OnePieceJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(Characters chr) {
        jdbcTemplate.update("INSERT INTO ONE_PIECE VALUES ( ?, ?, ?, ? )",
                chr.getId(), chr.getName(), chr.getPower(), chr.getFruit_powers());
    }

    public void delete(long id) {
        String sql = "DELETE FROM ONE_PIECE WHERE ID=?";
        jdbcTemplate.update(sql, id);
    }

    public Characters findById(long id) {
        String sql = "SELECT * FROM ONE_PIECE WHERE ID=?";
         return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Characters.class), id);

    }

}
