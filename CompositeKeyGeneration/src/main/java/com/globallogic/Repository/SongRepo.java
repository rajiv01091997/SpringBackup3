package com.globallogic.Repository;

import com.globallogic.Entity.Song;
import com.globallogic.Entity.SongId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepo extends JpaRepository<Song, SongId> {

}
