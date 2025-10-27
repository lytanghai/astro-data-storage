package com.astro_data_storage.repository;

import com.astro_data_storage.entity.CryptoHoldingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAssetRepo extends JpaRepository<CryptoHoldingModel, Integer> {
}
