/*Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"*/

public class strings {


    public static String startOz(String str){
        if (str.startsWith("oz")) {
           // System.out.println("oz");
              return "oz"  ;  
        } else if (str.charAt(0) == 'o') {
           
            //System.out.println("o");
                    return "o";
        } else if (str.length() > 1 && str.charAt(1) == 'z') {
          return "z";
           // System.out.println("z");
        } else {
           return "";
           // System.out.println("");
        }
      
    }
    public static void main(String[] args) {
      //  startOz("ozymandias");
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }

}
