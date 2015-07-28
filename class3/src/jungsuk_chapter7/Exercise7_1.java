package jungsuk_chapter7;

import java.util.Random;

class SutdaDeck 
{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() 
	{
		boolean yesKwang = true;
		boolean isKwang;
		for(int i=0, num=1; i<cards.length; i++, num++)
		{
			isKwang = false;
			if(yesKwang && (num==1 || num==3 || num==8))
			{
				isKwang = true;
			}
			
			cards[i] = new SutdaCard(num, isKwang);
			
			if(num==10)
			{
				num = 0;
				yesKwang = false;
			}
		}
	}
	
	public void shuffle()
	{
	    int index;
	    SutdaCard temp;
	    Random random = new Random();
	    for (int i = cards.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = cards[index];
	        cards[index] = cards[i];
	        cards[i] = temp;
	    }
	}
	
	public SutdaCard pick()
	{
		int i = (int) (Math.random() * (cards.length + 1));
		return cards[i];
	}
	
	public SutdaCard pick(int i)
	{
		return cards[i];
	}
}

class SutdaCard 
{ 
	final int num;
	final boolean isKwang;
	
	SutdaCard() 
	{ 
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) 
	{ 
		this.num = num;
		this.isKwang = isKwang; 
	}
	
	// info()대신 Object클래스의 toString()을 오버라이딩했다. 
	public String toString() 
	{
		return num + ( isKwang ? "K":""); 
	}
}

public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i < deck.cards.length;i++) 
			System.out.print(deck.cards[i].toString()+",");
	}
}
