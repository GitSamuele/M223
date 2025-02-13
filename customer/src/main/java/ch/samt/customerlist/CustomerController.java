package ch.samt.customerlist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


// http://127.0.0.1:8000/customers invece di http://127.0.0.1:8000
@RequestMapping("/customers")
@Controller
public class CustomerController {

    ArrayList<Customer> customers = new ArrayList<>();

    @GetMapping
    public String home(Model model) {
        model.addAttribute("customer", new Customer());
        return "home";
    }

    @PostMapping("/insert")
    public String saveCustomer(@ModelAttribute Customer customer){
        customers.add(customer);
        return "redirect:/customers/customerList";
    }

    @GetMapping("/customerList")
    public String loadCustomers(Model model) {
        // passa l'arraylist customers come customersArraylist
        model.addAttribute("customersArraylist", customers);
        return "customerList";
    }

    /*
    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable("id") String userId) {
        return "User ID: " + userId;
    }
    */

}