package com.jpabrandao.skillsdbrt.repository;

import com.jpabrandao.skillsdbrt.domain.Skill;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Skill entity.
 */
@SuppressWarnings("unused")
public interface SkillRepository extends JpaRepository<Skill,Long> {

}
