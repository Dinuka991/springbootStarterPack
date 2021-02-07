package com.dev.crudStarterPack.services.impl;

import com.dev.crudStarterPack.dto.CountryDTO;
import com.dev.crudStarterPack.dto.ModelMapper;
import com.dev.crudStarterPack.model.Address;
import com.dev.crudStarterPack.model.Country;
import com.dev.crudStarterPack.repository.CountryRepository;
import com.dev.crudStarterPack.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

public class CountryServiceImpl implements CountryService {

    private  final ModelMapper modelMapper;
    private  final CountryRepository countryRepository;

    @Override
    public List<CountryDTO> getCountries() {

        List<Country> countries = countryRepository.findAll();
        return modelMapper.countryListToCountryDTOList(countries);

    }
}
