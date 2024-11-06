package com.example.Electronics.repository;

import com.example.Electronics.entity.Electronics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectronicsRepository extends JpaRepository<Electronics,Integer> {

}
