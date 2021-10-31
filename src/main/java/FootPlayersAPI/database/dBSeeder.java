package FootPlayersAPI.database;

import FootPlayersAPI.Entity.Player;
import FootPlayersAPI.Entity.Statistics;
import FootPlayersAPI.Repository.PlayerInfoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class dBSeeder implements CommandLineRunner {

            private PlayerInfoRepository playerInfoRepository;
    public dBSeeder(PlayerInfoRepository playerInfoRepository){ this.playerInfoRepository =playerInfoRepository;}


    @Override
    public void run(String... args) throws Exception {

            Player theGreatestOfAllTime = new Player(
                    "Lionel Messi",
                    "Attack(Right Winger)",
                    "24.06.1987",
                    34,
                    "Argentina",
                    34,
                    "Barcelona",
                    10,
                    new Statistics(
                            844,
                            711,
                            300,
                            92.5,
                            923,
                            68,
                            3
                    )

            );
            Player elPistolero = new Player(
                    "Luis Suarez",
                    "Center Forward",
                    "24.01.1987",
                    34,
                    "Uruguay",
                    19,
                    "Liverpool,Barcelona",
                    9,
                    new Statistics(
                            664,
                            429,
                            239,
                            83.2,
                            320,
                            147,
                            2

                    )
            );
                this.playerInfoRepository.deleteAll();
                this.playerInfoRepository.save(theGreatestOfAllTime);
                this.playerInfoRepository.save(elPistolero);
    }
}
