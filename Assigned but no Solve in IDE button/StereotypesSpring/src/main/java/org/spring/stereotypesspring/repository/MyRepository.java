package org.spring.stereotypesspring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    // String could be any entity
    public void save(String stringEntity) {
       //Implement Persistence
    }

    public String findById(Long id) {
        // Implement id search
        return "dummy String to replace entity";
    }

}
