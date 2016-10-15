package com.jpabrandao.skillsdbrt.service;

import com.jpabrandao.skillsdbrt.domain.Project;

import java.util.List;

/**
 * Service Interface for managing Project.
 */
public interface ProjectService {

    /**
     * Save a project.
     *
     * @param project the entity to save
     * @return the persisted entity
     */
    Project save(Project project);

    /**
     *  Get all the projects.
     *  
     *  @return the list of entities
     */
    List<Project> findAll();

    /**
     *  Get the "id" project.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    Project findOne(Long id);

    /**
     *  Delete the "id" project.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
