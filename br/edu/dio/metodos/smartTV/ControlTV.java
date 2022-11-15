package br.edu.dio.metodos.smartTV;

public class ControlTV {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        // Commands Remote Control:
        // Power_ON/OFF, Channel_Set/UP/Down, Volume_Up/Down
        // Status_Ok/Volume

        smartTV.Power_ON();
        smartTV.Volume_Up();
        smartTV.Volume_Up();
        smartTV.Volume_Down();
        smartTV.Channel_Up();
        smartTV.Channel_Down();
        smartTV.Channel_Set();

    }
}