 package com.rt.shop.entity.query;
 
 import org.springframework.web.servlet.ModelAndView;

import com.rt.shop.query.QueryObject;
 
 public class FavorableGoodsQueryObject extends QueryObject
 {
   public FavorableGoodsQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public FavorableGoodsQueryObject()
   {
   }
 }



 
 