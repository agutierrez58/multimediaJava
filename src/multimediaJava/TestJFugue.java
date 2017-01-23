package multimediaJava;

import org.jfugue.player.Player;

/*
 * https://github.com/dmkoelle/jfugue
 * 
 * Mirror of subversion repository: JFugue - Java API for Music Programming http://code.google.com/p/jfugue/
 * 
 * */
public class TestJFugue {
	public static void main(String[] args) {
		System.out.println("Inici ...");
		Player player = new Player();
		player.play("C D E F G A B");
		System.out.println("... Fi");
	}
}
