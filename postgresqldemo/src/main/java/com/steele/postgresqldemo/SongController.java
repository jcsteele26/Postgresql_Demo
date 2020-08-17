package com.steele.postgresqldemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class SongController{

    @Autowired
    SongRepository songRepository;

    @PostMapping("/post")
    public void postSong(@RequestBody Song title){
        songRepository.save(title);
    }

    //@PostMapping("/forcepost")
    //public void forcePostSong(){
    //    songRepository.save(new Song("Get Jiggy", "Will Smith", "Get jiggy with it", "Pop"));
    //}



    @GetMapping("/all")
    public List<Song> getSong(){
        return songRepository.findAll();
    }

    //@GetMapping("/{title}")
    //public Song getNameByTitle(@PathVariable String title){
    //    return songRepository.findByName(title);
    //}

    @GetMapping("/")
    public String getWelcome(){
        return "Welcome to my Backend Fam";
    }
}