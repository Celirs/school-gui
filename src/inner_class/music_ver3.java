package inner_class;

import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class music_ver3 {
	static JFrame f = new JFrame("My First Music Video");
	static music_ver3 mini;
	public static void main(String[] args) {
		mini = new music_ver3();
		mini.go();
	}

	public void go() {
		MyDrawPanel a = new MyDrawPanel();
		f.setContentPane(a);
		f.setBounds(30, 30, 300, 300);
		f.setVisible(true);
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			int[] eventsIWant = { 127 };
			sequencer.addControllerEventListener(a, eventsIWant);
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			for (int i = 5; i < 60; i += 4) {
				track.add(makeEvent(144, 1, i, 100, i));

				track.add(makeEvent(176, 1, 127, 0, i));// we insert our OWN ControllerEvent(176 says the event type is
														// ControllerEvent)
														// MIDI controller number 127
				track.add(makeEvent(128, 1, i, 100, i + 2));
			} // end loop
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // close

	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);

		} catch (Exception e) {
		}
		return event;
	}

	class MyDrawPanel extends JPanel implements ControllerEventListener {

		public void controlChange(ShortMessage event) {
			/*repaint();*/
			Graphics g ;
			g = this.getGraphics();
			paintComponent(g);
			
		}

		public void paintComponent(Graphics g) {
				int r = (int) (Math.random() * 250);
				int gr = (int) (Math.random() * 250);
				int b = (int) (Math.random() * 250);
				g.setColor(new Color(r, gr, b));
				int ht = (int) ((Math.random() * 120) + 10);
				int width = (int) ((Math.random() * 120) + 10);
				int x = (int) ((Math.random() * 40) + 10);
				int y = (int) ((Math.random() * 40) + 10);

				g.fillRect(x, y, ht, width);
		
			 // close if
		} // close method
	} // close inner class
}
