package Low_Level.Real_Scanerio.TrafficSignal;

public class TrafficLight {
    
    private TrafficLightState state;

    public TrafficLight(){
        this.state = new RedState();
    }

    public void setState(TrafficLightState state){
        this.state = state;
    }

    public void change(){
        state.action(this);
    }
}
