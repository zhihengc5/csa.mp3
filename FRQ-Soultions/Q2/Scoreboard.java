public class Scoreboard {
private String t1;
private String t2;
private int n1;
private int n2;
private boolean yes; 

public Scoreboard(String t, String tt){
  t1=t;
  t2=tt;
  n1=0;
  n2=0;
  yes=true; 
}

public String getScore(){
  if(yes){
    return n1+"-"+n2+"-"+t1;
  }else{
    return n1+"-"+n2+"-"+t2; 
  }
}

public void recordPlay(int num){
  if(yes){
    if(num>0){
      n1+=num;
    }else{
      yes=false; 
    }
  }else{
    if(num>0){
      n2+=num;
    }else{
      yes=true;
    }
  }
}


  
}
