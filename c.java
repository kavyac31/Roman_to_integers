class Solution {
    public int romanToInt(String s) {
        int i,n,r=0;
        n=s.length();    
        if(s.charAt(0)=='I'){
                r+=1;
            }
        if(s.charAt(0)=='V'){
                r+=5;
            }
        if(s.charAt(0)=='X'){
                r+=10;
            }
        if(s.charAt(0)=='L'){
                r+=50;
            }
        if(s.charAt(0)=='C'){
                r+=100;
            }
        if(s.charAt(0)=='D'){
                r+=500;
            }
        if(s.charAt(0)=='M'){
                r+=1000;
            }    
        for(i=1;i<n;i++){
           if(s.charAt(i)=='I'){
                r+=1;
            }
            if(s.charAt(i)=='V'){
                r+=5;
            }
            if(s.charAt(i)=='X'){
                r+=10;
            }
            if(s.charAt(i)=='L'){
                r+=50;
            }
            if(s.charAt(i)=='C'){
                r+=100;
            }
            if(s.charAt(i)=='D'){
                r+=500;
            }
            if(s.charAt(i)=='M'){
                r+=1000;
            }
           if(s.charAt(i)=='V' || s.charAt(i)=='X'){
               if(s.charAt(i-1)=='I'){
                   r-=2*1 ;
               }
           }
           if(s.charAt(i)=='L' || s.charAt(i)=='C'){
               if(s.charAt(i-1)=='X'){
                   r-=2*10;
               }
           }
           if(s.charAt(i)=='D' || s.charAt(i)=='M'){
               if(s.charAt(i-1)=='C'){
                   r-=2*100;
               }
           }
        }
        return(r);   
    }
}