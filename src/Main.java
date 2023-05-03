import java.util.Scanner;
//şimdide abstract sınıf kullanrark geliştirilmiş hali yer alıyor
abstract class MusicPlayer {
    public void playMusic(String parça) {

    }

    public void saveMusic(){


    }

    public void stopMusic(){

    }


}


class androidMusicPlayer extends MusicPlayer{
    @Override
    public void playMusic(String parça) {
        super.playMusic(parça);System.out.println("Ekrana müzik çalıyor");
    }

    @Override
    public void saveMusic() {
        super.saveMusic();System.out.println("Ekrana Andorid için müzik kayıt edildi");
    }

    @Override
    public void stopMusic() {
        super.stopMusic();System.out.println("Ekrana Andorid için müzik durduruldu");
    }
}


class DesktopMusicPlayer extends MusicPlayer{
    @Override
    public void playMusic(String parça) {
        super.playMusic(parça);System.out.println("Ekrana müzik çalıyor");
    }

    @Override
    public void saveMusic() {
        super.saveMusic();System.out.println("Ekrana Desktop için müzik kayıt edildi");
    }

    @Override
    public void stopMusic() {
        super.stopMusic();System.out.println("Ekrana Desktop için müzik durduruldu");
    }
}










public class Main {

    public static void musicplayermenu(){
        System.out.println("hangi ciahzı kullanıyorassunuz?Android için 1 ,destop için 2 yi tuşlayınız.");

    }


    public static void main(String[] args) {
        androidMusicPlayer amp=new androidMusicPlayer();
        DesktopMusicPlayer dmp=new DesktopMusicPlayer();
        int ikincikarar;
        String parca;
        Scanner scanner=new Scanner(System.in);

        int i=0;
        while (i==0){
            musicplayermenu();

            int hangicihaz=scanner.nextInt();

            if(hangicihaz==1||hangicihaz==2) {
                switch (hangicihaz) {
                    case 1:
                        System.out.println("hangi parcayı calmak istersiniz?");
                        parca = scanner.next();
                        amp.playMusic(parca);
                        System.out.println("muzik durdurmak için 1'e\nmüziği kaaaydetmek için 2'ye bas");
                        ikincikarar = scanner.nextInt();
                        if (ikincikarar == 1 || ikincikarar == 2) {
                            switch (ikincikarar) {
                                case 1:
                                    amp.stopMusic();
                                    break;
                                case 2:
                                    amp.saveMusic();
                            }
                        }
                    case 2:
                        System.out.println("hangi parcayı calmak istersiniz?");
                        parca = scanner.next();
                        dmp.playMusic(parca);
                        System.out.println("muzik durdurmak için 1'e\nmüziği kaaaydetmek için 2'ye bas");
                        ikincikarar = scanner.nextInt();
                        if (ikincikarar == 1 || ikincikarar == 2) {
                            switch (ikincikarar) {
                                case 1:
                                    dmp.stopMusic();
                                    break;
                                case 2:
                                    dmp.saveMusic();
                            }
                        }
                }
            }
            else{
                System.out.println("lutfe gecerli bir sayı girin");
            }

        }


    }

}
