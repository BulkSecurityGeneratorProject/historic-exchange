package io.catwizard.bsrate.service;

import io.catwizard.bsrate.domain.ExchangeRate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing ExchangeRate.
 */
public interface ExchangeRateService {

    /**
     * Save a exchangeRate.
     *
     * @param exchangeRate the entity to save
     * @return the persisted entity
     */
    ExchangeRate save(ExchangeRate exchangeRate);

    /**
     *  Get all the exchangeRates.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<ExchangeRate> findAll(Pageable pageable);

    /**
     *  Get the "id" exchangeRate.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    ExchangeRate findOne(Long id);

    /**
     *  Delete the "id" exchangeRate.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
