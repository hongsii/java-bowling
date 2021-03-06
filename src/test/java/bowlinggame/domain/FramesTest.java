package bowlinggame.domain;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import bowlinggame.domain.frame.FrameNumber;
import bowlinggame.domain.frame.Frames;
import bowlinggame.domain.frame.NormalFrame;
import bowlinggame.domain.frame.state.Strike;
import org.junit.Test;

public class FramesTest {

	@Test
	public void 프레임_진행확인() {
		Frames frames = new Frames(asList(
			new NormalFrame(FrameNumber.first())
		));
		assertThat(frames.isFrameOver(FrameNumber.of(1))).isFalse();
	}

	@Test
	public void 프레임_종료확인() {
		Frames frames = new Frames(asList(
				new NormalFrame(FrameNumber.first(), new Strike())
		));
		assertThat(frames.isFrameOver(FrameNumber.of(1))).isTrue();
	}
}