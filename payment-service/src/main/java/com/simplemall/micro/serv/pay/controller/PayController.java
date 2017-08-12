package com.simplemall.micro.serv.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.ribbon.proxy.annotation.Http.HttpMethod;
import com.simplemall.micro.serv.pay.service.IPayService;

@RestController
@RequestMapping("/payController")
public class PayController {

	@Autowired
	IPayService payService;
	
	/**
	 * pay 
	 * 
	 * @param serialNo
	 * @param payType
	 * @return
	 */
	@RequestMapping(value = "/pay",method = RequestMethod.POST)
	public String pay(@RequestParam("serialNo") String serialNo,@RequestParam("payType") String payType ){
		return null;
	}
}
