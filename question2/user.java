package question2;

public class user {
    String firstname;
    String lastname;
    int age;
    int phoneNumber;
  user(String firstname,String lastname,int age,int phoneNumber){
      this.firstname=firstname;
      this.lastname=lastname;
      this.age=age;
      this.phoneNumber=phoneNumber;
  }
   public void getUser(){
      System.out.println("firstname - "+ firstname+"lastname + "+ lastname +"age "+ age +" phonenumber "+ phoneNumber);
  }
  @Override
  public String toString(){
      return "firstname" + firstname + "lastname" + lastname +"age" + age +"phonenumber" +phoneNumber;

  }
}
