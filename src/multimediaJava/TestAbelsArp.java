package multimediaJava;

import org.jfugue.player.Player;

public class TestAbelsArp {
	// Passar-ho a pentatonica ...
	
	private void testBook1(Player player){
		
		 player.play("C");
		 player.play("C7h");
		 player.play("C5maj7w");
		 player.play("G5h+B5h+C6q_D6q");
		 player.play("G5q G5q F5q E5q D5h");
		 player.play("T[Allegro] V0 I0 G6q A5q V1 A5q G6q");
		 player.play("V0 Cmajw V1 I[Flute] G4q E4q C4q E4q");
		 player.play("T120 V0 I[Piano] G5q G5q V9 [Hand_Clap]q Rq"); 
	}
	
	public static void main(String[] args) {

		// DO RE MI FA SOL LA SI
		//  C  D  E  F  G   A  B
		System.out.println("Inici ...");
		/*
		 Notas:si re mi-do# la-si re fa#-fa# sol la-sol# fa# mi-fa#
		 Notas: si re mi-do# la-si re fa#-mi re do#-do# si la–Si
		 
        Notas:la si la sol# fa#-sol# la si la si la sol# fa#-
		Notas: re mi re mi re do# re mi
		
		Notas:la si la sol# fa#- sol# la  si la si la sol# fa#
		Notas: re mi re mi re mi re do# re mi
		Notas: si re mi - do# la- si re fa#- fa# sol la- sol# fa# mi - fa#
		Notas:si re mi-do# la-si re fa#-mi re do#-do# si la – si

		Linthesia
		https://sourceforge.net/projects/linthesia/
		(clon synthesia)
		p.ex) 
		https://www.youtube.com/watch?v=zsWBbma6i5Q
		 */
		Player player = new Player();
		//player.play("C D E F G A B");
		player.play("B D E A D E D C B A B");
		
	}

}
