package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Flat;

@Repository
public interface FlatRepository extends JpaRepository<Flat, Integer> {

	@Query("select f from Flat f where f.price<?1")
	public List<Flat> findFlatByPriceLessThan(Integer price);

	@Query("select f from Flat f where f.price<=?1")
	public List<Flat> findFlatByPriceLessThanEqualTo(int price);

	@Query("select f from Flat f where f.price > ?1")
	public List<Flat> findFlatByPriceGreaterThan(int price);

	@Query("select f from Flat f where f.price >=?1 AND f.price <=?2")
	public List<Flat> findFlatByPriceBetween(int s_price,int e_price);
}
