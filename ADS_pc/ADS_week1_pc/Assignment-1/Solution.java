

import java.util.LinkedList;
import java.util.Scanner;


class AddLargeNumbers {
    
    	   
    public static LinkedList numberToDigits(String number) {
    	LinkedList ll = new LinkedList();
    	char [] num =number.toCharArray();
    	for(int i =num.length-1; i>=0;i--)
    	{
    		int k = Character.getNumericValue(num[i]);
    		ll.push(k);
    	}
    	return ll;
    }

    public static String digitsToNumber(LinkedList list) {
    	String k="";
    	while(!list.isEmpty())
    	{
    		k=k+list.peek();
    		list.pop();
    	}
    	return k;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	LinkedList ll1 = new LinkedList();
    	while((!list1.isEmpty())||(!list2.isEmpty()))
    	{
    		if((int)ll1.peek()==0)
    		{
    			ll1.push((int)list1.peekLast()+(int)list2.peekLast());
    			list1.pop();
    			list2.pop();
    		}
    		else
    		{
    			ll1.push((int)list1.peekLast()+(int)list2.peekLast()+1);
    			list1.pop();
    			list2.pop();
    		}
    	}
    			return ll1;
    }
}


class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
}
