import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CardManage {
    private Map<Integer,Card> cardList=new TreeMap<>();
    public void addNewCard(Card card){
        int key=card.getStudentId();
        cardList.put(key,card);
    }
    public void displayByStudentById(int studentID){
        Card card=cardList.get(studentID);
        if (card==null) System.err.println("id is invalid");
        else System.out.println(card);
    }
    public String StudentReturnBook(String lasOfMonth){
        String result="";
        Set<Integer> keyList=cardList.keySet();
        for (Integer key:keyList) {
            Card card=cardList.get(key);
            if (card.getEndDay().equals(lasOfMonth)){
                result+= card.toString();
            }
        }
        return result;
    }
}
