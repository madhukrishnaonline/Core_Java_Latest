package com.accenture.coding.football;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FootBallTeam {
	private String teamName;
	private String country;
	private Integer noOfGoals;
}
