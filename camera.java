public class camera
{
	private String specs; //attribute
	
 // constructor
 public camera (){
	 specs="44MP ois Night Selfie";
	 }
	 
//accessor
public String getSpecs(){
	return specs;
}

//mutator
public void setSpecs(String specs){
     this.specs=specs;
}

public String openCamera(){
	return"The Cellphone is capturing.";
}

public String closeCamera(){
	return"The cellphone camera is closing,";
}
}
