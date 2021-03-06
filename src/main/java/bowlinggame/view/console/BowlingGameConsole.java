package bowlinggame.view.console;

import bowlinggame.domain.BowlingGame;
import bowlinggame.domain.frame.FrameNumber;

public class BowlingGameConsole {

	public static void main(String[] args) {
		String playerName = InputView.inputPlayerName();
		BowlingGame bowlingGame = new BowlingGame(playerName);

		FrameNumber frameNumber = bowlingGame.getCurrentFrameNumber();
		while (!bowlingGame.isGameOver()) {
			ResultView.printResult(bowlingGame.result());
			bowlingGame.play(InputView.inputKnockDownPickCount(frameNumber));
			frameNumber = bowlingGame.getCurrentFrameNumber();
		}
		ResultView.printResult(bowlingGame.result());
	}
}
