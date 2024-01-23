package com.example.datajpamapping.repository;

import com.example.datajpamapping.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Address, Long> {
}
