package live;

import music.Playable;
import music.string.*;
import music.wind.*;
public class Test {
	public static void main(String args[])
	{
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		Playable p1=new Veena();
		Playable p2=new Saxophone();
		p1.play();
		p2.play();
	}

}
