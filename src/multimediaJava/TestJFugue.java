package multimediaJava;

import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;
import org.jfugue.pattern.Pattern;
import org.jfugue.theory.Chord;
import org.jfugue.theory.ChordProgression;
import org.jfugue.theory.Note;

/*
 * https://github.com/dmkoelle/jfugue
 * 
 * Mirror of subversion repository: JFugue - Java API for Music Programming http://code.google.com/p/jfugue/
 * 
 * La idea passar-ho a pom.xml
 * http://www.tech-recipes.com/rx/39256/add-dependencies-to-maven-pom-xml-file/
 * 
 * http://www.jfugue.org/examples.html
 * */

public class TestJFugue {
	private static void allInOne() {
		new Player().play(new ChordProgression("I IV vi V").eachChordAs("$_i $_i Ri $_i"),
				new Rhythm().addLayer("..X...X...X...XO"));
	}

	private static void introChordProgressions() {
		ChordProgression cp = new ChordProgression("I IV V");

		Chord[] chords = cp.setKey("C").getChords();
		for (Chord chord : chords) {
			System.out.print("Chord " + chord + " has these notes: ");
			Note[] notes = chord.getNotes();
			for (Note note : notes) {
				System.out.print(note + " ");
			}
			System.out.println();
		}

		Player player = new Player();
		player.play(cp);
	}

	private static void example3(Player player) {
		Pattern p1 = new Pattern("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq");
		Pattern p2 = new Pattern("V1 I[Flute] Rw     | Rw     | GmajQQQ  CmajQ");
		player.play(p1, p2);
	}

	public static void main(String[] args) {

		System.out.println("Inici ...");
		Player player = new Player();
		player.play("C D E F G A B");

		/*
		 * // Exemple 2 player.
		 * play("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq   V1 I[Flute] Rw | Rw | GmajQQQ CmajQ"
		 * );
		 * 
		 * // Exemple 3 example3(player);
		 * 
		 * // Exemple 4 example4(player);
		 */
		introChordProgressions();

		allInOne();

		System.out.println("... Fi");
	}

	private static void example4(Player player) {
		Pattern p1 = new Pattern("Eq Ch. | Eq Ch. | Dq Eq Dq Cq").setVoice(0).setInstrument("Piano");
		Pattern p2 = new Pattern("Rw     | Rw     | GmajQQQ  CmajQ").setVoice(1).setInstrument("Flute");
		player.play(p1, p2);
	}

}
