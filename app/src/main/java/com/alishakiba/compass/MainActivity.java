package com.alishakiba.compass;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.alishakiba.compass.compass.CompassManager;
import com.alishakiba.compass.qibla.QiblaCalculator;

public class MainActivity extends AppCompatActivity implements CompassManager.CompassListener {
    private CompassManager compassManager;
    private TextView infoTextView;

    // For now, use a fixed location (Sydney)
    private static final double USER_LAT = -33.8688;
    private static final double USER_LON = 151.2093;
    private double qiblaDirection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        infoTextView = new TextView(this);
        infoTextView.setTextSize(24);
        infoTextView.setPadding(32, 32, 32, 32);

        setContentView(infoTextView);

        compassManager = new CompassManager(this, this);

        // Calculate Qibla direction once
        qiblaDirection = QiblaCalculator.calculateQiblaDirection(USER_LAT, USER_LON);
    }

    @Override
    protected void onResume() {
        super.onResume();
        compassManager.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        compassManager.stop();
    }

    @Override
    public void onNewAzimuth(final float azimuth) {
        runOnUiThread(() -> infoTextView.setText(
            String.format("Heading: %.1f°\nQibla: %.1f°", azimuth, qiblaDirection)
        ));
    }
}
