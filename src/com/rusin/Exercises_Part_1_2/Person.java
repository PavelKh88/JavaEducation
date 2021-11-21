package com.rusin.Exercises_Part_1_2;

public class Person {
    //FirstName/////////////////////////////
   private String firstName;

   public void setFirstName (String userFirstName){
       firstName = userFirstName;
   }
   public String getFirstName () {
       return firstName;
   }
   //Second name////////////////////////////
   private String secondName;

   public void setSecondName (String userSecondName){
       secondName = userSecondName;
   }
   public String getSecondName(){
       return secondName;
   }
   //Date of birsday////////////////////////
    private String dateOfBirsday;

   public void setDateOfBirsday (String userDateOfBirsday){
       dateOfBirsday = userDateOfBirsday;
   }
   public String getDateOfBirsday(){
       return dateOfBirsday;
   }
    //Current age//////////////////////////
    private int currentAge;

   public void setCurrentAge(int userCurrentAge){
           currentAge = userCurrentAge;
   }
   public int getCurrentAge(){
       return currentAge;
   }
    //Living Address///////////////////////
    private String livingAddress;

    public void setLivingAddress(String userLivingAddress){
            livingAddress = userLivingAddress;
    }
    public String getLivingAddress(){
        return livingAddress;
    }
    //Sex//////////////////////////////////
    private String sex;

    public void setSex(String usersex) {
        sex = usersex;
    }
    public String getSex(){
        return sex;
    }
    //Profession//////////////////////////
    private String profession;

    public void setProfession(String userProfession){
        profession = userProfession;
    }
    public String getProfession(){
        return profession;
    }
    //is married/////////////////////////
    private String married;

    public void setMarried(String userMarried){
        married = userMarried;
    }
    public String getMarried(){
        return married;
    }
    //amount of children////////////////
    private int childrens;

    public void setChildrens(int userChildrens){
        childrens = userChildrens;
    }
    public int getChildrens(){
        return childrens;
    }
}
