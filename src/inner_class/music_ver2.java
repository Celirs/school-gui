package inner_class;

import javax.sound.midi.*;

public class music_ver2 implements ControllerEventListener {
	static music_ver2 mini;
	public static void main(String[] args) {
		mini = new music_ver2();
		mini.go();
	}
	public void go() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			int[] eventsIWant = { 0, 1,127 };
			sequencer.addControllerEventListener(mini, eventsIWant);
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			for (int i = 5; i < 60; i += 4) {
				track.add(makeEvent(144, 1, i, 100, i));

				track.add(makeEvent(176, 1, 100, 0, i));// we insert our OWN ControllerEvent(176 says the event type is
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
	public void controlChange(ShortMessage event) {
		if (event.getData1() == 127)
			System.out.println("la");
		else
			System.out.println("l0");

	}
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
} // close class
