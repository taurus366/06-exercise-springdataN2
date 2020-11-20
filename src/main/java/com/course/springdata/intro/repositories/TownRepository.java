package com.course.springdata.intro.repositories;
import com.course.springdata.intro.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepository extends JpaRepository<Town,Long>{
}
