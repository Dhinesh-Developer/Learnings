package Low_Level.Real_Scanerio.TrafficSignal;

public interface TrafficLightState {
    void action(TrafficLight signal);
}

class RedState implements TrafficLightState{
    @Override
    public void action(TrafficLight signal){
        signal.setState(new GreenState());
    }
}

class GreenState implements TrafficLightState{
    @Override
    public void action(TrafficLight signal){
        signal.setState(new YellowState());
    }
}

class YellowState implements TrafficLightState{
    @Override
    public void action(TrafficLight signal){
        signal.setState(new RedState());
    }
}


