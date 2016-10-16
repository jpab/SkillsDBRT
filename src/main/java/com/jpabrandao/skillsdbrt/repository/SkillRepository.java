package com.jpabrandao.skillsdbrt.repository;

import com.jpabrandao.skillsdbrt.domain.Skill;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Spring Data JPA repository for the Skill entity.
 */
@SuppressWarnings("unused")
public interface SkillRepository extends JpaRepository<Skill,Long> {

  @Query("SELECT s FROM Skill s WHERE LOWER(s.project) = LOWER(:project)")
  public List<Skill> findSkillsProject(@Param("project") Long project);


}
