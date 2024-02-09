package com.example.SpringToElastic.Repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.SpringToElastic.model.Elastic;

public interface ElasticRepository extends ElasticsearchRepository<Elastic,String>{

}
