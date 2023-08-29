interface play {
    default void playmusic(){
        System.out.println("play music buddy");
    }
}
class MP3Player implements play{
    @Override
    public void playmusic() {
        play.super.playmusic();
        System.out.println("this is mp3");
    }
}
