package org.iii.tw.mysevers;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private MediaPlayer mp;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        Log.d("brad","onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        Log.d("brad","onStartCommand");

        mp = MediaPlayer.create(this,R.raw.Tony);

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
//        Log.d("brad","onDestroy");

        if (mp != null){
            if (mp.isPlaying() ){
                mp.stop();
            }
            mp.release();
            mp = null;
        }
    }
}
