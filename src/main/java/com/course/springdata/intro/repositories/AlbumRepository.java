package com.course.springdata.intro.repositories;
import com.course.springdata.intro.entity.Album;
import com.course.springdata.intro.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long>{
}
