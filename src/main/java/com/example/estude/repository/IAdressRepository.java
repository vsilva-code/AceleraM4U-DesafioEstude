package com.example.estude.repository;

import com.example.estude.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdressRepository extends JpaRepository<Adress, Integer> {
}
