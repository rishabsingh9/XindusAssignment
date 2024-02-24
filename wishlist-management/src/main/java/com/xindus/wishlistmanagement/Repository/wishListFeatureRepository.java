package com.xindus.wishlistmanagement.Repository;
import  com.xindus.wishlistmanagement.Model.User;
import com.xindus.wishlistmanagement.Model.WishListItem;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface wishListFeatureRepository extends JpaRepository<Item,Integer>{
List<Item> findByMyUser(User user);

}
