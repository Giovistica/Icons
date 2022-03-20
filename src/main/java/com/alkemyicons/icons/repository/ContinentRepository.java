package com.alkemyicons.icons.repository;

import com.alkemyicons.icons.entity.ContinentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository  extends JpaRepository<ContinentEntity, Long> {


}
