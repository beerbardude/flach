package org.pain.flach;

import android.content.Context;
import android.os.AsyncTask;
import android.telephony.SubscriptionManager;
import android.widget.Toast;

import java.util.List;

public class SubscriptionTask extends AsyncTask<Integer, String, String> {

    @Override
    protected String doInBackground(Integer... intParams) {
        // Die doInBackground() Methode wird im Hintergrund-Thread ausgeführt
        // und führt die zeitaufwendigen Aufgaben durch.
        int quotesCount = intParams[0];
        String newQuoteList = null;

        // Mit publishProgress() kann von hier der Fortschritt durchgegeben werden.
        publishProgress("Es wurden bereits 5 Zitate geladen.");

        // Das Ergebnis der Berechnungen wird zurückgegeben und kann in der
        // onPostExecute() Methode, die im UI-Thread läuft, weiterverwendet werden
        return newQuoteList;
    }

    @Override
    protected void onProgressUpdate(String... stringParams) {
        // Die onProgressUpdate() Methode wird im UI-Thread ausgeführt.
        // Auf dem Bildschirm wird eine Statusmeldung ausgegeben, immer wenn
        // publishProgress() von doInBackground() aufgerufen wird.
        String message = stringParams[0];
        //Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPostExecute(String receivedQuoteList) {
        // Die onPostExecute() Methode wird im UI-Thread ausgeführt.
        // Das Ergebnis von doInBackground() wird hier weiterverwendet, es steht
        // als Parameter zur Verfügung.
        //updateListView(receivedQuoteList);
    }


}
