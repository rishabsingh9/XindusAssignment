package com.xindus.wishlistmanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xindus.wishlistmanagement.Model.WishListItem;
import com.xindus.wishlistmanagement.Repository.MyUserRepository;
import com.xindus.wishlistmanagement.Repository.wishListFeatureRepository;

public class WishListFeatureService {
	private wishListFeatureRepository wishListRepository;


	    @Autowired
	    private MyUserRepository myUserRepository;

	public WishListItem addWishListItem(WishListItem wishListItem) {
		// TODO Auto-generated method stub
		 return wishListRepository.save(wishListItem);
	}
	
	   
}
