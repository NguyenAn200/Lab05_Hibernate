package dev.hongan.dao;

import java.util.List;

import dev.hongan.entity.ProductSp;
public interface  ProductDao {
	public List<Product> getAllProduct() {
	public Product getProductSPById(String id);
	public boolean insertProductSP(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(String id);
}
}