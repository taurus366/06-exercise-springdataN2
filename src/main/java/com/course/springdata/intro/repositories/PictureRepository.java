package com.course.springdata.intro.repositories;
import com.course.springdata.intro.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends JpaRepository<Picture,Long>{
}
