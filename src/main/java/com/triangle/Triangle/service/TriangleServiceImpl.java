package com.triangle.Triangle.service;

import java.util.List;

public class TriangleServiceImpl implements TriangleService {
	
	public static String EQUILATERAL = "Equilateral";
	public static String ISOSCELES = "Isosceles";
	public static String SCALENE = "Scalene";

	@Override
	public String getType(List<String> sizes) {
		
		String type = "";
		
		if (!sizes.isEmpty()) {
			
			if (sizes.get(0).equalsIgnoreCase(sizes.get(1))
					&& sizes.get(1).equalsIgnoreCase(sizes.get(2)) ) {
				type = EQUILATERAL;
			}
			if (sizes.get(0).equalsIgnoreCase(sizes.get(1)) && !sizes.get(1).equalsIgnoreCase(sizes.get(2))
					|| sizes.get(0).equalsIgnoreCase(sizes.get(2)) && !sizes.get(1).equalsIgnoreCase(sizes.get(2))
					|| sizes.get(1).equalsIgnoreCase(sizes.get(2)) && !sizes.get(1).equalsIgnoreCase(sizes.get(0))) {
				type = ISOSCELES;
			}
			
			if (!sizes.get(0).equalsIgnoreCase(sizes.get(1))
					&& !sizes.get(0).equalsIgnoreCase(sizes.get(2))
					&& !sizes.get(1).equalsIgnoreCase(sizes.get(2))) {
				type = SCALENE;
			}
			
		}
		
		return type;
	}

}
