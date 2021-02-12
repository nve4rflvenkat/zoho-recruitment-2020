public class WordPattern{

     public static void main(String []args){
       String inputStr="water";
       int stringLength = inputStr.length() ;
       int middle = stringLength/2 ;
      String str="",str2="";
     
     
     //post letter pattern
       StringBuilder sb = new StringBuilder();
       for(int i=middle;i<stringLength;i++){
             char a= inputStr.charAt(i);
             sb.append(a);
             sb.append(" ");
             str=sb.toString();
             System.out.println(str);
       }
       
       //pre letter pattern
        StringBuilder pre=new StringBuilder();
        for(int i=0;i<middle;i++){
            char b=inputStr.charAt(i);
            pre.append(b);
            pre.append(" ");
            str2=pre.toString();
            System.out.println(str.concat(str2));
        }
         }
}
