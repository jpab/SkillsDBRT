package com.jpabrandao.skillsdbrt.service.impl;

import com.jpabrandao.skillsdbrt.service.SkillService;
import com.jpabrandao.skillsdbrt.domain.Skill;
import com.jpabrandao.skillsdbrt.repository.SkillRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Service Implementation for managing Skill.
 */
@Service
@Transactional
public class SkillServiceImpl implements SkillService{

    private final Logger log = LoggerFactory.getLogger(SkillServiceImpl.class);

    @Inject
    private SkillRepository skillRepository;

    /**
     * Save a skill.
     *
     * @param skill the entity to save
     * @return the persisted entity
     */
    public Skill save(Skill skill) {
        log.debug("Request to save Skill : {}", skill);
        Skill result = skillRepository.save(skill);
        return result;
    }

    /**
     *  Get all the skills.
     *
     *  @return the list of entities
     */
    @Transactional(readOnly = true)
    public List<Skill> findAll() {
        log.debug("Request to get all Skills");
        List<Skill> result = skillRepository.findAll();

        return result;
    }

    @Transactional(readOnly = true)
    public List<Skill> findSkillsProject(Long project) {
        log.debug("Request to get all Skills from a Project ID");
        List<Skill> result = skillRepository.findSkillsProject(project);
        return result;
    }

    /**
     *  Get one skill by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Transactional(readOnly = true)
    public Skill findOne(Long id) {
        log.debug("Request to get Skill : {}", id);
        Skill skill = skillRepository.findOne(id);
        return skill;
    }

    /**
     *  Delete the  skill by id.
     *
     *  @param id the id of the entity
     */
    public void delete(Long id) {
        log.debug("Request to delete Skill : {}", id);
        skillRepository.delete(id);
    }
}
