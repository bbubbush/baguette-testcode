package com.github.fourteam.pikachu.week1.junwoo.spring.domain;

import com.github.fourteam.pikachu.week1.junwoo.spring.dto.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project : pikachu
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 4:54 오후
 */
@Repository
public interface CustomerRepository {
    List<Customer> findAll();

    Customer findById(final String id);
}
