package com.globallogic.Dto;








public class CategoryDto {


private int categoryId;
private String category;





public CategoryDto() {
	super();
	
}





public CategoryDto(int categoryId, String category) {
	super();
	this.categoryId = categoryId;
	this.category = category;
}





public int getCategoryId() {
	return categoryId;
}





public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}





public String getCategory() {
	return category;
}





public void setCategory(String category) {
	this.category = category;
}




}
