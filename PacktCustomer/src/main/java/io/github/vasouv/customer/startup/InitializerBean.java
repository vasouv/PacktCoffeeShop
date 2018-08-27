package io.github.vasouv.customer.startup;

import io.github.vasouv.customer.entity.Customer;
import io.github.vasouv.customer.service.CustomerService;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author vasou
 */
@Startup
@Singleton
public class InitializerBean {

    @Inject
    private CustomerService customerService;

    @PostConstruct
    public void init() {

        Customer vasouv = new Customer("Vasilis Souvatzis", "vasilis@souvatzis.com");
        Customer john = new Customer("John Papadopoulos", "john@papadopoulos.com");

        customerService.createCustomer(vasouv);
        customerService.createCustomer(john);

    }

}
