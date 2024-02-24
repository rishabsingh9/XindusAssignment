package com.xindus.wishlistmanagement.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import  com.xindus.wishlistmanagement.Model.User;


public class WishListItem {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    private String itemName;

	    private String itemdescription;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User User;


}
