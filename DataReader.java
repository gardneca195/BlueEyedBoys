public class DataReader{
    private Scanner sc = new Scanner(new File("User.data");

    public static boolean doesUserExist(String userName){
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            if(data.contains(userName)
               return true;
        }
        return false;
    }
               
    public static String validateID(String userName, String Password){
       while(sc.hasNextLine()){
           String data = sc.nextLine();
           if(data.contiains(userName){
               if(data.contains(password){
                   return true;
               }
           }
           return false;
    }

}
