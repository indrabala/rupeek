package Scripts;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.EndPoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 extends BaseTest implements EndPoints{
	
   @Test
   public void geTUsers()
   {
	 RestAssured.given().auth().preemptive(). basic("rupeek","password").when().get("baseURI"+"GET_ALL_Users").then().log().all();
	 
   }
   @Test
   public void getAParticularUser()
   {
	  String phnno="9998989878" ;
	  RestAssured.given().auth().preemptive(). basic("rupeek","password").when().get("baseURI"+"GET_ALL_Users"+"phnno").then().log().all();
	  
		 
	   
	   
	   
   }
   
	 
	 
	
	
	  
	  
	   
	   
	   
	   
	   
	   
	   
   

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


