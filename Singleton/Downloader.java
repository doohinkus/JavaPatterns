package Singleton;


public class Downloader {

    private static Downloader downloader = new Downloader();
    private Downloader(){

    }
    public void startDownload(){
        System.out.println("Start download...");
    }
    public static Downloader getInstance(){
        return Downloader.downloader;
    }
}
