package org.example.parejas;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.multiplayer.Participant;

import java.util.ArrayList;

/**
 * Created by josealbertomartinfalcon on 14/7/17.
 */

public class Partida {
    public static int FILAS = -1;
    public static int COLUMNAS = -1;
    public static int[][] casillas;
    public static int turno;
    public static int puntosJ1;
    public static int puntosJ2;
    public static String tipoPartida = "LOCAL";
    public static GoogleApiClient mGoogleApiClient;
    String mRoomId = null;
    ArrayList<Participant> mParticipants = null;
    String mMyId = null;
    final static int RC_WAITING_ROOM = 10002;
    int jugadorLocal = 1;
}
