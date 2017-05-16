package com.daniel.bootplay.repository;

import com.daniel.bootplay.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dipengfei on 16/05/2017.
 */
public interface AlbumRepository extends JpaRepository<Album, Long>{
}
