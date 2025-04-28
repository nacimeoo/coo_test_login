import thermos.Thermostat;

public class ThermostatAdapter implements Peripherique{
    private Thermostat thermostat;

    public ThermostatAdapter(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void allumer (){
        thermostat.monterTemperature();
    }

    public void eteindre(){
        thermostat.baisserTemperature();
    }


}
