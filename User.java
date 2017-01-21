public class User{
  private String userName;
  private String password;
  private int height;
  private int weight;
  
  public void User(String userName, String password, int height, int weight){
    this.userName = userName;
    this.password = password;
    this.height = height;
    this.weight = weight;
  }

  public void setWeight(int weight){
    this.weight = weight;
  }
  
  public void setHeight(int height){
    this.height = height;
  }
  public void changePassword(String Password){
    this.password = password;
  }
}
