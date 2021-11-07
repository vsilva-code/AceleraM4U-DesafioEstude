package com.example.estude.repository;

import com.example.estude.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAddressRepository extends JpaRepository<Address, Integer> {
    List<Address> findByNameContaining (Integer id);
}
