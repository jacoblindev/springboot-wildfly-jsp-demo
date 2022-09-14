package ai.chat.wildflydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ai.chat.wildflydemo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
