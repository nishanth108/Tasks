    package com.xworkz.inheritence.typeCasting;

    import com.xworkz.inheritence.inner.Apple;
    import com.xworkz.inheritence.inner.Athlete;
    import com.xworkz.inheritence.inner.Fruit;
    import com.xworkz.inheritence.inner.SoccerPlayer;

    public class SocerRunner7 {

            public void info(Athlete athlete) {
                if (athlete!=null) {
                    athlete.physique();
                    athlete.position();
                    athlete.position();
                    athlete.salary();

                    if (athlete instanceof SoccerPlayer) {
                        SoccerPlayer soccerPlayer = (SoccerPlayer) athlete;
                        soccerPlayer.shoot();
                    }
                }
            }

        }
