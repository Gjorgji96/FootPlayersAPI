package FootPlayersAPI.Entity;

public class Statistics {

        private int gamesPlayed;
        private int goals;
        private int assists;
        private double passes;
        private int chancesCreated;
        private double tackles;
        private int cleanSheets;
        private int goalsConceded;
        private double saves;
        private int yellowCards;
        private int redCards;

        public Statistics(int gamesPlayed, int goals, int assists, double passes, int chancesCreated, double tackles, int cleanSheets, int goalsConceded, double saves, int yellowCards, int redCards) {
                this.gamesPlayed = gamesPlayed;
                this.goals = goals;
                this.assists = assists;
                this.passes = passes;
                this.chancesCreated = chancesCreated;
                this.tackles = tackles;
                this.cleanSheets = cleanSheets;
                this.goalsConceded = goalsConceded;
                this.saves = saves;
                this.yellowCards = yellowCards;
                this.redCards = redCards;
        }

        public Statistics(int gamesPlayed, int goals, int assists, double passes, int chancesCreated, int yellowCards, int redCards) {
                this.gamesPlayed = gamesPlayed;
                this.goals = goals;
                this.assists = assists;
                this.passes = passes;
                this.chancesCreated = chancesCreated;
                this.yellowCards = yellowCards;
                this.redCards = redCards;
        }

        public Statistics(int gamesPlayed, int goals, double tackles, int cleanSheets, int yellowCards, int redCards) {
                this.gamesPlayed = gamesPlayed;
                this.goals = goals;
                this.tackles = tackles;
                this.cleanSheets = cleanSheets;
                this.yellowCards = yellowCards;
                this.redCards = redCards;
        }

        public Statistics(int gamesPlayed, int cleanSheets, int goalsConceded, double saves, int yellowCards, int redCards) {
                this.gamesPlayed = gamesPlayed;
                this.cleanSheets = cleanSheets;
                this.goalsConceded = goalsConceded;
                this.saves = saves;
                this.yellowCards = yellowCards;
                this.redCards = redCards;
        }

        public int getGamesPlayed() {
                return gamesPlayed;
        }

        public void setGamesPlayed(int gamesPlayed) {
                this.gamesPlayed = gamesPlayed;
        }

        public int getGoals() {
                return goals;
        }

        public void setGoals(int goals) {
                this.goals = goals;
        }

        public int getAssists() {
                return assists;
        }

        public void setAssists(int assists) {
                this.assists = assists;
        }

        public double getPasses() {
                return passes;
        }

        public void setPasses(double passes) {
                this.passes = passes;
        }

        public int getChancesCreated() {
                return chancesCreated;
        }

        public void setChancesCreated(int chancesCreated) {
                this.chancesCreated = chancesCreated;
        }

        public double getTackles() {
                return tackles;
        }

        public void setTackles(double tackles) {
                this.tackles = tackles;
        }

        public int getCleanSheets() {
                return cleanSheets;
        }

        public void setCleanSheets(int cleanSheets) {
                this.cleanSheets = cleanSheets;
        }

        public int getGoalsConceded() {
                return goalsConceded;
        }

        public void setGoalsConceded(int goalsConceded) {
                this.goalsConceded = goalsConceded;
        }

        public double getSaves() {
                return saves;
        }

        public void setSaves(double saves) {
                this.saves = saves;
        }

        public int getYellowCards() {
                return yellowCards;
        }

        public void setYellowCards(int yellowCards) {
                this.yellowCards = yellowCards;
        }

        public int getRedCards() {
                return redCards;
        }

        public void setRedCards(int redCards) {
                this.redCards = redCards;
        }

        public String attackerToString() {
                return "Statistics{" +
                        "gamesPlayed=" + gamesPlayed +
                        ", goals=" + goals +
                        ", assists=" + assists +
                        ", passes=" + passes +
                        ", chancesCreated=" + chancesCreated +
                        ", yellowCards=" + yellowCards +
                        ", redCards=" + redCards +
                        '}';
        }



        public String defendertoString() {
                return "Statistics{" +
                        "gamesPlayed=" + gamesPlayed +
                        ", goals=" + goals +
                        ", assists=" + assists +
                        ", tackles=" + tackles +
                        ", cleanSheets=" + cleanSheets +
                        ", yellowCards=" + yellowCards +
                        ", redCards=" + redCards +
                        '}';
        }

        public String gKtoString() {
                return "Statistics{" +
                        "gamesPlayed=" + gamesPlayed +
                        ", cleanSheets=" + cleanSheets +
                        ", goalsConceded=" + goalsConceded +
                        ", saves=" + saves +
                        ", yellowCards=" + yellowCards +
                        ", redCards=" + redCards +
                        '}';
        }
}
