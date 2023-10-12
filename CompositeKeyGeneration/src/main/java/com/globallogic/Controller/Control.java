package com.globallogic.Controller;

import java.util.List;
import com.globallogic.Entity.Song;
import com.globallogic.Entity.SongId;
import com.globallogic.Repository.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/id")
public class Control {
    @Autowired
    private SongRepo songRepo;
    @PostMapping("")
    public ResponseEntity<Song> save(@RequestBody Song song)
    {
       return new ResponseEntity<>(songRepo.save(song), HttpStatus.OK);
    }
    @GetMapping("")
    public ResponseEntity<List<Song>> getAll()
    {
        return new ResponseEntity<>(songRepo.findAll(),HttpStatus.OK);

    }
    @GetMapping("/{id}/{name}")
    public ResponseEntity<Song> getById( @PathVariable int id,@PathVariable String name)
    {
        SongId songId=new SongId(id,name);
        return new ResponseEntity<>(songRepo.findById(songId).get(),HttpStatus.OK);
//        System.out.println(songRepo.findById(id).get());
    }
}
