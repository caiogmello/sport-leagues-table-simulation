public class Main {
    public static void main(String[] args) {
        League<FootballTeam> footballLeague = new League<>("Brasileirao");

        FootballTeam vasco = new FootballTeam("Vasco da Gama");
        FootballTeam flamengo = new FootballTeam("Flamengo");
        FootballTeam bahia = new FootballTeam("Bahia");
        FootballTeam vitoria = new FootballTeam("Vitoria");
        FootballTeam corinthians = new FootballTeam("Corinthians");
        FootballTeam palmeiras = new FootballTeam("Palmeiras");
        FootballTeam saopaulo = new FootballTeam("São Paulo");
        FootballTeam fluminense = new FootballTeam("Fluminense");

        System.out.println();

        footballLeague.addTeam(vasco);
        footballLeague.addTeam(flamengo);
        footballLeague.addTeam(bahia);
        footballLeague.addTeam(vitoria);
        footballLeague.addTeam(corinthians);
        footballLeague.addTeam(palmeiras);
        footballLeague.addTeam(saopaulo);
        footballLeague.addTeam(fluminense);

        System.out.println();

        vasco.playGame(flamengo, 2, 0);
        bahia.playGame(vitoria, 3, 1);
        corinthians.playGame(palmeiras, 2, 1);
        saopaulo.playGame(fluminense, 0, 2);

        flamengo.playGame(corinthians, 1, 3);
        vitoria.playGame(saopaulo, 0, 4);
        palmeiras.playGame(bahia, 3, 1);
        fluminense.playGame(bahia, 2,1);


        footballLeague.showLeagueTable();

        League<BasketballTeam> basketballLeague = new League<>("NBA");

        BasketballTeam lakers = new BasketballTeam("LA Lakers");
        BasketballTeam thunder = new BasketballTeam("OKC Thunder");
        BasketballTeam warriors = new BasketballTeam("GS Warriors");
        BasketballTeam wizards = new BasketballTeam("Washington Wizards");
        BasketballTeam bucks = new BasketballTeam("Milwaukee Bucks");
        BasketballTeam heat = new BasketballTeam("Miami Heat");
        BasketballTeam mavericks = new BasketballTeam("Dallas Mavericks");
        BasketballTeam rockets = new BasketballTeam("Houston Rockets");

        System.out.println();

        basketballLeague.addTeam(lakers);
        basketballLeague.addTeam(thunder);
        basketballLeague.addTeam(warriors);
        basketballLeague.addTeam(wizards);
        basketballLeague.addTeam(bucks);
        basketballLeague.addTeam(heat);
        basketballLeague.addTeam(mavericks);
        basketballLeague.addTeam(rockets);

        System.out.println();

        lakers.playGame(rockets, 102, 93);
        thunder.playGame(mavericks, 93, 121);
        warriors.playGame(heat, 103, 103);
        wizards.playGame(bucks, 101, 99);

        heat.playGame(lakers, 83, 112);
        bucks.playGame(thunder, 65, 84);
        mavericks.playGame(warriors, 102, 94);
        rockets.playGame(wizards, 123,87);


        basketballLeague.showLeagueTable();


    }
}