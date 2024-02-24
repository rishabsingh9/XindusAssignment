package com.xindus.wishlistmanagement.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.xindus.wishlistmanagement.Model.WishListItem;
import com.xindus.wishlistmanagement.Service.WishListFeatureService;

public class WishListFeatureController {
	 private WishListFeatureService wishListService;



	    @PostMapping("/wishlistMyUser/item")
	    public WishListItem addWishListItem(@RequestBody WishListItem wishListItem){
	        return wishListService.addWishListItem(wishListItem);
	    }


}
