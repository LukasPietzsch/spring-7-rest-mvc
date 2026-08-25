package guru.springframework.spring7restmvc.services;

import guru.springframework.spring7restmvc.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<UUID, Customer> customers;

    public CustomerServiceImpl() {
        customers = new HashMap<>();

        UUID uuid = UUID.randomUUID();
        customers.put(uuid, Customer.builder()
                .id(uuid)
                .name("Elena Gassert")
                .version(0)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now()).build());

        uuid = UUID.randomUUID();
        customers.put(uuid, Customer.builder()
                .id(uuid)
                .name("Yanick Toulouse")
                .version(0)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now()).build());

        uuid = UUID.randomUUID();
        customers.put(uuid, Customer.builder()
                .id(uuid)
                .name("Max Huber")
                .version(0)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now()).build());
    }

    @Override
    public List<Customer> listCustomers() {
        return new ArrayList<>(this.customers.values());
    }

    @Override
    public Customer findCustomerById(UUID id) {
        return this.customers.get(id);
    }
}
