package com.kt.java.project.phoneshop_springboot.util;

import com.kt.java.project.phoneshop_springboot.dto.BrandDTO;
import com.kt.java.project.phoneshop_springboot.entity.Brand;

public class Mapper {
	
	public static Brand toBrand(BrandDTO brandDTO) {
		Brand brand = new Brand();
		brand.setName(brandDTO.getName());
		return brand;
	}
	
	public static BrandDTO toBrandDTO(Brand brand) {
		BrandDTO brandDTO = new BrandDTO();
		brandDTO.setName(brand.getName());
		return brandDTO;
	}
}
