package com.app.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface WordRepository extends JpaRepository<Word, Long> {

}
