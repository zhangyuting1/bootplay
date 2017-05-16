package com.daniel.bootplay.web;

import com.daniel.bootplay.domain.Album;
import com.daniel.bootplay.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dipengfei on 16/05/2017.
 */
@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @GetMapping
    public List<Album> all() {
        return albumRepository.findAll();
    }

    @GetMapping("/{id}")
    public Album one(@PathVariable Long id) {
        return albumRepository.findOne(id);
    }
}
