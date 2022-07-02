package org.learn;

import org.springframework.stereotype.Component;

@Component
public class SoccerPlayer implements Sportist {

	public String playSport() {
		return "I play soccer like Messi";
	}

}
