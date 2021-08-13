package io.raman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.raman.model.Address;

public interface AddressRepository extends JpaRepository<Address, String>{

}
