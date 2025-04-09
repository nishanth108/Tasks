package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Athlete;
import com.xworkz.inheritence.inner.AudioDevice;
import com.xworkz.inheritence.inner.SoccerPlayer;
import com.xworkz.inheritence.inner.Speaker;

public class SpeakerRunner8 {

    public void info(AudioDevice audioDevice) {
        if (audioDevice!=null) {
            audioDevice.price();
            audioDevice.name();
            audioDevice.quality();
            audioDevice.warranty();

            if (audioDevice instanceof Speaker) {
                Speaker speaker = (Speaker) audioDevice;
                speaker.brandName();
            }
        }
    }
}
