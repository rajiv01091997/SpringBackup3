package com.globallogic.problem1;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getQuantity()-o2.getQuantity();
	}

}
