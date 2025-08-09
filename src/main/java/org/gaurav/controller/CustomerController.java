package org.gaurav.controller;

import org.gaurav.model.Customer;
import org.gaurav.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService service;

    @GetMapping("/list")
    public String listAllCustomers(Model model) {

        List<Customer> customers=service.getAllCustomers();
        //customers.forEach(System.out::println);
        model.addAttribute("customers", customers);
        return "listOfCustomers";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(@ModelAttribute("cuto") Customer customer) {

        return "customer-form";


    }


    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {

        service.saveCustomer(customer);
        return "redirect:/customer/list";



    }

    @PostMapping("/showFormForUpdate")
    public String  showFormForUpdate(@RequestParam Integer customerId,Model model) {


        Customer customer=service.getCustomer(customerId);
        model.addAttribute("cuto", customer);

        return "customer-form";
    }

    @PostMapping("/showFormForDelete")
    public String showFormForDelete(@RequestParam Integer customerId) {
        service.deleteCustomer(customerId);
        return "redirect:/customer/list";
    }




}
