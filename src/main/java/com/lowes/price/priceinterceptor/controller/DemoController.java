/* ***************************************************************************
    Copyright (C) Lowe's Companies, Inc.  All rights reserved.
    This file is for internal use only at Lowe's Companies, Inc.
   ***************************************************************************/
package com.lowes.price.priceinterceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shrkumar
 *
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
