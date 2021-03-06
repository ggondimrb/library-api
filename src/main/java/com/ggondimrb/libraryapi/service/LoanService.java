package com.ggondimrb.libraryapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ggondimrb.libraryapi.api.dto.LoanFilterDTO;
import com.ggondimrb.libraryapi.entity.Book;
import com.ggondimrb.libraryapi.entity.Loan;

public interface LoanService {

	Loan save(Loan loan);

	Optional<Loan> getById(Long id);

	Loan update(Loan loan);

	Page<Loan> find(LoanFilterDTO filter, Pageable pageable);

	Page<Loan> getLoansByBook(Book book, Pageable pageable);
	
	List<Loan> getAllLateLoans();
}
