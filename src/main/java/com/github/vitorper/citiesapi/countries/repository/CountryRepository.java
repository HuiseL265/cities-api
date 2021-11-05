package com.github.vitorper.citiesapi.countries.repository;

import com.github.vitorper.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
