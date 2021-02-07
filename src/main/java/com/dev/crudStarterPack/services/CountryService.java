package com.dev.crudStarterPack.services;

import com.dev.crudStarterPack.dto.CountryDTO;
import com.dev.crudStarterPack.model.Country;

import java.util.List;

public interface CountryService {
    List<CountryDTO> getCountries();
}
