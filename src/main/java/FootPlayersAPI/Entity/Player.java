package FootPlayersAPI.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Players")
public class Player {
    @Id
    private String id;
    private String name;
    private String position;
    private String dateOfBirth;
    private int currentAge;
    private String nationality;
    private int titles;
    private String clubLegend;
    private int shirtNumber;
    Statistics statistics;

    public Player( String name, String position, String dateOfBirth,
                   int currentAge, String nationality, int titles, String clubLegend, int shirtNumber,Statistics statistics) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.currentAge = currentAge;
        this.nationality = nationality;
        this.titles = titles;
        this.clubLegend = clubLegend;
        this.shirtNumber = shirtNumber;
        this.statistics = statistics;
    }

    public Player(String name, String position, int currentAge, String nationality, String clubLegend, int shirtNumber,Statistics statistics) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.currentAge = currentAge;
        this.nationality = nationality;
        this.clubLegend = clubLegend;
        this.shirtNumber = shirtNumber;
        this.statistics = statistics;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getTitles() {
        return titles;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    public String getClubLegend() {
        return clubLegend;
    }

    public void setClubLegend(String clubLegend) {
        this.clubLegend = clubLegend;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }
}
