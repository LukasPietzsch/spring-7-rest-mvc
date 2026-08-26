package guru.springframework.spring7restmvc.bootstrap;

import guru.springframework.spring7restmvc.repositories.BeerRepository;
import guru.springframework.spring7restmvc.repositories.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class RestMVCBootstrapTest {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private BeerRepository beerRepository;

    RestMVCBootstrap restMVCBootstrap;

    @BeforeEach
    public void setup() {
        restMVCBootstrap = new RestMVCBootstrap(customerRepository, beerRepository);
        restMVCBootstrap.run();
    }

    @Test
    void testDummyDataCreation(){
        assertThat(customerRepository.count()).isEqualTo(3);
        assertThat(beerRepository.count()).isEqualTo(3);
    }
}
