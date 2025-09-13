package BatchProcessingNew;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class client {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("/Users/apple/IdeaProjects/HibernateProject/src/main/java/BatchProcessingNew/ClubGames.csv"));
            String Line=br.readLine();

            Configuration cfg=new Configuration().configure();
            cfg.addAnnotatedClass(BatchProcessingNew.ClubGames.class);
            SessionFactory factory=cfg.buildSessionFactory();
            Session session=factory.openSession();
            Transaction txn=session.beginTransaction();

            int batchSize=30;
            int count=0;

            while((Line=br.readLine())!=null){
                String[] line=Line.split(",");
                ClubGames clubGames=new ClubGames();
                clubGames.setGame_id(line[0]);
                clubGames.setClub_id(line[1]);

                if(line[2].isEmpty()) clubGames.setOwn_goals(0);
                else clubGames.setOwn_goals(Integer.parseInt(line[2]));

                clubGames.setOwn_position(line[3]);
                clubGames.setOwn_manager_name(line[4]);
                clubGames.setOpponent_id(line[5]);

                if(line[6].isEmpty()) clubGames.setOpponent_goals(0);
                else clubGames.setOpponent_goals(Integer.parseInt(line[6]));

                clubGames.setOpponent_position(line[7]);
                clubGames.setOpponent_manager_name(line[8]);
                clubGames.setHosting(line[9]);
                clubGames.setIs_win(Boolean.parseBoolean(line[10]));

                session.persist(clubGames);

                if(++count%batchSize==0){
                    session.flush();
                    session.clear();
                }
            }

            txn.commit();
            session.close();
            br.close();
        } catch ( IOException e) {
            throw new RuntimeException(e);
        }
        }
    }

