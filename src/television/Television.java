package television;

public class Television {
    private boolean isOn;
    private int channel;

    private int volume;

    private boolean isMute;

    private int tempVolume;
    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {

        isOn = true;

    }

    public void turnOff() {
        isOn = false;
    }

    public void setTvChannel(int channel) {
       if(isOn)this.channel = channel;


    }
    public int getChannel() {
        return channel;
    }

    public void increaseTvChannel() {
            if(isOn && channel < 25){
                channel++;
            }else {
                channel = 0;
            }


    }

    public void decreaseTvChannel() {
        if (isOn && channel < 1){
            channel = 0;
        }else {
            channel--;
        }


    }


    public void increaseVolume() {
        if (volume < 30){
              volume++;
              tempVolume++;
        }

    }
    public int getVolume(){
        return volume;
    }

    public void decreaseVolume() {
        if (volume < 30){
            volume--;
            tempVolume--;
        }
         volume = 0;

    }
    public void muteControl(){
        if (!isMute)muteTv();
        else UnMuteTv();
    }
    public void muteTv(){
        if (!isMute){
            isMute = true;
            volume = 0;
        }
    }

    public void UnMuteTv(){
        isMute = false;
        volume = tempVolume;
    }
//    public void muteTvVolume() {
//       else {
//
//        }
//
//    }



}
