package com.api.controller;

import com.api.entity.FileDB;
import com.api.helper.Helper;
import com.api.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @PostMapping("/product/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (Helper.checkExcelFormat(file)) {
            //true

            this.productService.save(file);

            return ResponseEntity.ok("Excel file is uploaded successfully");

        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file");
    }


    @GetMapping("/product")
    public List<FileDB> getAllProduct() {
        return this.productService.getAllProducts();
    }
    
    @GetMapping("/product/{serialnumber}")
    public FileDB getById(@PathVariable("serialnumber") String serialnumber) {
        return productService.getById(serialnumber);
    }

     @PutMapping("/update")
     public FileDB updateProduct(@RequestBody FileDB file) {
    	return  productService.updateProduct(file);
     }

}
