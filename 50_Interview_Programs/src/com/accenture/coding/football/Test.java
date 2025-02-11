package com.accenture.coding.football;

import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/*
		 * Print the Winning Team of a Football Match
		*Problem Statement:
		*Given the number of teams and their goals, find the team with the maximum number of goals.
		 */
		/*
		 * Famous Football Teams and Their Maximum Goal Records
		FC Barcelona (Spain)
		Record: FC Barcelona scored 120 goals in the 2011-2012 La Liga season.
		Notable Achievement: Barcelona, led by Lionel Messi, had an exceptional scoring record in domestic competitions.

		Real Madrid (Spain)
		Record: Real Madrid scored 121 goals in the 2014-2015 La Liga season.
		Notable Achievement: Real Madrid has also achieved high goal tallies in various seasons across different competitions.
		
		Bayern Munich (Germany)
		Record: Bayern Munich scored 101 goals in the 2012-2013 Bundesliga season.
		Notable Achievement: Bayern Munich's dominance in the Bundesliga often sees high goal-scoring seasons.

		Manchester City (England)
		Record: Manchester City scored 106 goals in the 2017-2018 Premier League season.
		Notable Achievement: City’s attacking prowess under Pep Guardiola has set several records in the Premier League.

		Liverpool FC (England)
		Record: Liverpool scored 101 goals in the 2017-2018 Premier League season.
		Notable Achievement: Liverpool’s attacking teams have historically been prolific.

		Juventus FC (Italy)
		Record: Juventus scored 89 goals in the 2018-2019 Serie A season.
		Notable Achievement: Juventus has consistently been one of the top teams in Italy, known for both strong defensive
		 and attacking capabilities.

		Paris Saint-Germain (PSG) (France)
		Record: PSG scored 108 goals in the 2017-2018 Ligue 1 season.
		Notable Achievement: PSG has been a dominant force in French football, particularly with high goal-scoring records in domestic competitions.

		AC Milan (Italy)
		Record: AC Milan scored 87 goals in the 1992-1993 Serie A season.
		Notable Achievement: AC Milan has a rich history in European and Italian football.
		
		General Notes
		Top Scorers in Individual Competitions: For instance, Lionel Messi and Cristiano Ronaldo have set records for the most goals in a single calendar year or season.
		International Tournaments: Records can vary in different tournaments like the UEFA Champions League, where high-scoring seasons are often celebrated.
		 */
		FootBallTeam team1 = new FootBallTeam("Juventus","Italy",89);
		FootBallTeam team2 = new FootBallTeam("AC Milan","Europe",87);
		FootBallTeam team3 = new FootBallTeam("PSG","France",108);
		FootBallTeam team4 = new FootBallTeam("LiverPool","England",101);
		FootBallTeam team5 = new FootBallTeam("Barcelona","Spain",120);
		FootBallTeam team6 = new FootBallTeam("Real Madrid","Spain",121);
		FootBallTeam team7 = new FootBallTeam("Bayern Munich","Germany",101);
		FootBallTeam team8 = new FootBallTeam("Manchester","England",106);
		
		List<FootBallTeam> list = List.of(team1,team2,team3,team4,team5,team6,team7,team8);
		FootBallTeam footBallTeam = list.stream().max(Comparator.comparing(FootBallTeam::getNoOfGoals)).get();
		System.out.println(footBallTeam);
	}// main
}// class