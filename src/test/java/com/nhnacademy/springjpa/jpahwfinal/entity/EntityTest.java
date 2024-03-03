package com.nhnacademy.springjpa.jpahwfinal.entity;

import com.nhnacademy.springjpa.jpahwfinal.config.RootConfig;
import com.nhnacademy.springjpa.jpahwfinal.config.WebConfig;
import com.nhnacademy.springjpa.jpahwfinal.entity.Resident;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@Transactional
@ContextHierarchy({
        @ContextConfiguration(classes = RootConfig.class),
        @ContextConfiguration(classes = WebConfig.class)
})
public class EntityTest {
    @PersistenceContext
    private EntityManager em;

    @Test
    void residentTest(){
        Resident resident = em.find(Resident.class, 1);
        assertThat(resident.getName()).isEqualTo("남길동");

    }



}
