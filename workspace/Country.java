public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String imageFile;

  // add constructors
  public Country(String name, String capital, String language, String imageFile){
    name=this.name;
    capital=this.capital;
    language=this.language;
    imageFile=this.imageFile;
  }
  // Write accessor/get methods for each instance variable that returns it.
  public String getName(){
    return this.name;
  }
  public String getCapital(){
    return this.capital;
  }
  public String getLanguage(){
    return this.language;
  }
  public String getImageFile(){
    return this.imageFile;
  }
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 public toString(){
  System.out.println(getName()+" capital is "+getCapital()+" and its primary language is"+getLanguage());
 }


  
}