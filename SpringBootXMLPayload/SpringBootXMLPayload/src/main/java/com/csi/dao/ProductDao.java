package com.csi.dao;

import com.csi.model.Product;

import java.util.List;

public interface ProductDao {

    public void saveData(Product product);

    List<Product> getAllData();

    public void updateData(int productId,Product product);

    public void deleteData(int productId);
}
