public class ZombiePlant {
    private int potencyNeeded;
    private int treatmentsNeeded;

    public ZombiePlant(int potencyNeeded, int treatmentsNeeded){
        this.treatmentsNeeded = treatmentsNeeded;
        this.potencyNeeded = potencyNeeded;
    }

    public int getPotency(){
        return potencyNeeded;
    }

    public int treatmentsNeeded(){
        return treatmentsNeeded;
    }

    public boolean isDangerous(){
        return treatmentsNeeded > 0;
    }

    public void treat(int potency){
        if (potency == 0 || potency < 0){
            treatmentsNeeded = treatmentsNeeded;
        }
        else if (potency <= potencyNeeded){
            if (treatmentsNeeded == 0){
                treatmentsNeeded = 0;
            }
            else{
                treatmentsNeeded = treatmentsNeeded -1;
            }
        }
        else if (potency > potencyNeeded){
            treatmentsNeeded = treatmentsNeeded +1;
        }
    }
}
