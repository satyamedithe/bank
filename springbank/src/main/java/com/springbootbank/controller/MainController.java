package com.springbootbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbootbank.entity.CustomerEntity;
import com.springbootbank.exception.BankTransactionException;
import com.springbootbank.exception.RecordNotFoundException;
import com.springbootbank.model.BankAccountInfo;
import com.springbootbank.model.SendMoneyForm;
import com.springbootbank.repository.BankAccountDAO;
import com.springbootbank.service.CustomerService;

@Controller
public class MainController {
	
	
	@Autowired
	CustomerService customerService;

	@Autowired
	private BankAccountDAO bankAccountDAO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showBankAccounts(Model model) {
		List<BankAccountInfo> list = bankAccountDAO.listBankAccountInfo();

		model.addAttribute("accountInfos", list);

		return "accountsPage";
	}
	
	@RequestMapping("/customerInfo")
	public String getAllCustomers(Model model) 
	{
		List<CustomerEntity> list = customerService.getAllCustomers();

		model.addAttribute("customers", list);
		return "list-customers";
	}
	
	@RequestMapping(path = {"/edit", "/edit/{id}"})
	public String editCustomerById(Model model, @PathVariable("id") Optional<Long> id) 
							throws RecordNotFoundException 
	{
		if (id.isPresent()) {
			CustomerEntity entity = customerService.getCustomerById(id.get());
			model.addAttribute("customer", entity);
		} else {
			model.addAttribute("customer", new CustomerEntity());
		}
		return "add-edit-customer";
	}
	
	@RequestMapping(path = "/createCustomer", method = RequestMethod.POST)
	public String createOrUpdateCustomer(CustomerEntity customer) 
	{
		try {
			
		customerService.saveOrUpdate(customer);
		}catch(Exception ex){
			System.out.println(ex);
		}
		return "redirect:/customerInfo";
	
	}

	@RequestMapping(value = "/sendMoney", method = RequestMethod.GET)
	public String viewSendMoneyPage(Model model) {

		SendMoneyForm form = new SendMoneyForm(1L, 2L, 700d);

		model.addAttribute("sendMoneyForm", form);

		return "sendMoneyPage";
	}

	@RequestMapping(value = "/sendMoney", method = RequestMethod.POST)
	public String processSendMoney(Model model, SendMoneyForm sendMoneyForm) {

		System.out.println("Send Money: " + sendMoneyForm.getAmount());

		try {
			bankAccountDAO.sendMoney(sendMoneyForm.getFromAccountId(), //
					sendMoneyForm.getToAccountId(), //
					sendMoneyForm.getAmount());
		} catch (BankTransactionException e) {
			model.addAttribute("errorMessage", "Error: " + e.getMessage());
			return "/sendMoneyPage";
		}
		
		return "redirect:/";
	}
	

}
