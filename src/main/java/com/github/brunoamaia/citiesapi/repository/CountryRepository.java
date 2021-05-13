package com.github.brunoamaia.citiesapi.repository;

import com.github.brunoamaia.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
