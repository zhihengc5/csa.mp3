import java.util.ArrayList; 
public class WordChecker{
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> x){
    wordList=x; 
  }

  public boolean isWordChain(){
    for(int i=1; i<wordList.size(); i++){
      if(((wordList.get(i)).indexOf(wordList.get(i-1)))<0){
        return false;
      }
    }
    return true; 
  }



  public ArrayList<String> createList(String target){
    ArrayList<String> newlist = new ArrayList<String>();
    for(String x : wordList){
      if(x.length()>=target.length()){
        if((x.substring(0,target.length()).equals(target))){
          newlist.add(x.substring(target.length()));
        }
      }
    }
    return newlist; 
  }
}
