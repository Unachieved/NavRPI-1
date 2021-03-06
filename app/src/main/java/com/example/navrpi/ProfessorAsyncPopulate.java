package com.example.navrpi;

import android.os.AsyncTask;

public class ProfessorAsyncPopulate extends AsyncTask<Void, Void, Void> {

    private final ProfessorDao pDao;

    ProfessorAsyncPopulate(ProfessorDatabase db) {
        pDao = db.professorDao();
    }

    @Override
    protected Void doInBackground(final Void... params){
        pDao.deleteAll(); //clear anything that's somehow already there (Room can crash if we try inserting the same thing twice)
        pDao.insert(new Professor("Michael", "Aldersley", "Walker3950550"));
        pDao.insert(new Professor("Alex", "Ma", "Walker3450200"));
        return null;
    }
}
