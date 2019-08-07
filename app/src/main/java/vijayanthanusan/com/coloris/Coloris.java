package vijayanthanusan.com.coloris;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Thanusan on 18/11/2017.
 */

public class Coloris extends Activity{
    private ColorisView mColorisView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
            //initialise notre activity avec le constructeur parent
        super.onCreate(savedInstanceState);
            //charge le fichier main.xml comme vue de l'activité
        setContentView(R.layout.maincolorispuzzle);
            //recuperation de la vue une fois crée à partir de son id
        mColorisView = (ColorisView)findViewById(R.id.idMainColorisPuzzle);
            //rend visible la vue
        mColorisView.setVisibility(View.VISIBLE);

    }
}