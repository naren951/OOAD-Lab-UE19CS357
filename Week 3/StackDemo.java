import java.util.*;

class StackDemo {
	public static void main(String[] args) {
		Pile stack = new Pile();
		int ch;
		System.out.println("enter your choice 1. place 2.draw 3.peek 4. exit");
		Scanner input = new Scanner(System.in);
		ch = input.nextInt();
		do
		{	switch(ch)
			{
				case 1: System.out.println("enter the card suit and card value");
						String suit = input.next();
						String value = input.next();
						Card c = new Card(suit, value);	
						stack.place(c);
						break;
				case 2: Card d = stack.draw();
						if(d.value != null)	
						System.out.println("Card Drawn:" + d.display());break;
				case 3:	stack.peek();break;
				default: System.exit(0);
			}
			System.out.println("enter your choice 1. place 2.draw 3.peek 4. exit");
			ch = input.nextInt();
		}while(ch<4);
	}
}

class Pile{
    Card[] cards = new Card[10];
    int top = -1;
    void place(Card c){
        if(top == 9){
            System.out.println("Stack Overflow");
        }
        else{
        cards[++top]=c;
        }
    }
    Card draw(){
        if(top == -1){
            return new Card("Null","Null");
        }
        return cards[top--];
    }
    void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else
            System.out.println(cards[top].value+" "+cards[top].suit);
    }
}

class Card{
    String suit,value;
    Card(String suit,String value){
        this.suit = suit;
        this.value = value;
    }

    String display(){
        return value+" "+suit;
    }
}