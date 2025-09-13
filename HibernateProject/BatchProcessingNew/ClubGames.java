package BatchProcessingNew;

import jakarta.persistence.*;

@Entity
public class ClubGames {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String game_id;
    private String club_id;
    private int own_goals;

    @Column(nullable = false)
    private String own_position;
    private String own_manager_name;
    private String opponent_id;
    private int opponent_goals;

    @Column(nullable = false)
    private String opponent_position;
    private String opponent_manager_name;
    private String hosting;
    private Boolean is_win;

    public int getId() {
        return id;
    }

    public String getGame_id() {
        return game_id;
    }

    public void setGame_id(String game_id) {
        this.game_id = game_id;
    }

    public Boolean getIs_win() {
        return is_win;
    }

    public void setIs_win(Boolean is_win) {
        this.is_win = is_win;
    }

    public String getHosting() {
        return hosting;
    }

    public void setHosting(String hosting) {
        this.hosting = hosting;
    }

    public String getOpponent_manager_name() {
        return opponent_manager_name;
    }

    public void setOpponent_manager_name(String opponent_manager_name) {
        this.opponent_manager_name = opponent_manager_name;
    }

    public String getOpponent_position() {
        return opponent_position;
    }

    public void setOpponent_position(String opponent_position) {
        this.opponent_position = opponent_position;
    }

    public String getOpponent_id() {
        return opponent_id;
    }

    public void setOpponent_id(String opponent_id) {
        this.opponent_id = opponent_id;
    }

    public int getOpponent_goals() {
        return opponent_goals;
    }

    public void setOpponent_goals(int opponent_goals) {
        this.opponent_goals = opponent_goals;
    }

    public String getOwn_manager_name() {
        return own_manager_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwn_manager_name(String own_manager_name) {
        this.own_manager_name = own_manager_name;
    }

    public String getOwn_position() {
        return own_position;
    }

    public void setOwn_position(String own_position) {
        this.own_position = own_position;
    }

    public int getOwn_goals() {
        return own_goals;
    }

    public void setOwn_goals(int own_goals) {
        this.own_goals = own_goals;
    }

    public String getClub_id() {
        return club_id;
    }

    public void setClub_id(String club_id) {
        this.club_id = club_id;
    }
}
