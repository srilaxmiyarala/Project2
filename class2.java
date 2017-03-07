package project1;

public enum class2 {
	sri("bunny", "24"),
	laxmi("minni", "21"),
	yarala("pavani","22"),
	Bhavani("sweety", "23");
	
	private final String desc;
	private final String year;
	
	class2(String description, String byear){
	desc=description;
	year=byear;
}

public String getDesc(){
	return desc;
}

public String getyear(){
	return year;
}
}
