package my.examples.shoppingmall.controller;

import lombok.RequiredArgsConstructor;
import my.examples.shoppingmall.domain.Account;
import my.examples.shoppingmall.domain.FileImage;
import my.examples.shoppingmall.domain.Product;
import my.examples.shoppingmall.service.AccountService;
import my.examples.shoppingmall.service.FileImageService;
import my.examples.shoppingmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final AccountService accountService;
    private final ProductService productService;
    private final FileImageService fileImageService;

    @GetMapping("/main")
    public String main(Model model){

        List<Product> products = productService.findAllProduct();
        for(Product list : products){
            System.out.println(list.toString());
        }
        model.addAttribute("products",products);
        return "index";
    }
}
