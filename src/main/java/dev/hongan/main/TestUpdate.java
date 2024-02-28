package dev.hongan.main;

import dev.hongan.dao.ProductDAOImpl;

public class TestUpdate {
	public static void main(String[] args) {
		Product p = new ProductDAOImpl().getProductById("P005");
		p.setMaSP("P005");
		p.setTenSanPham("Kệ đựng giày");
		p.setAnhSanPham("P005.jpg");	
		p.setSoLuong(150);
		p.setDonGia(5990000d);
		
		boolean flag = new ProductDAOImpl().updateProduct(p);
		if(flag==true) {
			System.out.println("Sửa dữ liệu thành công!");
		}else {
			System.out.println("lỗi sửa sản phẩm");
		}
}

}