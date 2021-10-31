package FootPlayersAPI.Repository;

import FootPlayersAPI.Entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerInfoRepository extends MongoRepository<Player,String> {
}
