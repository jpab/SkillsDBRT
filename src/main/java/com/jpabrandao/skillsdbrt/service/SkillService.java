package com.jpabrandao.skillsdbrt.service;

import com.jpabrandao.skillsdbrt.domain.Skill;

import java.util.List;

/**
 * Service Interface for managing Skill.
 */
public interface SkillService {

    /**
     * Save a skill.
     *
     * @param skill the entity to save
     * @return the persisted entity
     */
    Skill save(Skill skill);

    /**
     *  Get all the skills.
     *
     *  @return the list of entities
     */
    List<Skill> findAll();

        /**
         *  Get all the skills from a project id.
         *
         *  @return the list of entities
         */
    List<Skill> findSkillsProject(Long project);

    /**
     *  Get the "id" skill.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    Skill findOne(Long id);

    /**
     *  Delete the "id" skill.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
