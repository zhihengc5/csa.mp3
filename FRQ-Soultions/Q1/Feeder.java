public class feeder{
  private int currentFood; 

  public feeder(int n){
    currentFood=n;
  }


  public void simulateOneDay(int numBirds){
    int f= (int)((Math.random()*41)+10);
    int chance=(int)((Math.random()*100)+1);
    if(chance>5){
      if(numBirds*f>currentFood){
        currentFood=0;
      }else{
        currentFood-=numBirds*f; 
      }
    }else{
      currentFood =0; 
    }
  }


  public int simulateManyDays(int numBirds, int numDays){
    int count=0; 
    while(currentFood>0&&count!=numDays){
      simulateOneDay(numBirds);
      count++;
    }
    return count; 
  }
}
