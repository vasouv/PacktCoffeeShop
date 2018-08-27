package io.github.vasouv.customer.rest;

import io.github.vasouv.customer.entity.Customer;
import io.github.vasouv.customer.service.CustomerService;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author vasouv
 */
@Path("customers")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    private CustomerService customerService;

    @GET
    public Response getCustomers() {
        List<Customer> customers = customerService.findCustomers();
        GenericEntity<List<Customer>> list = new GenericEntity<List<Customer>>(customers) {};
        return Response.ok(list).build();
    }

    @POST
    public Response createCustomer(Customer newCustomer) {
        Customer created = customerService.createCustomer(newCustomer);
        return Response.ok(created).build();
    }

}
