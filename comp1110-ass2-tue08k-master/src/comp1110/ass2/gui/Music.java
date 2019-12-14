package comp1110.ass2.gui;

import java.io.File;

import javafx.scene.media.AudioClip;

/*
 * class name:Peg
 * Author name;Le fang
 * Ideas:This class contain 3 different musics this game will use
 * */

public class Music {
    private static final String URL_BASE = "assets/";
    private static final String m_URL = Board.class.getResource(URL_BASE + "start.mp3").toString();
    private static final String suc_URL = Board.class.getResource(URL_BASE + "success.mp3").toString();
    private static final String hint_URL = Board.class.getResource(URL_BASE + "hint.mp3").toString();
    private static final String putSuccess_URL = Board.class.getResource(URL_BASE + "putSuccess.mp3").toString();
    private static final String fail_URL = Board.class.getResource(URL_BASE + "fail.mp3").toString();


    private static AudioClip hint = new AudioClip(hint_URL);
    private static AudioClip start = new AudioClip(m_URL);
    private static AudioClip success = new AudioClip(suc_URL);
    private static AudioClip putsuccess = new AudioClip(putSuccess_URL);
    private static AudioClip fail = new AudioClip(fail_URL);

    public static void playStartMusic() {
        start.play();
    }

    public static void stopStartMusic() {
        start.stop();
    }

    public static void playSuccessMusic() {
        success.play();
    }

    public static void stopSuccessMusic() {
        success.stop();
    }

    public static void playHintMusic() {
        hint.play();
    }

    public static void PutsuccessMusic() {
        putsuccess.play();
    }

    public static void PutfailMusic() {
        fail.play();
    }

}


