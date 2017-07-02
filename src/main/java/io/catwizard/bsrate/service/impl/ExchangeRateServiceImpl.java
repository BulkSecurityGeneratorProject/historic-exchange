package io.catwizard.bsrate.service.impl;

import io.catwizard.bsrate.service.ExchangeRateService;
import io.catwizard.bsrate.domain.ExchangeRate;
import io.catwizard.bsrate.repository.ExchangeRateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Service Implementation for managing ExchangeRate.
 */
@Service
@Transactional
public class ExchangeRateServiceImpl implements ExchangeRateService{

    private final Logger log = LoggerFactory.getLogger(ExchangeRateServiceImpl.class);

    private final ExchangeRateRepository exchangeRateRepository;

    public ExchangeRateServiceImpl(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

    /**
     * Save a exchangeRate.
     *
     * @param exchangeRate the entity to save
     * @return the persisted entity
     */
    @Override
    public ExchangeRate save(ExchangeRate exchangeRate) {
        log.debug("Request to save ExchangeRate : {}", exchangeRate);
        return exchangeRateRepository.save(exchangeRate);
    }

    /**
     *  Get all the exchangeRates.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<ExchangeRate> findAll(Pageable pageable) {
        log.debug("Request to get all ExchangeRates");
        return exchangeRateRepository.findAll(pageable);
    }

    /**
     *  Get one exchangeRate by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public ExchangeRate findOne(Long id) {
        log.debug("Request to get ExchangeRate : {}", id);
        return exchangeRateRepository.findOne(id);
    }

    /**
     *  Delete the  exchangeRate by id.
     *
     *  @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete ExchangeRate : {}", id);
        exchangeRateRepository.delete(id);
    }
}
