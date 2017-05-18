package com.daniel.bootplay.web;

import com.daniel.bootplay.domain.Artist;
import com.daniel.bootplay.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangyuting on 18/05/2017.
 */
@RestController
@RequestMapping("/artists")
public class ArtistController {

    @Autowired
    private ArtistRepository artistRepository;

    @GetMapping
    public List<Artist> all() {
        return artistRepository.findAll();
    }

    @GetMapping("{/id}")
    public Artist one(@PathVariable Long id) {
        return artistRepository.findOne(id);
    }


}
