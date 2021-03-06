package com.gec.books.service;

import com.gec.books.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing Book.
 */
public interface BookService {

    /**
     * Save a book.
     *
     * @param book the entity to save
     * @return the persisted entity
     */
    Book save(Book book);

    /**
     *  Get all the books.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<Book> findAll(Pageable pageable);

    /**
     *  Get the "id" book.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    Book findOne(Long id);

    /**
     *  Delete the "id" book.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the book corresponding to the query.
     *
     *  @param query the query of the search
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<Book> search(String query, Pageable pageable);
}
