package com.api.service;

import com.api.entity.FileDB;
import com.api.helper.Helper;
import com.api.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public void save(MultipartFile file) {

        try {
            List<FileDB> products = Helper.convertExcelToListOfProduct(file.getInputStream());
            this.productRepo.saveAll(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<FileDB> getAllProducts() {
        return productRepo.findAll();
    }
    
    public FileDB getById(String serialnumber) {
		return productRepo.findById(serialnumber).get();
	}

	public FileDB updateProduct(FileDB file ) {
		return productRepo.save(file);
	}




	

	

	

	

	

	
    
     


}
