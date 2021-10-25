package com.example.moviemvcservice.service;

import com.example.moviemvcservice.models.CatalogItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @Autowired
    private RestTemplate restTemplate;

    public CatalogItem show(Long id) {
        return  restTemplate.getForObject("http://localhost:8087/movieCatalog/" + id , CatalogItem.class);
    }
}
