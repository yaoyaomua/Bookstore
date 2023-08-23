package com.bookstore.service.impl;

import org.springframework.stereotype.Service;

import com.bookstore.model.ShippingAddress;
import com.bookstore.model.UserShipping;
import com.bookstore.service.ShippingAddressService;

@Service
public class ShippingAddressServiceImpl implements ShippingAddressService {

	@Override
	public ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress) {
		//what we do is use this userShipping to return the Shipping name and
		//then we gonna return the shipping name and set the name to our shipping address
		//and then to this to the other fields as well
		shippingAddress.setShippingAddressName(userShipping.getUserShippingName());
		shippingAddress.setShippingAddressStreet1(userShipping.getUserShippingStreet1());
		shippingAddress.setShippingAddressStreet2(userShipping.getUserShippingStreet2());
		shippingAddress.setShippingAddressCity(userShipping.getUserShippingCity());
		shippingAddress.setShippingAddressCounty(userShipping.getUserShippingCounty());
		shippingAddress.setShippingAddressCountry(userShipping.getUserShippingCountry());
		shippingAddress.setShippingAddressZipcode(userShipping.getUserShippingZipcode());
		
		
		return shippingAddress;
	}

}
