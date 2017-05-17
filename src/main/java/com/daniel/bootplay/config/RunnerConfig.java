package com.daniel.bootplay.config;

import com.daniel.bootplay.domain.Album;
import com.daniel.bootplay.domain.Artist;
import com.daniel.bootplay.domain.Gender;
import com.daniel.bootplay.repository.AlbumRepository;
import com.daniel.bootplay.repository.ArtistRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by dipengfei on 16/05/2017.
 */
@Configuration
public class RunnerConfig {

    private static final Logger logger = LoggerFactory.getLogger(RunnerConfig.class);

    @Bean
    public CommandLineRunner dataInitRunner(ArtistRepository artistRepository, AlbumRepository albumRepository) {

        return args -> {

            Artist jc = artistRepository.save(new Artist(
                    null,
                    "Jay Chou",
                    Gender.Male,
                    LocalDate.parse("1979-01-18"),
                    "Taiwan"));

            Album jc1 = new Album();
            jc1.setName("Jay");
            jc1.setArtist(jc);
            jc1.setYear("2000");
            jc1.setTracks(10);
            jc1.setGenre("R&B");

            Album jc2 = new Album();
            jc2.setName("Fantasy");
            jc2.setArtist(jc);
            jc2.setYear("2001");
            jc2.setTracks(10);
            jc2.setGenre("R&B");

            Album jc3 = new Album();
            jc3.setName("The Eight Dimensions");
            jc3.setArtist(jc);
            jc3.setYear("2002");
            jc3.setTracks(10);
            jc3.setGenre("R&B");


            Artist ts = artistRepository.save(new Artist(
                    null,
                    "Taylor Swift",
                    Gender.Female,
                    LocalDate.parse("1989-12-13"),
                    "America"));

            Album ts1 = new Album();
            ts1.setName("Taylor Swift");
            ts1.setArtist(ts);
            ts1.setYear("2006");
            ts1.setTracks(15);
            ts1.setGenre("Country");

            Album ts2 = new Album();
            ts2.setName("Fearless");
            ts2.setArtist(ts);
            ts2.setYear("2008");
            ts2.setTracks(13);
            ts2.setGenre("Country");

            Album ts3 = new Album();
            ts3.setName("Speak Now");
            ts3.setArtist(ts);
            ts3.setYear("2010");
            ts3.setTracks(14);
            ts3.setGenre("Pop");

            Album ts4 = new Album();
            ts4.setName("Red");
            ts4.setArtist(ts);
            ts4.setYear("2012");
            ts4.setTracks(16);
            ts4.setGenre("Pop");

            Album ts5 = new Album();
            ts5.setName("1989");
            ts5.setArtist(ts);
            ts5.setYear("2014");
            ts5.setTracks(13);
            ts5.setGenre("Pop");


            Artist oo = artistRepository.save(new Artist(
                    null,
                    "Olivia Ong",
                    Gender.Female,
                    LocalDate.parse("1985-12-02"),
                    "Singapore"));

            Album oo1 = new Album();
            oo1.setName("A Girl Meets Bossanova");
            oo1.setArtist(oo);
            oo1.setYear("2005");
            oo1.setTracks(8);
            oo1.setGenre("Jazz");

            Album oo2 = new Album();
            oo2.setName("A Girl Meets Bossanova 2");
            oo2.setArtist(oo);
            oo2.setYear("2006");
            oo2.setTracks(10);
            oo2.setGenre("Jazz");

            Album oo3 = new Album();
            oo3.setName("Summer Night");
            oo3.setArtist(oo);
            oo3.setYear("2010");
            oo3.setTracks(16);
            oo3.setGenre("Jazz");

            Album oo4 = new Album();
            oo4.setName("Romance");
            oo4.setArtist(oo);
            oo4.setYear("2011");
            oo4.setTracks(10);
            oo4.setGenre("Jazz");

            artistRepository.findAll().forEach(artist -> logger.info("find Artist : {}", artist));

            albumRepository.save(Arrays.asList(jc1, jc2, jc3, ts1, ts2, ts3, ts4, ts5, oo1, oo2, oo3, oo4))
                           .forEach(album -> logger.info("find album : {}", album));

        };
    }
}
