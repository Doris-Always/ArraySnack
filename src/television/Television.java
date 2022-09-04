package television;

public class Television {
    private boolean isOn;
    private int channel;

    private int volume;
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
//    public void channelIncrement(){
//        if (channel > 25){
//            channel = 0;
//        }
//         channel++;
//    }
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
        }

    }
    public int getVolume(){
        return volume;
    }

    public int decreaseVolume() {
        if (volume < 1){
            return 0;
        }
        return volume--;
    }

    public void muteTvVolume() {
       volume = 0;
    }



}
