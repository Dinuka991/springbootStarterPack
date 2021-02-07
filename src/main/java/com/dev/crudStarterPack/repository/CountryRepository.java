package com.dev.crudStarterPack.repository;

import com.dev.crudStarterPack.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country , Long> {
}
