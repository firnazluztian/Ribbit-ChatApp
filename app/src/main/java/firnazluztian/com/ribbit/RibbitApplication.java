package firnazluztian.com.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by firnaz luztian on 9/29/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "gHF9FdXvYpfRwiTYhncKyuJQLCsPZDmrSBo6rXo8", "FFqe5yqWqOyQMjyLPf9Pqa1Yg8tnSA581kJGWTDt");


    }
}

