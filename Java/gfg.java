public class gfg {
    class Solution {

        public boolean isValid(String str) {
            // Write your code here
            String[] strb=str.split("");
            int count=0;
            int sum=0;
            boolean res=true;
            
            if(str.length()>15) return false;
            
            for(int i=0;i<str.length();i++){
                    if(strb[i]=="."){
                        count++;
                    }
                    else{
                        sum+=Integer.parseInt(strb[i]);
                    }
                    
                }
                if(count!=3||Integer.parseInt(strb[0])<0||Integer.parseInt(strb[0])>2||strb[0]==".")return false;
        }
    }
}
