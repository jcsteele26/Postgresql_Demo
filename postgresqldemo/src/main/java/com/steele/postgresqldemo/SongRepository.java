package com.steele.postgresqldemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {

   // Song findByName(String title);
    
} 