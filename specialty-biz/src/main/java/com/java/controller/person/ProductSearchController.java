package com.java.controller.person;

import com.java.model.ProductSearch;
import com.java.service.service.ProductSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by hudiao on 2017/4/2.
 */
@Controller
@RequestMapping(value = "/search")
public class ProductSearchController {
    @Autowired
    private ProductSearchService productSearchService;
    @RequestMapping(value = {"/toedit"},method = RequestMethod.POST)
    public  String toedit(ProductSearch productSearch, Model model, HttpServletRequest request, HttpServletResponse response){
       List<ProductSearch> productSearchList = productSearchService.find(productSearch);
        return "home/search";
    }
}
