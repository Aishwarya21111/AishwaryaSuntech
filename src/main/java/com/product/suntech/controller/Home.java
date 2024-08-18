//package com.product.suntech.controller;
//
//import com.product.suntech.model.Product;
//import com.product.suntech.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.Banner;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@Controller
//public  class Home {
//    @Autowired
//    ProductService service ;
//    @RequestMapping(value = {"","/","/home"})
//     public String displayHomePage(Model model){
//        return "Home.html";
//    }
//    @RequestMapping("/about")
//    public String displayAboutPage(Model model){
//        return "About.html";
//    }
//    @RequestMapping("/contact")
//    public String displayContactPage(Model model){
//        return "Contact.html";
//    }
//    @RequestMapping("/get")
//    public String displayGetPage(Model model){
//        return "Get.html";
//    }
//    @RequestMapping("/getProd")
//    public String displayGetProdPage(Model model){
//        return "display-products.html";
//    }
//    @RequestMapping("/add")
//    public String displayAddPage(Model model){
//        return "Add.html";
//    }
//    @RequestMapping("/delete")
//    public String displayDeletePage(Model model){
//        return "Delete.html";
//    }
//    @RequestMapping("/update")
//    public String displayUpdatePage(Model model){
//        return "Update.html";
//    }
//    @RequestMapping("/recommend")
//    public String displayRecommendPage(Model model){
//        return "Recommend.html";
//    }
//    @GetMapping("/getProducts")
//    public String getProducts(
//            @RequestParam(required = false) Integer prodId,
//            @RequestParam(required = false) String prodName,
//            @RequestParam(required = false) String prodtype,
//            Model model) {
//
//        List<Product> products;
//
//        if (prodId != null) {
//            products = List.of(service.getProductById(prodId));
//        } else if (prodName != null && !prodName.isEmpty()) {
//            products = List.of(service.getProductByName(prodName));
//        } else if (prodtype != null && !prodtype.isEmpty()) {
//            products = service.getProductsByType(prodtype);
//        } else {
//            products = service.getProduct();
//        }
//
//        model.addAttribute("products", products);
//        return "display-products";
//    }
//
//
//
//
//
// }
//
//
//
//
