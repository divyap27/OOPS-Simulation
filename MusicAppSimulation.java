interface Playable {
    void play();
}

abstract class Instrument implements Playable {
    void tune() {
        System.out.println("Instrument is being tuned");
    }
    
    
    public void play() {
        // Optionally, you can add default behavior here.
    }

    
    abstract void repair();
}

final class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing music");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the Guitar");
    }
}

public class MusicAppSimulation {
    public static void main(String[] args) {
        
        Guitar guitar = new Guitar();
        
        
        guitar.tune();
        guitar.play();
        guitar.repair();
    }
}
